import"./Information.css"
import data from "./mock-data.json"
import React, { useState, Fragment } from "react";
import {nanoid} from 'nanoid';
import EditableRow from "./EditableRow";
import OtherRows from "./OtherRows";

function Information(){
    const [tips, setTips] = useState(data);
    const [addFormData, setFormData] = useState({
        fullName: '',
        location: '',
        description: '',
        additionalinfo: "",
    })

    const [editTipId, setEditTipId] = useState(null);
    const [editFormData, setEditFormData] = useState({
        fullName: '',
        location: '',
        description: '',
        additionalinfo: "",
    });

    const handleAddFormChange = (event) => {
    event.preventDefault();

    const fieldName = event.target.getAttribute("name");
    const fieldValue = event.target.value;

    const newFormData = {...addFormData};
    newFormData[fieldName] = fieldValue;

    setFormData(newFormData);
    };

    const handleEditFormChange = (event) => {
        event.preventDefault();
    
        const fieldName = event.target.getAttribute("name");
        const fieldValue = event.target.value;
    
        const newFormData = {...editFormData};
        newFormData[fieldName] = fieldValue;
    
        setEditFormData(newFormData);
      };

    const handleAddFormSubmit = (event) => {
        event.preventDefault();
    
        const newTip = {
          id: nanoid(),
          fullName: addFormData.fullName,
          location: addFormData.location,
          description: addFormData.description,
          additionalinfo: addFormData.additionalinfo,
        }

        const newTips = [...tips, newTip];
        setTips(newTips)
    };

    const handleEditFormSubmit = (event) => {
        event.preventDefault();
    
            const editedTip = {
                id: editTipId,
                fullName: editFormData.fullName,
                location: editFormData.location,
                description: editFormData.description,
                additionalinfo: editFormData.additionalinfo,
            }

            const newTips = [...tips];

            const index = tips.findIndex((tip) => tip.id === editTipId);
        
            newTips[index] = editedTip;
        
            setTips(newTips);
            setEditTipId(null);
        };

    const handleEditClick = (event, tip ) =>{
        event.preventDefault();
        setEditTipId(tip.id);
    
        const formValues = {
            
          fullName: tip.fullName,
          location: tip.location,
          description: tip.description,
          additionalinfo: tip.additionalinfo,
        }

        setEditFormData(formValues);
    }
    const handleCancelClick = () => {
        setEditTipId(null);
    }

    const handleDeleteClick = (tipId) => {
        const newTips = [...tips];
    
        const index = tips.findIndex((tip) => tip.id === tipId);
    
        newTips.splice(index, 1);
    
        setTips(newTips);
      };

    return <div>
        <section class="info-surround">
            <h1 class="title">Tips Submitted</h1>
            <div class="imp">
            <form onSubmit={handleEditFormSubmit}>    
                <table className="table">
                    <thead>
                        <th>Name</th>
                        <th>Location</th>
                        <th>Description</th>
                        <th>Additional Information</th>
                        <th>Action</th>
                    </thead>
                    <tbody>
                        {tips.map((tip)=>  
                         <Fragment>
                            {editTipId === tip.id ? (<EditableRow 
                                editFormData={editFormData} 
                                handleEditFormChange={handleEditFormChange}
                                handleCancelClick={handleCancelClick}/>) : (
                                <OtherRows 
                                tip={tip} 
                                handleEditClick={handleEditClick}
                                handleDeleteClick={handleDeleteClick}/>
                            )}      
                        </Fragment>)}
                    </tbody>
                </table>
            </form>    
                
                <h2>Add a Tip</h2>
                <form  class="form" onSubmit={handleAddFormSubmit}>
                        <input
                        type="text"
                        name="fullName"
                        required="required"
                        placeholder="name..."
                        onChange={handleAddFormChange}
                        />
                        <input
                        type="text"
                        name="location"
                        required="required"
                        placeholder="location..."
                        onChange={handleAddFormChange}
                        />
                        <input
                        type="text"
                        name="description"
                        required="required"
                        placeholder="description..."
                        onChange={handleAddFormChange}
                        />
                        <input
                        type="text"
                        name="additionalinfo"
                        required="required"
                        placeholder="additional information..."
                        onChange={handleAddFormChange}
                        />    
                    <button type="submit">Add</button>
                </form>
            </div>
        </section>
    </div>
}

export default Information;