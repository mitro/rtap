import BaseRouter from './base/router';
import vent from './modules/vent';
import auth from './middlewares/auth';
import notAuth from './middlewares/not_auth';
import user from './modules/user';


class Router extends BaseRouter {
    constructor () {
        super();
    }

    middleware () {
    }
}

export default new Router();
