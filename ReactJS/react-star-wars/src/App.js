import './App.css';
import getAllStarships from './services/sw-api';
import Starship from './components/Starship';


function App() {
  const data = getAllStarships();
  return (
    <div className="App">
      {data && data.results.map((result, index) => <Starship starship={result} key={index} />)}
    </div>
  );
}

export default App;
