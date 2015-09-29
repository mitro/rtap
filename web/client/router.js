import BaseRouter from './base/router';
import vent from './modules/vent';
import currentUser from './stores/current_user';


export default class Router extends BaseRouter {
  run () {
    super.run();
  }

  middleware () {
    this.use('/', this.notAuth);
  }

  redirect () {

  }

  router () {
    this.route('/', 'welcome.index');
    this.route('/signup', 'welcome.signup');
  }
}

Router.prototype.controllers = {
  welcome: require('./controllers/welcome'),
};

Router.prototype.auth = require('./middlewares/auth');
Router.prototype.notAuth = require('./middlewares/not_auth');
