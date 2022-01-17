import { useState, useEffect } from 'react';
import axios from 'axios';

const baseURL = 'https://swapi.dev/api/';

function GetAllStarships() {
    const [data, setData] = useState();
    useEffect(() =>
        axios.get(baseURL + 'starships')
            .then(response => setData(response.data))
            .catch(error => console.error(error))
        , []);
    return data;
}

export default GetAllStarships;