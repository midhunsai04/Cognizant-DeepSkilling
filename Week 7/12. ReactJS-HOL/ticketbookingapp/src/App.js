import React, { useState } from 'react';
import { LoginButton, LogoutButton, UserGreeting, GuestGreeting } from './Ticket'

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleAuth = () => {
    setIsLoggedIn(!isLoggedIn);
  };

  return (
    <div>
      <Greeting isLoggedIn={isLoggedIn} />
      {isLoggedIn ? (
        <LogoutButton onClick={handleAuth} />
      ) : (
        <LoginButton onClick={handleAuth} />
      )}
    </div>
  );
}

export default App;
