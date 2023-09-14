import React, { useState, useEffect } from 'react';
import axios from 'axios';

function UpdateStudent({ users, onUpdate }) {
    const [updatedUser, setUpdatedUser] = useState({
        firstName: user.firstName,
        lastName: user.lastName,
        email: user.email,
        mobileNumber: user.mobileNumber, 
        password: user.password, 
        age: user.age, 
        address: user.address, 
    });

    const handleInputChange = (e) => {
        const { name, value } = e.target;
        setUpdatedUser({ ...updatedUser, [name]: value });
    };

    const handleSubmit = (e) => {
        e.preventDefault(); 

        
        axios.put(`http://localhost:8080/${user.id}`, updatedUser)
            .then((response) => {
                
                onUpdate(user.id, updatedUser);
                console.log('User updated successfully');
            })
            .catch((error) => {
                console.error('Error updating user:', error);
            });
    };

    return (
        <div>
            <h2>Update User</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>
                        First Name:
                        <input
                            type="text"
                            name="firstName"
                            value={updatedUser.firstName}
                            onChange={handleInputChange}
                        />
                    </label>
                </div>
                <div>
                    <label>
                        Last Name:
                        <input
                            type="text"
                            name="lastName"
                            value={updatedUser.lastName}
                            onChange={handleInputChange}
                        />
                    </label>
                </div>
                <div>
                    <label>
                        Mobile Number:
                        <input
                            type="text"
                            name="mobileNumber"
                            value={updatedUser.mobileNumber}
                            onChange={handleInputChange}
                        />
                    </label>
                </div>
                <div>
                    <label>
                        Email:
                        <input
                            type="text"
                            name="email"
                            value={updatedUser.email}
                            onChange={handleInputChange}
                        />
                    </label>
                </div>
                <div>
                    <label>
                        Password:
                        <input
                            type="text"
                            name="password"
                            value={updatedUser.password}
                            onChange={handleInputChange}
                        />
                    </label>
                </div>
                <div>
                    <label>
                        Age:
                        <input
                            type="text"
                            name="age"
                            value={updatedUser.age}
                            onChange={handleInputChange}
                        />
                    </label>
                </div>
                <div>
                    <label>
                        Address:
                        <input
                            type="text"
                            name="address"
                            value={updatedUser.address}
                            onChange={handleInputChange}
                        />
                    </label>
                </div>

                <button type="submit">Update</button>
            </form>
        </div>
    );
}

export default UpdateStudent;