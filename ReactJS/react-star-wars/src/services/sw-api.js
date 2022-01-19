import axios from 'axios';

const baseURL = 'https://swapi.dev/api/';

function getAxios(customURL, endPoint) {
    return axios.get(customURL ? customURL : baseURL + endPoint)
        .then(response => response.data)
        .catch(error => console.error(error))
}

// function to get data for all starships
function getAllStarships(url) {
    return getAxios(url, 'starships');
}
// function to get data for all people
function getAllPeople(url) {
    return getAxios(url, 'people');
}
// function to get data for all planets
function getAllPlanets(url) {
    return getAxios(url, 'planets');
}
export { getAllStarships, getAllPeople, getAllPlanets };