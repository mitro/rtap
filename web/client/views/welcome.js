import React from 'react';
import Form from '../base/form';
import Navbar from './components/navbar';
import auth from '../modules/auth';


export default class Welcome extends Form {
  title () {
    return `${this.lang.brand.name} | ${this.lang.titles.welcome}`;
  }

  initState () {
    return { model: {} };
  }

  save (model) {
    let dfd = auth.signin(model);
    dfd.fail((xhr) => this.handleAPIError(xhr));
  }

  render () {
    return <div className="l-layout p-welcome">
      {/*<div className="l-sidebar">
        <form className="p-w-login-form" onSubmit={this.handleSubmit}>
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
        <p>
          <a href="/signup" className="m-btn m-btn-block m-btn-link">{this.lang.captions.signup}</a>
        </p>
      </div>
      */}
      <Navbar/>
      <div className="l-content">
        <div className="p-w-logo">
          <div className="m-logo m-logo-large">
            <h1 className="m-l-title">{this.lang.brand.name}</h1>
            <h2 className="m-l-tagline">{this.lang.brand.tagline}</h2>
          </div>
        </div>
        <div className="p-w-news">
          <div className="m-news">
            <header className="m-n-title">Новости</header>
            <article className="m-n-text">Душа моя озарена неземной радостью, как эти чудесные весенние утра, которыми я наслаждаюсь от всего сердца. Я совсем один и блаженствую в здешнем краю, словно созданном для таких, как я. Я так счастлив, мой друг, так упоен ощущением покоя, что искусство мое страдает от этого. Ни одного штриха не мог бы я сделать, а никогда не был таким большим художником, как в эти минуты."</article>
            <article className="m-n-text">Задача организации, в особенности же новая модель организационной деятельности требуют определения и уточнения форм развития. Повседневная практика показывает, что сложившаяся структура организации позволяет выполнять важные задания по разработке соответствующий условий активизации. Товарищи!</article>
            <article className="m-n-text">Далеко-далеко за словесными горами в стране гласных и согласных живут рыбные тексты. Вдали от всех живут они в буквенных домах на берегу Семантика большого языкового океана. Маленький ручеек Даль журчит по всей стране и обеспечивает ее всеми необходимыми правилами. Эта парадигматическая страна, в которой жаренные члены предложения залетают прямо в рот. Даже всемогущая пунктуация не имеет власти над рыбными текстами, ведущими безорфографичный образ жизни.</article>
          </div>
        </div>
      </div>
    </div>
  }
}
