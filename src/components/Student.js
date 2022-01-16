import { useState } from 'react';
import Score from './Score';

function Student(props) {
    const { student } = props;
    return (
        <div>
            <h1>{student.name}</h1>
            <p>{student.bio}</p>
            {student.scores.map((score, index) => <Score score={score} key={index} />)}
        </div>
    );
}
export default Student;