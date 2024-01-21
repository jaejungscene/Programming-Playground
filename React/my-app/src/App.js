import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import ExpandedList from './components/ExpandedList';
import Test01 from './components/test/Test01';
import Test02 from './components/test/Test02';
import ChartTest01 from './components/test/ChartTest01';
import ListTest01 from './components/test/ListTest01';
import ErrorPage from './components/test/ErrorPage';
import ChartTest02 from './components/test/ChartTest02';
import Login from './pages/Login';
import ReduxTest from './test';

function App() {
  // const API_URL = 'http://localhost:8080'
  // fetch(`${API_URL}/musicSearch/`)
  //   .then(r => console.log(r))
  //   .catch(e => console.log(e,'error when search musician'));
  const items = ['Item 1', 'Item 2', 'Item 3'];
  const summary = 'Click to expand the list';
  return (
    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
    // </div>
    // <>
    //   <div style={{display:'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center', paddingTop:'120px'}}>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<ExpandedList items={items} summary={summary}/>}/>
          <Route path='/login' element={<Login/>}/>
          <Route path='/test01' element={<Test01/>}/>
          <Route path='/test02' element={<Test02/>}/>
          <Route path='/charttest01' element={<ChartTest01/>}/>
          <Route path='/charttest02' element={<ChartTest02/>}/>
          <Route path='/listtest01' element={<ListTest01/>}/>
          <Route path='/reduxtest' element={<ReduxTest/>}/>
          {/* <Route paht='/dashboard' element= */}
          <Route path='*' element={<ErrorPage/>}/>
        </Routes>
      </BrowserRouter>
    //   </div>
    // </>
  );
}

export default App;
