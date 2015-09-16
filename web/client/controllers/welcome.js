import React from 'react';
import Controller from '../base/controller';
import WelcomeView from '../views/welcome';


export default class WelcomeController extends Controller {
  index (ctx, done) {
    this.renderView(<WelcomeView />, done);
  }
}
