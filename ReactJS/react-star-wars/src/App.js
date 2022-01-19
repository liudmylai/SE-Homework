import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import * as API from './services/sw-api';
import Nav from './components/Nav';
import Cards from './components/Cards';
import NoPage from './components/NoPage';


function App() {
  const peopleInfo = object => [
    { key: 'Name', value: object.name },
    { key: 'Height', value: object.height },
    { key: 'Mass', value: object.mass },
    { key: 'Hair color', value: object.hair_color },
    { key: 'Skin color', value: object.skin_color },
    { key: 'Eye color', value: object.eye_color },
    { key: 'Birth year', value: object.birth_year },
    { key: 'Gender', value: object.gender }
  ];

  const starshipInfo = object => [
    { key: 'Model', value: object.model },
    { key: 'Manufacturer', value: object.manufacturer },
    { key: 'Cost in credits', value: object.cost_in_credits },
    { key: 'Length', value: object.length },
    { key: 'Max atmosphering speed', value: object.max_atmosphering_speed },
    { key: 'Crew', value: object.crew },
    { key: 'Passengers', value: object.passengers },
    { key: 'Cargo capacity', value: object.cargo_capacity },
    { key: 'Consumables', value: object.consumables },
    { key: 'Hyperdrive rating', value: object.hyperdrive_rating },
    { key: 'MGLT', value: object.MGLT },
    { key: 'Starship class', value: object.starship_class }
  ];

  const planetInfo = object => [
    { key: 'Name', value: object.name },
    { key: 'Rotation period', value: object.rotation_period },
    { key: 'Orbital period', value: object.orbital_period },
    { key: 'Diameter', value: object.diameter },
    { key: 'Climate', value: object.climate },
    { key: 'Gravity', value: object.gravity },
    { key: 'Terrain', value: object.terrain },
    { key: 'Surface_water', value: object.surface_water },
    { key: 'Population', value: object.population }
  ]

  return (
    // first wrap content with <BrowserRouter>
    <BrowserRouter>
      <div className="App">
        <h1>Star Wars</h1>
        <Nav />
        {/* define <Routes> */}
        <Routes>
          <Route path='/' element={<Cards getStarWarData={API.getAllStarships} getInfoFromObject={starshipInfo} />} />
          <Route path='/starships' element={<Cards getStarWarData={API.getAllStarships} getInfoFromObject={starshipInfo} />} />
          <Route path='/people' element={<Cards getStarWarData={API.getAllPeople} getInfoFromObject={peopleInfo} />} />
          <Route path='/planets' element={<Cards getStarWarData={API.getAllPlanets} getInfoFromObject={planetInfo} />} />
          {/* set the path to *  as a catch-all for any undefined URL */}
          <Route path="*" element={<NoPage />} />
        </Routes>

      </div>
    </BrowserRouter>
  );
}

export default App;
