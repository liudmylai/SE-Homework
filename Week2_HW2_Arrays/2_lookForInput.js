// 2. Write a program to look for the user input in an array. When it finds the first occurrence, display the value and the index of that value

const myArray = ['Red', 'Blue', 'Dog', 'cat', 'red', 'green', 'dog'];
const prompt = require('prompt-sync')();
const userInput = prompt('Enter a string: ');

// const lookForInput = function (str, arr) {
//     // Use map() to get a new array with all elements converted to lowercase letters
//     const newArray = arr.map((i) => i.toLowerCase());
//     // Get index of the user input in the new array
//     const result = newArray.indexOf(str.toLowerCase());
//     return str + ' ' + result;
// }

// The simplified version of the function
const lookForInput = (str, arr) => str + ' ' + arr.map((i) => i.toLowerCase()).indexOf(str.toLowerCase());
console.log(lookForInput(userInput, myArray));