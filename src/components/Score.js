import { useState } from 'react';

function Score(props) {
    const { score } = props;
    return (
        <div className='row'>
           <div>{score.date}</div>
           <div>{score.score}</div>
        </div>

    );
}
export default Score;