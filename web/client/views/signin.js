import React from 'react';
import Form from '../base/form';
import Navbar from './components/navbar';
import auth from '../modules/auth';


export default class Signin extends Form {
  title () {
    return `${this.lang.brand.name} | ${this.lang.titles.signin}`;
  }

  initState () {
    return { model: {} };
  }

  save (model) {
    let dfd = auth.signin(model);
    dfd.fail((xhr) => this.handleAPIError(xhr));
  }

  render () {
    return <div className="l-layout p-signin">
      <Navbar/>
      <div className="l-content">
        <div className="p-s-form">
          <form onSubmit={this.handleSubmit}>
            <div className="m-control-list">
              <div className="m-control-group">
                <span className="m-cg-icon icon-user"></span>
                <input valueLink={this.linkState('model.username')} type="text" className="m-control" placeholder={this.lang.fields.username} required />
              </div>
              <div className="m-control-group">
                <span className="m-cg-icon icon-lock"></span>
                <input valueLink={this.linkState('model.password')} type="password" className="m-control" placeholder={this.lang.fields.password} required />
              </div>
            </div>
            <p className="l-text-center">
              <button type="submit" className="m-btn">{this.lang.captions.signin}</button>
            </p>
          </form>
        </div>
      </div>
    </div>
  }
}
