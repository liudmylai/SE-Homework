import { useState } from 'react';
import Score from './Score';

function Student(props) {
    const { student } = props;
    return (
        <div className='card'>
            <div className='info'>
                <h2>{student.name}</h2>
                <p>{student.bio}</p>
            </div>
            <div className='scores'>
                <h3>Scores:</h3>
                {student.scores.map((score, index) => <Score score={score} key={index} />)}
            </div>
        </div>
    );
}
export default Student;