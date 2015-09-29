import Q from 'q';
import Controller from '../base/controller';
import UserModel from '../models/user';
import UserView from '../views/user';


export default class UserController extends Controller {
  index (ctx, done) {
    let { username } = ctx.params;
    let user = this.wrapModel(new UserModel());
    user.username = username;
    this.xhrs.user = user.fetch();

    let dfd = Q.all([this.xhrs.user]);
    dfd.done(() => {
      this.setInitData({
        UserStore: {
          user: user.toJSON(),
        },
      });

      this.renderView(UserView, done);
    });
  }
}
