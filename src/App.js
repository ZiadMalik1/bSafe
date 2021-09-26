import './App.css';
import Information from './Information';
import Login from './Login.js';



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
