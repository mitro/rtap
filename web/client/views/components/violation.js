import _ from 'lodash';
import moment from 'moment';
import React from 'react';
import Component from '../../base/component';


export default class Violation extends Component {
  constructor (props) {
    super(props);
  }

  initState (props) {
    return {
      violation: props.violation,
    };
  }

  render () {
    let descr = _.template(this.lang.templates.violation_descr)({
      name: this.state.violation.name,
      model: this.state.violation.model,
      plate: this.state.violation.plate,
      descr: this.state.violation.descr,
    });

    return <div className='card m-violation-card'>
      <div className='card-content'>
        <div className='card-title'>
          <span className='m-vc-sum deep-orange-text text-darken-2'>{`${this.state.violation.sum} тг.`}</span>
          <span className='m-vc-number'>{`№${this.state.violation.number}`}</span>
          <span className='m-vc-attr'><i className='material-icons'>schedule</i> {moment(this.state.violation.date).format('DD.MM.YY HH:mm')}</span>
          <span className='m-vc-attr'><i className='material-icons'>location_on</i> {this.state.violation.post}</span>
        </div>
        <p className='m-vc-descr'>{descr}</p>
      </div>
      <div className='card-action'>
        <a href='#'>{this.lang.captions.pay}</a>
      </div>
    </div>
  }
}
