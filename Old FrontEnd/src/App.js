import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import './App.css';
import RegisterForm from './component/RegisterForm';
import Loginform from './component/LoginForm';
import Home from './component/Home';
import NavigationBar from './component/NavigationBar';
import UpdateUser from "./component/UpdateUser";



function App() {
  return (
    <div className="App">
      <BrowserRouter>
       <div style={{backgroundColor:"brown"}}><NavigationBar /></div> 
        <Routes>


          <Route exact path="/" element={<Home />} />
          <Route path="/login" element={<Loginform />} />
          <Route path="/Register" element={<RegisterForm />} />
          <Route path="/${userId}" element={<UpdateUser />} />
        </Routes>
      </BrowserRouter>

    </div>
  );
}

export default App;
