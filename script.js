// Data set
const arr = [122,61,23,1,2,5,44,12,99,33,66,14,100]
console.log(`Original Array:
    [${arr}]`)

// Output
const bubbleSortedArray = bubbleSort([...arr])
console.log(`Bubble Sort Result:
    [${bubbleSortedArray}]`)

const mergeSortedArray = mergeSort([...arr])
console.log(`Merge Sort Result:
    [${mergeSortedArray}]`)

const searchHelper = value => value === -1 ? "Target not found" : `Target found at index ${value}`
const targets = [122,14,9999]

targets.forEach((v,i) => {
   console.log(`Linear Search ${i + 1}:    
        Searching for  = ${v}
        ${searchHelper(linearSearch(arr, v))}`
    )
})
targets.forEach((v,i) => {
   console.log(`Binary Search ${i + 1}:    
        Searching for ${v}
        ${searchHelper(binarySearch(mergeSortedArray, v))}`
    )
})


// Bubble Sort
function bubbleSort(arr) {    
    if (arr.length <= 1) return arr
    for (let i=0; i<arr.length - 1;i++) {
        for (let j=0; j<arr.length-1-i; j++) {
            if (arr[j] > arr[j+1]) {
                let temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
    return arr
}


// Merge Sort
function mergeSort(arr) {
    if (arr.length <= 1) return arr

    const length = arr.length
    const middle = Math.floor(length / 2) 

    const left = []
    const right = []

    for (let i=0; i<arr.length;i++) {
        if (i < middle) left.push(arr[i])
        else right.push(arr[i])
    }


    return merge(mergeSort(left), mergeSort(right))
}

function merge(left, right) {
    const mergedArray = []
    let i = 0
    let j = 0
    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            mergedArray.push(left[i])
            i++
        } else {
            mergedArray.push(right[j])
            j++
        }
    }

    while (i < left.length) {
        mergedArray.push(left[i])
        i++
    }

    while (j < right.length) {
        mergedArray.push(right[j])
        j++
    }

    return mergedArray
}


// Linear Search
function linearSearch(arr,value) {
    if (arr.length === 0) return -1;
    for (let i=0; i<arr.length; i++) {
        if (arr[i] === value) return i
    }
    return -1
}


// Binary Search
function binarySearch(arr,value) {
        if (arr.length === 0) return -1
        let left = 0
        let right = arr.length - 1
        while (left <= right) {
            const mid = Math.floor((left + right) / 2)
            if (arr[mid] === value) return mid

            if (arr[mid] < value) left = mid+1
            else right = mid-1
        }
        return -1
}


    


