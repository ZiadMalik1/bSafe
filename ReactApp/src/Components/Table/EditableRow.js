import React from 'react';

function EditableRow({editFormData , handleEditFormChange, handleCancelClick }) {
    return(
        <tr>
            <td>
                <input type="text" 
                required="required"
                placeholder="name..." 
                name="fullName"
                value={editFormData.fullName}
                onChange={handleEditFormChange}/>
                
            </td>
            <td>
                <input type="text" 
                required="required"
                placeholder="location..." 
                name="location"
                value={editFormData.location}
                onChange={handleEditFormChange}/>
                
            </td>
            <td>
                <input type="text" 
                required="required"
                placeholder="description..." 
                name="description"
                value={editFormData.description}
                onChange={handleEditFormChange}/>
                
            </td>
            <td>
                <input type="text" 
                required="required"
                placeholder="additional information..." 
                name="additionalinfo"
                value={editFormData.additionalinfo}
                onChange={handleEditFormChange}></input>
            </td>
            <td>
                <button type="submit">Save</button>
                <button type="button" onClick={handleCancelClick}>Cancel</button>
            </td>
        </tr>
    )
}

export default EditableRow;