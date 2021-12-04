// 2. Write a program to find how many letters, numbers, and special characters are in a user entered string.

let prompt = require('prompt-sync')();
let userText = prompt('Enter some text: ');
let text = userText.toUpperCase();
let numbers = 0;
let letters = 0;
let characters = 0;
for (let i = 0; i < text.length; i++) {
    let charCode = text.charCodeAt(i);
    // check if the character is a number
    if (charCode >= 48 && charCode <= 57) {
        numbers++;
    // else check if the character is a letter    
    } else if (charCode >= 65 && charCode <= 90) {
        letters++;
    // else the character is a special character   
    } else {
        characters++;
    }
}
console.log("Numbers: " + numbers + " Letters: " + letters + " Characters: " + characters);