import React, { useState } from 'react';

function Counter() {
    const [count, setCount] = useState(0);

    const handleIncrement = () => {
        incrementCount();
        sayHello();
    };

    const incrementCount = () => {
        setCount(count + 1);
    };

    const sayHello = () => {
        alert("Hello! Member!");
    };

    const handleDecrement = () => {
        setCount(count - 1);
    };

    const handleWelcome = (message) => {
        alert(message);
    };

    const handleClick = () => {
        alert("I was clicked");
    };

    return (
        <div>
            <h1>{count}</h1>
            <button onClick={handleIncrement}>Increment</button> <br></br>
            <button onClick={handleDecrement}>Decrement</button> <br></br>
            <button onClick={() => handleWelcome("Welcome")}>Say welcome</button> <br></br>
            <button onClick={handleClick}>Click on me</button> <br></br>
        </div>
    );
}

export default Counter;
