import React from "react";
import { Link } from "react-router-dom";

function NavigationBar() {
    return (
        <div >
        <nav style={{float:"center"}}>


            <button> <Link to="/">Home</Link> </button>
            <button> <Link to="/Register">Register</Link></button>
            

            


        </nav>
        </div>
    );
}

export default NavigationBar;





