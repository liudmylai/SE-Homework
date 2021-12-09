// 1. Write a program to add up all the elements of a number array.
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const addUp = arr => {
    let result = 0;
    // Call a function for each element in arr to add an element value to result
    arr.forEach((item) => result += item);
    return result;
}
console.log(addUp(numbers));