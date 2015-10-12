import _ from 'lodash';
import React from 'react';
import Component from '../../base/component';
import currentUser from '../../stores/current_user';
import auth from '../../modules/auth';


export default class Navbar extends Component {

  getLinks () {
    if (currentUser.authorized()) {
      return [
        { href: '/', text: this.lang.links.home },
        { href: '/violations', text: this.lang.links.violations },
        { href: '/signout', text: this.lang.links.signout },
      ];
    }
    else {
      return [
        { href: '/', text: this.lang.links.welcome },
        { href: '/signin', text: this.lang.links.signin },
        { href: '/signup', text: this.lang.links.signup },
      ];
    }
  }

  render () {
    return <div className="l-sidebar m-navbar card-panel">
      <div className="m-n-menu">
        <NavbarMenu links={this.getLinks()}/>
      </div>
      <div className="l-footer">
        <div className='m-footer'>
          © 2015 {this.lang.brand.shortname} | <a href="/about">{this.lang.captions.about}</a>
        </div>
      </div>
    </div>
  }
}

class NavbarMenu extends Component {
  render () {
    let links = _.map(this.props.links, l => <Link href={l.href}>{l.text}</Link>);

    return <ul className='m-n-menu collection'>
      {links}
    </ul>
  }
}

class Link extends Component {
  render () {
    return <li><a className='collection-item' href={this.props.href}>{this.props.children}</a></li>
  }
}
