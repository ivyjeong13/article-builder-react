import React, { Component } from 'react';
import './App.css';

import {
  BrowserRouter as Router,
  Route,
  Switch
} from 'react-router-dom'

import Login from './core/login/LoginComponent';
import Builder from './core/builder/BuilderComponent';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Router>
          <Switch>
            <Route path="/login" component={Login} />
            <Route path="/builder" component={Builder} />
            <Route component={Login} />
          </Switch>
        </Router>
      </div>
    );
  }
}

export default App;
