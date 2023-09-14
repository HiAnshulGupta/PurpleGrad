import React from "react";
import { Link } from "react-router-dom";

function NavigationBar() {
    return (
        <div >
        <nav style={{float:"right"}}>


            <button> <Link to="/">Home</Link> </button>

            <button> <Link to="/login">Login</Link></button>

            <button> <Link to="/Register">Register</Link></button>

            <button> <Link to="/${userId}">Update Deatials</Link></button>


        </nav>
        </div>
    );
}

export default NavigationBar;





