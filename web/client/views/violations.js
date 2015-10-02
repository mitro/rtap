import React from 'react';
import Component from '../base/component';
import Navbar from './components/navbar';


export default class Violations extends Component {
  title () {
    return `${this.lang.brand.name} | ${this.lang.titles.violations}`;
  }

  render () {
    return <div className='l-layout p-violations'>
      <Navbar/>
      <div className='l-content'>
        Нарушения
      </div>
    </div>
  }
}
