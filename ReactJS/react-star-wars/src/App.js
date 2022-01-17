import './App.css';
import * as API from './services/sw-api';
import Starship from './components/Starship';

import { useState, useEffect } from 'react';

function App() {

  const [data, setData] = useState({
    next: null,
    results: []
  });
  const [nextURL, setNextURL] = useState();

  useEffect(() =>
      API.getAllStarships(nextURL).then(resultData=>setData((prevData)=>({
        ...prevData,
        next: resultData.next,
        results: [...prevData.results, ...resultData.results]
        
      })
        
        ))
      , [nextURL]);


  const handleClick = () => {
    setNextURL(data.next);
  }

  return (
    <div className="App">
      <h1>Star Wars Starships</h1>
      <div className='container'>
        {data && data.results.map((result, index) => <Starship starship={result} key={index} />)}
        {data.next && <button onClick={handleClick}>Get More...</button>}
      </div>
    </div>
  );
}

export default App;
