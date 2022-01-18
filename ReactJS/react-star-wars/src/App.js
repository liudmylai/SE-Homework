import './App.css';
import * as API from './services/sw-api';
import Starship from './components/Starship';
import StarshipInfo from './components/StarshipInfo';

import { useState, useEffect } from 'react';

function App() {
  // state to store starships data
  const [data, setData] = useState({
    next: null,
    results: []
  });
  // state to store the next page URL
  const [nextURL, setNextURL] = useState();
  // state to store additional info about selected starship
  const [info, setInfo] = useState();
  
  // use Effect Hook to get starships info from the server
  // and set this data to state 
  useEffect(() =>
    API.getAllStarships(nextURL)
      // add new data to previous object into related properties
      .then(resultData => setData(prevData => ({
        ...prevData,
        next: resultData.next,
        results: [...prevData.results, ...resultData.results]
      })))
      // triggers useEffect when 'nextURL' changes
    , [nextURL]);

  // set next page URL by clicking the 'Cet More...' button    
  const handleClick = () => {
    setNextURL(data.next);
  }
  // show the modal window with info
  const showStarshipInfo = id => {
    setInfo(data.results[id]);
  }
  // hide the modal window by setting 'null' to info state
  const closeStarshipInfo = () => {
    setInfo(null);
  } 

  return (
    <div className="App">
      <h1>Star Wars Starships</h1>
      <div className='container'>
        {data && data.results.map((result, index) => <Starship starship={result} key={index} showStarshipInfo={showStarshipInfo} id={index} />)}
        {data.next && <button className='more' onClick={handleClick}>Get More...</button>}
        {info && <StarshipInfo info={info} closeStarshipInfo={closeStarshipInfo} />}
      </div>
    </div>
  );
}

export default App;
