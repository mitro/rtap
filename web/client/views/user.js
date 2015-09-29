import React from 'react';
import Component from '../base/component';
import auth from '../modules/auth';
import userStore from '../stores/user';
import currentUser from '../stores/current_user';


export default class User extends Component {
  title () {
    return `${this.lang.brand.name} | Пользователь`;
  }

  initState () {
    let state = userStore.getState();
    state.isOwner = state.user.username === currentUser.get('username');

    return state;
  }

  logout () {
    auth.signout();
  }

  render () {
    let { user } = this.state;

    return <div>
      <p>Пользователь {user.username}</p>
      <a onClick={this.logout}>{this.lang.captions.logout}</a>
    </div>
  }
}
