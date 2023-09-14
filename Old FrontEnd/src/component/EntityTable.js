import React, { useState, useEffect } from 'react';
import axios from 'axios';

function EntityTable() {
  const [entities, setEntities] = useState([]);
  const [selectedEntity, setSelectedEntity] = useState(null);

  useEffect(() => {
    const getAllEntities = async () => {
      try {
        const response = await axios.get('http://localhost:8080/');
        setEntities(response.data);
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    getAllEntities();
  }, []);

  const openEditModal = (entity) => {
    setSelectedEntity(entity);
    
  };

  const openDeleteModal = (entity) => {
    setSelectedEntity(entity);
    
  };

  const deleteEntity = (entityToDelete) => {
    axios
      .delete(`http://localhost:8080/${entityToDelete.id}`)
      .then((response) => {
        if (response.status === 200) {
          setEntities((prevEntities) =>
            prevEntities.filter((entity) => entity.id !== entityToDelete.id)
          );
          console.log('Entity deleted successfully');
        } else {
          console.error('Error deleting entity');
        }
      })
      .catch((error) => {
        console.error('Error deleting entity:', error);
      });
  };

  return (
    <div className="wrapper-editor">
      <table id="entityTable" className="table table-striped table-bordered" cellSpacing="0" width="100%">
        <thead>
          <tr>
            <th className="th-sm">Name</th>
            <th className="th-sm">Position</th>
            <th className="th-sm">Actions</th>
          </tr>
        </thead>
        <tbody>
          {entities.map((entity) => (
            <tr key={entity.id}>
              <td>{entity.name}</td>
              <td>{entity.position}</td>
              <td>
                <button
                  className="btn btn-primary btn-sm"
                  onClick={() => openEditModal(entity)}
                >
                  Edit
                </button>
                <button
                  className="btn btn-danger btn-sm"
                  onClick={() => openDeleteModal(entity)}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default EntityTable;