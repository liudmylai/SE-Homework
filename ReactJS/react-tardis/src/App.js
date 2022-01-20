import './App.css';
import { createContext } from 'react';
import DivOne from './DivOne';

export const TardisContext = createContext();

function App() {

  const tardis = {
    tardis: {
      name: 'Time and Relative Dimension in Space',
      caps: false
    }
  };

  return (
    <div className="App">
      <TardisContext.Provider value={tardis}>
        <DivOne />
      </TardisContext.Provider>
    </div>
  );
}

export default App;

