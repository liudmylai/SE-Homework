// 1. Write a program to find if a user entered string is a palindrome or not (for example "racecar" is a palindrome)

const prompt = require('prompt-sync')();
const userText = prompt('Enter some text: ');
let isPalindrome = true;

// split the text in half and do a mirrored character comparison
for (let i = 0, n = userText.length; i < Math.floor(n / 2); i++) {
    if (userText.charAt(i).toLowerCase() !== userText.charAt(n - 1 - i).toLowerCase()) {
        isPalindrome = false;
        break;
    }
}
(isPalindrome) ? console.log(userText + ' is a palindrome') : console.log(userText + ' is NOT a palindrome');