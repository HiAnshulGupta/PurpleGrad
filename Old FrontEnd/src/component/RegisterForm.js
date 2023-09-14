import React, { useState } from 'react';
import axios from 'axios';
import './registration.css'

function RegisterForm() {

    const [formData, setFormData] = useState({
        firstName: '',
        lastName: '',
        mobileNumber: '',
        email: '',
        password: '',
        age: '',
        gender: '',
        address: '',
    });

    const handleInputChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });
    };
    const handleSubmit = async(e) => {
        e.preventDefault();
        console.log('Form Submitted', formData);

        try {
            const response = await axios.post('http://localhost:8080/Register', formData);

            if (response.status === 200) {
                console.log('Registration Successful');
               
            }

        } catch (error) {
            console.error('Registration Failed', error);
           
        }


    };
    return (
        <div >
            <h1 style={{color:"red"}}>Registration Form</h1>
            <div >
            <form onSubmit={handleSubmit}>

                <div>
                    <label id='fname'>First Name</label><br/>
                    <input type='text' id='fname' name='firstName' value={formData.firstName} onChange={handleInputChange} placeholder='Enter your first name' required />

                </div>
                <div>
                    <label>Last Name</label><br/>
                    <input type='text' name='lastName' value={formData.lastName} onChange={handleInputChange}  placeholder='Enter your last name' required />
                </div>
                <div>
                    <label>Mobile Number</label><br/>
                    <input type='number' name='mobileNumber' value={formData.mobileNumber} onChange={handleInputChange}  placeholder='Enter your mobile number' required />
                </div>
                <div>
                    <label>Email </label><br/>
                    <input type='email' name='email' value={formData.email} onChange={handleInputChange}  placeholder='Enter your email' required autoComplete="off" />
                </div>
                <div>
                    <label>Password </label><br/>
                    <input type='password' auto name='password' value={formData.password} onChange={handleInputChange}  placeholder='Enter your passowrd' required autoComplete="off" />
                </div>
                <div>
                    <label>Age</label><br/>
                    <input type='number' name='age' value={formData.age} onChange={handleInputChange}  placeholder='Enter your Age' required />
                </div>
                <div>
                    <label>Gender </label><br/>
                    <select name='gender' value={formData.gender} onChange={handleInputChange}  required>
                        <option value="">select Gender</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="other">Other</option>
                    </select>
                </div>
                <div>
                    <label>Address</label><br/>
                    <input type='text' name='address' value={formData.address} onChange={handleInputChange}  placeholder='Enter your Address' />
                </div >
                <br/><button type="submit" >Submit</button>

            </form>
            </div>

        </div>
    )
}

export default RegisterForm;