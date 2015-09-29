import React from 'react';
import Controller from '../base/controller';
import WelcomeView from '../views/welcome';
import SignupView from '../views/signup';


export default class WelcomeController extends Controller {
  index (ctx, done) {
    this.renderView(WelcomeView, done);
  }

  signup (ctx, done) {
    this.renderView(SignupView, done);
  }
}
