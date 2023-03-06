import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter as Router, Route, Link, Routes } from 'react-router-dom';
import MyNavbar from './components/NavBar';
import Home from './components/Home';
import LinkPage from './components/LinkPage';
import Login from './components/Login';

function App() {
  return (
    <Router>
      <MyNavbar />
      <Routes>
          <Route path="/" element={<Home />}></Route>
          <Route path="/linkpage" element={<LinkPage />}></Route>
          <Route path="/login" element={<Login />}></Route>
      </Routes>
    </Router>
  );
}

export default App;
