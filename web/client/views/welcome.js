import React from 'react';
import Component from '../base/component';
import Footer from './components/footer';


export default class Welcome extends Component {
  title () {
    return `${this.lang.brand.name} | ${this.lang.titles.welcome}`;
  }

  render () {
    return <div className="l-layout p-welcome">
      <div className="l-sidebar">1</div>
      <div className="l-content">2</div>
      <div className="l-footer">3</div>
    </div>;
  }
}
