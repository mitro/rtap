import React from 'react';
import Component from '../../base/component';


export default class PageHeader extends Component {
  render() {
    return <h1 className='cyan-text text-darken-3'>{this.props.children}</h1>
  }
}
