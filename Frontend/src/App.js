import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Student from "./component/Student";
import RegisterForm from "./component/RegisterForm";
import UpdateStudent from "./component/UpdateStudent";
import NavigationBar from "./component/NavigationBar";
import './App.css';

function App() {
  return (
    <div className="App">
      
      
      <BrowserRouter>
      <div style={{backgroundColor:"brown"}}><NavigationBar /></div>
        <Routes>
          <Route exact path="/" element={<Student/>} />
          <Route path="/Register" element={<RegisterForm />} />
          <Route path="/update/:userId" element={<UpdateStudent/>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
