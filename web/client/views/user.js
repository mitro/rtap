import React from 'react';
import Component from '../base/component';
import Navbar from './components/navbar';
import PageHeader from './components/page_header';
import userStore from '../stores/user';


export default class User extends Component {
  title () {
    return `${this.lang.brand.name} | Пользователь`;
  }

  initState () {
    return userStore.getState();
  }

  render () {
    let { user } = this.state;

    return <div className='l-layout p-user'>
      <Navbar/>
      <div className='l-content'>
        <PageHeader>{user.username}</PageHeader>
      </div>
    </div>
  }
}
