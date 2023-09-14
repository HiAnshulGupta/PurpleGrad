import React, { useState } from 'react';
import axios from 'axios';
import './registration.css'

function UpdateUser({ userId }) {
  const [updateData, setUpdateData] = useState({
    firstName: '',
    lastName: '',
    email: '',
    password: '',
    address: '',
  });

  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setUpdateData({
      ...updateData,
      [name]: value,
    });
  };

  const handleUpdate = () => {
    // Send a PUT request to your backend to update the user data
    axios
      .put(`http://localhost:8080/${userId}`, updateData)
      .then((response) => {
        console.log('User updated successfully', response.data);
        // Handle success, show a success message, or redirect to another page
      })
      .catch((error) => {
        console.error('Error updating user:', error);
        // Handle error, show an error message, or handle as needed
      });
  };

  return (
    <div>
      <h2>Update User</h2>
      <div>
        <label>First Name:</label>
        <input
          type="text"
          name="firstName"
          value={updateData.firstName}
          onChange={handleInputChange}
        />
      </div>
      <div>
        <label>Last Name:</label>
        <input
          type="text"
          name="lastName"
          value={updateData.lastName}
          onChange={handleInputChange}
        />
      </div>
      <div>
        <label>Email:</label>
        <input
          type="text"
          name="email"
          value={updateData.email}
          onChange={handleInputChange}
        />
      </div>
      <div>
        <label>Password:</label>
        <input
          type="password"
          name="password"
          value={updateData.password}
          onChange={handleInputChange}
        />
      </div>
      <div>
        <label>Address:</label>
        <input
          type="text"
          name="address"
          value={updateData.address}
          onChange={handleInputChange}
        />
      </div>
      <button onClick={handleUpdate}>Update User</button>
    </div>
  );
}

export default UpdateUser;