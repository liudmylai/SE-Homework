import { useState } from 'react';
import './App.css';
import data from './data';
import Student from './components/Student';

function App() {

  const [studentData, setStudentData] = useState({ students: data });

  return (
    <div className="App">
      {studentData.students.map((student, index) => <Student student={student} key={index} />)}
    </div>
  );
}

export default App;
