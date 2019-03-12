import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

import Beck from './components'

class App extends Component {
  constructor(props, context) {
    super(props, context);
    this.state = {
      hello: "hello world"
    };
    this.beck = { hello: "hello world" };
  }
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>

        <div onClick={()=>{ console.log(this.beck) }}>{this.state.hello}</div>
        <Beck
          dataSource={this.beck}
        />
      </div>
    );
  }
}

export default App;
