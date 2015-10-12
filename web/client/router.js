import BaseRouter from './base/router';
import vent from './modules/vent';
import currentUser from './stores/current_user';


export default class Router extends BaseRouter {
  run () {
    super.run();
    vent.on('user:signin', () => this.routeTo('/user'));
    vent.on('user:signout', () => this.routeTo('/'));
  }

  middleware () {
    this.use('/', this.notAuth);
  }

  redirect () {

  }

  router () {
    this.route('/', 'welcome.index');
    this.route('/signup', 'welcome.signup');
    this.route('/signin', 'welcome.signin');
    this.route('/signout', 'welcome.signout');

    this.route('/user', 'user.index');

    this.route('/violations', 'violation.index');
  }
}

Router.prototype.controllers = {
  welcome: require('./controllers/welcome'),
  user: require('./controllers/user'),
  violation: require('./controllers/violation'),
};

Router.prototype.auth = require('./middlewares/auth');
Router.prototype.notAuth = require('./middlewares/not_auth');
