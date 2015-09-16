import Controller from '../base/controller';


export default class Api extends Controller {
  status (req, res, next) {
    res.send({ status: 'I am ok!' });
  }

  router () {
    this.get('/api/status', this.status);
  }
}
