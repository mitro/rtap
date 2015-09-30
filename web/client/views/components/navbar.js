import React from 'react';
import Component from '../../base/component';
import currentUser from '../../stores/current_user';
import auth from '../../modules/auth';


export default class Navbar extends Component {

  signout () {
    auth.signout();
  }

  renderMenu () {
    if (currentUser.authorized()) {
      return <ul>
        <li><span onClick={this.signout}>Выйти</span></li>
      </ul>
    }
    else {
      return <ul>
        <li><a href="/signin">Войти</a></li>
        <li><a href="/signup">Зарегистрироваться</a></li>
      </ul>
    }
  }

  render () {
    var menu = this.renderMenu();

    return <div className="l-sidebar">
      {menu}
      <div className="l-footer">
        <div className='m-footer'>
          © 2015 {this.lang.brand.shortname} | <a href="/about">{this.lang.captions.about}</a>
        </div>
      </div>
    </div>
  }
}
