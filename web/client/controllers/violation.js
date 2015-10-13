import Controller from '../base/controller';
import ViolationsView from '../views/violations';


export default class ViolationController extends Controller {
  index (ctx, done) {
    this.renderView(ViolationsView, done);
  }
}
