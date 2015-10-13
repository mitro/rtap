import React from 'react';
import Component from '../../base/component';


export default class Violation extends Component {
  constructor (props) {
    super(props);
  }

  initState (props) {
    return {
      violation: props.data.violation,
    };
  }

  render () {
    return <div className='card'>
      <div className='card-content'>
        <span className='card-title deep-orange-text text-darken-2'>{`${this.state.violation.sum} тг.`}</span>
        <p>{this.state.violation.descr}</p>
      </div>
      <div className='card-action'>
        <a href='#'>{this.lang.captions.pay}</a>
      </div>
    </div>
  }
}
