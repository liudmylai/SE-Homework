import {useState} from 'react';

function Score(props) {
    const {score} = props;
    return(
        <div>
            {score.date}: {score.score}
        </div>
    );
}
export default Score;