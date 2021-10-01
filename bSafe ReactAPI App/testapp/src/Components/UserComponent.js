import React from "react";
import UserService from "../Services/UserService";

class ReportComponent extends React.Component{

     constructor(props){
         super(props)
         this.state = {
             reports:[]
         }
     }
     componentDidMount(){
         UserService.getUsers().then((response) => {
            this.setState({reports: response.data}) 
         })
     }
     render(){
         return(
             <div>
                <h1 className = "text-center"> Report List </h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td>
                                Report Id
                            </td>
                            <td>
                                Report Name
                            </td>
                            <td>
                                Report Description
                            </td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.reports.map(
                                report => 
                                <tr key = {report.id}>
                                    <td>{report.id}</td>
                                    <td>{report.name}</td>
                                    <td>{report.description}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
             </div>
         )
     }
}

export default ReportComponent;