import React, { useState } from 'react';
import './App.css';
import Counter from './Components/Counter';
import CurrencyConvertor from './Components/CurrencyConvertor';

function App() {
  return (
    <div className="App">
      <Counter/>
      <CurrencyConvertor />
    </div>
  );
}

export default App;
