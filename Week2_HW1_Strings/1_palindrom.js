// 1. Write a program to find if a user entered string is a palindrome or not (for example "racecar" is a palindrome)

let prompt = require('prompt-sync')();
let userText = prompt('Enter some text: ');
let result = "";
for (let i = userText.length; i > 0; i--) {
    result += userText.charAt(i - 1);
}
(result.toLowerCase() === userText.toLowerCase()) ? console.log(userText + ' is a palindrom string') : console.log(userText + ' is not a palindrom string');

