import Q from 'q';
import Controller from '../base/controller';
import ViolationsCollection from '../models/violations';
import ViolationsView from '../views/violations';


export default class ViolationController extends Controller {
  index (ctx, done) {
    let violations = this.wrapModel(new ViolationsCollection());
    this.xhrs.violations = violations.fetch();

    let dfd = Q.all([this.xhrs.violations]);
    dfd.done(() => {
      this.setInitData({
        ViolationsStore: {
          violations: violations.toJSON(),
        },
      });

      this.renderView(ViolationsView, done);
    });
  }
}
