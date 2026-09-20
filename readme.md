Name: Junhua Lai

Programming Language: Javascript

IDE / Editor: Visual Studio Code



## Question 1 - What is the worst-case Big O time complexity of Bubble Sort?
 O(n^2)

## Question 2 - Why does Bubble Sort have this time complexity? Your explanation should mention the repeated comparisons or nested loops.
Bubble sort loops through an array multiple times and runs a nested loop to swap each element if needed. 


## Question 3 - If Bubble Sort processes 10 elements, approximately how many comparisons could be required compared with 1,000 elements?
O(10^2) = ~100 comparisions

O(1,000^2) = ~1,000,000 comparisons

So it is around 10,000 times more comparisons. 


## Question 4 - What is the Big O time complexity of Merge Sort?
Merge sort is O(nlog(n))

## Question 5 - Which algorithm generally performs better when the amount of data becomes very large?
Merge sort is generally better because runtime grows nlog(n), which is more efficient than n^2.



## Question 6 - Complete the following:

Bubble Sort = O(n^2)

Merge Sort = O(nlog(n))

## Question 7 - What is the Big O time complexity of Linear Search?
Linear search is O(n). It grows linearly because in the worse case, each element in the array is checked.

## Question 8 - What is the Big O time complexity of Binary Search?
Binary search is O(log(n)). It grows logarithmically because each search divides the search size in half.

## Question 9 - Why does Binary Search require sorted data?
Binary search compares the target against the midpoint of the array to decide if it will either return if the target value was found or search the left or right side. Non-sorted arrays would have potential values disregarded from a comparison check.

## Question 10 - Which search would you use if the data were not sorted? Explain why.
I would use linear search because it does not require the data to be sorted. Binary search requires data to be sorted, so that is not an option.

## Question 11- Which search would generally be better for a very large sorted array? Explain why.
Binary search is generally better because it has a lower time complexity. Linear search is O(n) while binary search is O(log(n)).

## Part 12 — Algorithm Comparison Table
Complete the table.

| Algorithm | Purpose  | Big O |
| -------- | --------|-------- |
| Bubble Sort| Sorting | O(n^2)|
| Merge Sort | Sorting | O(nlog(n)) |
| Linear Search | Searching |O(n) |
| Binary Search | Searching | O(log(n))