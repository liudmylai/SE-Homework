import Card from './Card';
import CardInfo from './CardInfo';
import { useState, useEffect } from 'react';

function Cards(props) {
    const { getStarWarData, getInfoFromObject } = props;
    // state to store data
    const [data, setData] = useState({
        next: null,
        results: []
    });
    // state to store the next page URL
    const [nextURL, setNextURL] = useState();
    // state to store additional info about selected card
    const [info, setInfo] = useState();

    // use Effect Hook to get initial info from the server
    // and set this data to state when 'getStarWarData' changes (i.e when we change route/page)
    useEffect(() =>
        getStarWarData()
            .then(resultData => setData(resultData))
        , [getStarWarData]);

    // use Effect Hook to get next page info from the server
    // and set this data to state when 'nextURL' changes
    useEffect(() =>
        // use AND operator to get data if next URL not null
        nextURL && getStarWarData(nextURL)
            // add new data to previous object into related properties
            .then(resultData => setData(prevData => ({
                ...prevData,
                next: resultData.next,
                results: [...prevData.results, ...resultData.results]
            })))
        , [nextURL]);

    // set next page URL by clicking the 'Cet More...' button    
    const handleClick = () => {
        setNextURL(data.next);
    }
    // show the modal window with info
    const showInfo = id => {
        const object = data.results[id];
        const objectInfo = getInfoFromObject(object);
        setInfo(objectInfo);
    }
    // hide the modal window by setting 'null' to info state
    const closeInfo = () => {
        setInfo(null);
    }
    return (
        <>
            <div className="container">
                {data && data.results.map((result, index) => <Card card={result} key={index} showInfo={showInfo} id={index} />)}
                {data.next && <button className='more' onClick={handleClick}>Get More...</button>}
                {info && <CardInfo info={info} closeInfo={closeInfo} />}
            </div>
        </>
    );
}
export default Cards;