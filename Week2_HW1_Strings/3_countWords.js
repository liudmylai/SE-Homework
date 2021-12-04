// 3. Write a program to find how many times a user entered word occurs in given string

let prompt = require('prompt-sync')();
let userWord = prompt('Enter some word: ');
let text = "Write a program to find how many times a user entered word occurs in given string.";
let counter = 0;
// remove punctuation characters from a given string
let text1 = text.replace(/[\.|,|;|:|!|?|"|'|`|(|)]/g, ""); 
// split a given string by words
let textSplit = text1.split(" ");                          
for (let i = 0; i < textSplit.length; i++) {
    if (textSplit[i].toLowerCase() === userWord.toLowerCase()) {
        counter++;
    }
}
console.log(counter);