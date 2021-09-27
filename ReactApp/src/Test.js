import React from "react";


class Test extends App{
    constructor(){
        super()
        this.state={}
            showMe:true
    }

    operation(){
        
    }

    render(){
        return(
            <div>
                <h1>
                    Hide and Show in React js
                </h1>
                <div>
                    Please hide me
                </div>
                <button onClick={()=>this.operation()}>Click Me</button>
            </div>
        )
    }
}