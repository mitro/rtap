import React from 'react';
import Component from '../base/component';
import Navbar from './components/navbar';
import PageHeader from './components/page_header';
import ViolationCard from './components/violation';
import violationsStore from '../stores/violations';


export default class Violations extends Component {
  title () {
    return `${this.lang.brand.name} | ${this.lang.titles.violations}`;
  }

  initState () {
    return violationsStore.getState();
  }

  render () {
    let { violations } = this.state;

    return <div className='l-layout p-violations'>
      <Navbar/>
      <div className='l-content'>
        <PageHeader>{this.lang.titles.violations}</PageHeader>
        {violations.map((violation, index) => {
          console.log(typeof index);
          return <ViolationCard key={index} violation={violation}/>;
        })}
      </div>
    </div>
  }
}
