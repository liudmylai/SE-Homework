// // 4. Make a calculator using switch/case and take a user input to perform any calculation. If user enters any value other than 1-5, display a message 'Invalid Option' and end the program.

main: {
    let prompt = require('prompt-sync')();
    let num1 = Number(prompt('Enter the first number: '));
    let num2 = Number(prompt('Enter the second number: '));
    console.log('MENU\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit');
    let userOption = Number(prompt('Choose the option: '));
    let result;
    switch (userOption) {
        case 1:
            result = num1 + num2;
            break;
        case 2:
            result = num1 - num2;
            break;
        case 3:
            result = num1 * num2;
            break;
        case 4:
            result = num1 / num2;
            break;
        case 5:
            break main;
        default:
            console.log('Invalid Option');
            break main;
    }
    console.log(result);
}
