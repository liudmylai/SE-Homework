// 3. Write a program to find the longest element in a string array.
const colors = ['red', 'blue', 'yellow', 'black', 'green'];
const getLongestElement = arr => {
    let result = '';
    let tmp = 0;
    // Call a function for each element in arr to find the longest element and set it to result
    arr.forEach((value) => {
        if (tmp < value.length) {
            tmp = value.length;
            result = value;
        }
    });
    return result;
}
console.log(getLongestElement(colors));