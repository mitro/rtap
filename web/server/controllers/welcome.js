import ViewController from '../base/view_controller';


export default class WelcomeController extends ViewController {
  constructor () {
    super();
    this.logPrefix = 'welcome-controller';
  }

  welcome (req, res) {
    this.renderView(req, res, 'welcome');
  }

  router () {
    this.get('/', this.welcome);
  }
}
