import React from 'react';
import Component from '../../base/component';
import currentUser from '../../stores/current_user';
import auth from '../../modules/auth';


export default class Navbar extends Component {

  createMenu () {
    if (currentUser.authorized()) {
      return <ul className='m-n-menu collection'>
        <li><a className='collection-item' href='/violations'>Нарушения</a></li>
        <li><a className='collection-item' href='/signout'>Выйти</a></li>
      </ul>
    }
    else {
      return <ul className='m-n-menu collection'>
        <li><a className='collection-item' href='/signin'>Войти</a></li>
        <li><a className='collection-item' href='/signup'>Зарегистрироваться</a></li>
      </ul>
    }
  }

  render () {
    var menu = this.createMenu();

    return <div className="l-sidebar m-navbar card">
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
