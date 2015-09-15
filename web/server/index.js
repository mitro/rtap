import config from 'config';
import domain from 'domain';
import express from 'express';
import bodyParser from 'body-parser';
import log from 'libs/logger';
import env from 'libs/env';
import morgan from 'morgan';
import errorhandler from 'errorhandler';
import middlewares from './middlewares';
import controllers from './controllers';


class Server {
    constructor () {
        this.log = log;
        this.logPrefix = 'server';
        this.app = express();
        this.app.set('view engine', 'jade');
    }

    preRouteMiddleware () {
        this.app.use((req, res, next) => {
            var _domain = domain.create();
            _domain.add(req);
            _domain.add(res);
            _domain.run(next);
            _domain.on('error', next);
        });

        this.app.use(morgan(config.debug ? 'dev' : 'combined'));

        // Set public assets.
        this.app.use(express.static('public'));

        // Create environment
        this.app.use(env.create);

        // Set language.
        this.app.use(middlewares.lang);

        // Parse application/json.
        this.app.use(bodyParser.json({ limit: 1024*1024 }));

        // Get Access token from API.
        this.app.use(middlewares.accessToken);
    }

    postRouteMiddleware () {
        if (config.debug) {
            this.app.use(errorhandler({
                dumpExceptions: true,
                showStack: true
            }));
        } else {
            this.app.use((err, req, res, next) => {
                this.log('error', err.stack || err);
                middlewares.serverError(res);
            });
        }

        this.app.use((req, res, next) => middlewares.notFound(res));
    }

    initControllers () {
        for (let Controller of controllers) {
            new Controller().use(this.app);
        }
    }

    run () {
        this.preRouteMiddleware();
        this.initControllers();
        this.postRouteMiddleware();

        this.app.set('port', config.server.port);

        this.app.listen(config.server.port, config.server.ip, () => {
            this.log('info', `server running on ${config.server.ip}:${config.server.port}`);
        });
    }
}

new Server().run();
