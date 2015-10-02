import React from 'react';
import Component from '../../base/component';
import currentUser from '../../stores/current_user';
import auth from '../../modules/auth';


export default class Navbar extends Component {
  signout () {
    auth.signout();
  }

  createMenu () {
    if (currentUser.authorized()) {
      return <ul className='m-nm-list'>
        <li><a href='/violations'>Нарушения</a></li>
        <li><a onClick={this.signout}>Выйти</a></li>
      </ul>
    }
    else {
      return <ul className='m-nm-list'>
        <li><a href='/signin'>Войти</a></li>
        <li><a href='/signup'>Зарегистрироваться</a></li>
      </ul>
    }
  }

  render () {
    var menu = this.createMenu();

    return <div className="l-sidebar m-navbar">
      <div className="m-n-menu">
        {menu}
      </div>
      <div className="l-footer">
        <div className='m-footer'>
          © 2015 {this.lang.brand.shortname} | <a href="/about">{this.lang.captions.about}</a>
        </div>
      </div>
    </div>
  }
}
