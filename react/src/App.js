import logo from './logo.svg';
import React, { useState, useEffect } from 'react'
import './App.css';
import { Provider } from 'react-redux';
import store from './reduxfolder/store';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Bar from './components/Taskbar';
import Tables from './components/Tables';
import Home from './components/Home';
import Login from './components/Login';

function App() {
  const [Dark, setisDark] = useState();

  return (
    <Provider store={store}>

      <Router>
        {/* <img src={logo} className="App-logo" alt="logo" /> */}
        <Bar Dark={Dark} setisDark={setisDark} />

        <Switch>
          <Route path="/" exact>
            <Home Dark={Dark} setisDark={setisDark} />
          </Route>
          <Route path="/features">
            <h1>status</h1>
          </Route>
          <Route path="/pricing">
            <h1>contact</h1>
          </Route>
          <Route path="/table">
            <Tables />
          </Route>
          <Route path="/login">
            <Login />
          </Route>
          <Route path="/signin">
            {/* <Signin /> */}
            maniaknt
          </Route>
        </Switch>

      </Router>
    </Provider>
  );
}

export default App;

