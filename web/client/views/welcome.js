import React from 'react';
import Component from '../base/component';


export default class Welcome extends Component {
  title () {
    return `${this.lang.brand.name} | ${this.lang.titles.welcome}`;
  }

  render () {
    return <div>Hello, world!</div>;
  }
}
