import './App.css';
import Information from './Components/Table/Information.js';
import Login from './Components/Login/Login.js';



function App() {
  return (
    <div>
      <header>
        <img src="/images/Logo_bSafe.png" alt=""/>
        <Login/>
      </header>
      <Information/>
    </div>
  );
}

export default App;
