
function OtherRows({tip, handleEditClick, handleDeleteClick}){
    return(
        <tr>
            <td>{tip.fullName}</td>
            <td>{tip.location}</td>
            <td>{tip.description}</td>
            <td>{tip.additionalinfo}</td>
            <td>
                <button type="button" onClick={(event)=> handleEditClick(event, tip)}>Edit</button>
                <button type="button" onClick={(event)=> handleDeleteClick(event, tip)}>Delete</button>
            </td>
        </tr>
    )
}

export default OtherRows;