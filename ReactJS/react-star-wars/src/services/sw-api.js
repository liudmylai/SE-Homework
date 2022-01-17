import axios from 'axios';

const baseURL = 'https://swapi.dev/api/';

function getAllStarships(url) {
    return axios.get(url ? url : baseURL + 'starships')
        .then(response => response.data)
        .catch(error => console.error(error))
}



export { getAllStarships };