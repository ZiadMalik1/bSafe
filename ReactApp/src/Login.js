import"./Login.css"

function Login(){
    let show = false;
    var username = '';
    var password = '';


    const handleChange = (event) => {
        event.preventDefault();
        
        const fieldName = event.target.getAttribute("name");
        console.log(fieldName);
        const fieldValue = event.target.value;
    
        if(fieldName === 'username'){
            username = fieldValue;
        }
        else{
            password = fieldValue;
        }
    };

    const handleAddSubmit = (event) => {
        event.preventDefault();
        if(username === '1'){
            show = true;
            console.log(show);
        }
    }

    return(
        <div>
            
            
            <section class="sign-in">
                <form onSubmit={handleAddSubmit}> 
                    <input 
                        type="text"
                        name="username" 
                        required="required"
                        onChange={handleChange}/>
                    <label for= "username">
                                Username
                    </label>
        
                    <input 
                        type="password" 
                        name="pass" 
                        required="required"
                        onChange={handleChange}>
                    </input>
                    <label for= "ps">
                        Password
                    </label>

                    <section class="submit">
                        <button 
                            type="submit" 
                            class="submit-button" 
                            >Login</button>
                    {
                    show ? <div>WORKS</div> : null
                    } 
                    </section>
                </form>
            </section>
        </div>
        )

}

export default Login;