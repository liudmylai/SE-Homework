// BONUS: Capitalize the first letter of each word in a given string (or user entered string/sentence)
const prompt = require('prompt-sync')();
const string = prompt('Enter string/sentence: ');
const stringArr = string.split(' ');
for (let i = 0; i < stringArr.length; i++) {
    stringArr[i] = stringArr[i].charAt(0).toUpperCase() + stringArr[i].slice(1);
}
console.log(stringArr.join(' '));