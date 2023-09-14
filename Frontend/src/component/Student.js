import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import UpdateStudent from './UpdateStudent';

function Student() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {

    axios.get('http://localhost:8080/')
      .then((response) => {
        setUsers(response.data);
        setLoading(false);
      })
      .catch((error) => {
        console.error('Error fetching users:', error);
        setLoading(false);
      });
  }, []);

  const handleDelete = (userId) => {

    axios.delete(`http://localhost:8080/${userId}`)
      .then((response) => {

        setUsers(users.filter((user) => user.id !== userId));
        console.log('User deleted successfully');
      })
      .catch((error) => {
        console.error('Error deleting user:', error);
      });
  };

  const handleUpdate = (userId) => {

    const userToUpdate = users.find((user) => user.id === userId);


    const updatedUserData = {
      firstName: 'Updated First Name',
      lastName: 'Updated Last Name',
      mobileNumber: "Update Mobile Number",
      email: 'updated@example.com',
      age: "age update",
      gender: "update Gender",
      address: "update address"

    };


    axios.put(`http://localhost:8080/${userId}`, updatedUserData)
      .then((response) => {

        setUsers((prevUsers) =>
          prevUsers.map((user) =>
            user.id === userId ? { ...user, ...updatedUserData } : user
          )
        );
        console.log('User updated successfully');
      })
      .catch((error) => {
        console.error('Error updating user:', error);
      });
  };

  if (loading) {
    return <div>Loading...</div>;
  }

  return (
    <div>
      <h2>User List</h2>
      <table>
        <thead>
          <tr>

            <th>Student ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>MobileNumber</th>
            <th>Email</th>
            <th>Age</th>
            <th>Gender</th>
            <th>address</th>
            <th>Actions</th>

          </tr>
        </thead>
        <tbody style={{ float: "center", backgroundColor: "greenyellow" }}>
          {users.map((user) => (
            <tr key={user.id} style={{ backgroundColor: "Red", color: "white", border: "10px" }}>
              <td>{user.id}</td>
              <td>{user.firstName}</td>
              <td>{user.lastName}</td>
              <td>{user.mobileNumber}</td>
              <td>{user.email}</td>
              <td>{user.age}</td>
              <td>{user.gender}</td>
              <td>{user.address}</td>

              <td>
                <button onClick={() => handleDelete(user.id)}>Delete</button>

              </td>
              <td>
                <button onClick={() => handleUpdate(user.id)}>

                <Link to={{
                  pathname: `/update/${user.id}`,
                  state: { user } // Pass the user object as state
                }}>
                  Update
                </Link></button>


              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default Student;