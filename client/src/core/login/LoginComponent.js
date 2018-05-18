import React, { Component } from 'react';
import './LoginComponent.scss';

class Login extends Component {
  constructor(props){
    super(props);

    this.state = {
      'username': '',
      'password': ''
    };
  }

  componentDidMount(){
    //
  }

  componentWillReceiveProps(nextProps){
    //
  }

  componentWillUnmount(){
    //
  }

  handleUsernameChange(event){
    this.setState({ username: event.target.value });
  }

  handlePasswordChange(event){
    this.setState({ password: event.target.value });
  }

  handleSubmit(){
    console.log('login clicked');
  }
  
  render() {
    return (
      <div className="login-background">
        <div className="login-container">
          <input type="text" value={this.state.username} onChange={this.handleUsernameChange} />
          <input type="password" value={this.state.password} onChange={this.handlePasswordChange} />

          <button onClick={this.handleSubmit} className="login-button" />
        </div>
      </div>
    );
  }
}

export default Login;
