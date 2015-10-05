import React from 'react';
import auth from '../modules/auth';
import Controller from '../base/controller';
import WelcomeView from '../views/welcome';
import SignupView from '../views/signup';
import SigninView from '../views/signin';


export default class WelcomeController extends Controller {
  index (ctx, done) {
    this.renderView(WelcomeView, done);
  }

  signup (ctx, done) {
    this.renderView(SignupView, done);
  }

  signin (ctx, done) {
    this.renderView(SigninView, done);
  }

  signout (ctx, done) {
    auth.signout();
    done();
  }
}
