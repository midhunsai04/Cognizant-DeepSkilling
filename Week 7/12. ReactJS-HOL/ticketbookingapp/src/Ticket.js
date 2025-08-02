import React from "react";

export function LoginButton(props) {
    return (
        <button onClick={props.onClick}>
            Login
        </button>
    );
}

export function LogoutButton(props) {
    return (
        <button onClick={props.onClick}>
            Logout
        </button>
    );
}

export function UserGreeting() {
    return (
        <div>
            <h2>Welcome Back</h2>
            <span><b>Flight :</b> AirIndia - Chennai to Tiruchirappalli - $3,000</span>
            <button>Book Now</button> <br></br>
            <span><b>Train :</b> Vande Bharat - Chennai to Tiruchirappalli - $2,000</span>
            <button>Book Now</button> <br></br>
            <span><b>Bus :</b> RedBus - Chennai to Tiruchirappalli - $1,000</span>
            <button>Book Now</button> <br /><br />
        </div>
    );
}

export function GuestGreeting() {
    return (
        <div>
            <h2>Please Sign up</h2>
            <span><b>Flight :</b> AirIndia - Chennai to Tiruchirappalli - $3,000</span><br></br>
            <span><b>Train :</b> Vande Bharat - Chennai to Tiruchirappalli - $2,000</span><br></br>
            <span><b>Bus :</b> RedBus - Chennai to Tiruchirappalli - $1,000</span><br /><br />
        </div>
    );
}