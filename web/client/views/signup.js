import React from 'react';
import Form from '../base/form';
import Navbar from './components/navbar';
import UserModel from '../models/user';
import auth from '../modules/auth';


export default class Signup extends Form {
  title () {
    return `${this.lang.brand.name} | ${this.lang.titles.signup}`;
  }

  initState () {
    return { model: {} };
  }

  save (model) {
    if (model.confirm_password !== model.password) {
      return this.showError('invalid_confirm_password');
    }

    let newUser = new UserModel(model);
    let dfd = newUser.save().then(() => {
      return auth.signin(newUser.toJSON());
    });

    dfd.fail((xhr) => this.handleAPIError(xhr));
  }

  render () {
    return <div className='l-layout p-signup'>
      <Navbar/>
      <div className='l-content'>
        <div className='p-s-form'>
          <form onSubmit={this.handleSubmit}>
            <div className='m-control-group'>
              <span className='m-cg-icon icon-user'></span>
              <input valueLink={this.linkState('model.username')} type='text' className='m-control' placeholder={this.lang.fields.username} required />
            </div>
            <div className='m-control-group'>
              <span className='m-cg-icon icon-user'></span>
              <input valueLink={this.linkState('model.full_name')} type='text' className='m-control' placeholder={this.lang.fields.full_name} required/>
            </div>
            <div className='m-control-group'>
              <span className='m-cg-icon icon-mail-alt'></span>
              <input valueLink={this.linkState('model.email')} type='text' className='m-control' placeholder={this.lang.fields.email} required />
            </div>
            <div className='m-control-list'>
              <div className='m-control-group'>
                <span className='m-cg-icon icon-lock'></span>
                <input valueLink={this.linkState('model.password')} type='password' className='m-control' placeholder={this.lang.fields.password} required />
              </div>
              <div className='m-control-group'>
                <span className='m-cg-icon icon-lock'></span>
                <input valueLink={this.linkState('model.confirm_password')} type='password' className='m-control' placeholder={this.lang.fields.confirm_password} required />
              </div>
            </div>
            <p className='l-text-center'>
              <button type='submit' className='m-btn'>{this.lang.captions.signup}</button>
            </p>
          </form>
        </div>
      </div>
      
    </div>
  }
}
