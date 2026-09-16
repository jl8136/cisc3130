/*
Name: Junhua Lai
Programming Language: Javascript
IDE / Editor: Visual Studio Code
*/

const arr = [122,61,23,1,2,5,44,12,99,33,66,14,100]
console.log(`Original array: [${arr}]`)

function bubbleSort(arr) {
    const copy = [...arr]
    
    for (let i=0; i<copy.length - 1;i++) {
        for (let j=0; j<copy.length - 1; j++) {
            if (copy[j] > copy[j+1]) {
                let temp = copy[j]
                copy[j] = copy[j+1]
                copy[j+1] = temp
            }
        }
    }
    return copy
}
/* 
Question 1
What is the worst-case Big O time complexity of Bubble Sort?

Question 2
Why does Bubble Sort have this time complexity?
Your explanation should mention the repeated comparisons or nested loops.

Question 3
If Bubble Sort processes 10 elements, approximately how many comparisons could be required compared with 1,000 elements?


*/

function mergeSort(arr) {

}
