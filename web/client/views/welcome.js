import React from 'react';
import Component from '../base/component';
import Footer from './components/footer';


export default class Welcome extends Component {
  title () {
    return `${this.lang.brand.name} | ${this.lang.titles.welcome}`;
  }

  render () {
    return <div className="l-layout p-welcome">
      <div className="p-w-top"></div>
      <div className="p-w-body">
        <div className="p-w-container">
          <section>
            <div className="m-logo m-logo-large">
              <h1 className="m-l-title">{this.lang.brand.name}</h1>
              <h2 className="m-l-tagline">{this.lang.brand.tagline}</h2>
            </div>
          </section>
          <section>
            <h4>Новости</h4>
            <p>
              It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.
            </p>
            <p>
              There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything
            </p>
          </section>
        </div>
      </div>
      <div className="p-w-bottom"></div>
      <Footer />
    </div>;
  }
}
