Name: Junhua Lai

Programming Language: Java

IDE / Editor: IntelliJ IDEA

## Question 1 - What does ADT stand for?
ADT stands for abstract data types.

## Question 2 - In your own words, what is an Abstract Data Type?
Abstract Data Type describes what a data type does.

## Question 3 - What is the difference between an ADT and its implementation?
### Use the following idea in your explanation: WHAT versus: HOW
Abstract Data Types describe what the data type does while the implementation is how it is implemented in code.

## Question 4 - Can two programmers create different implementations of the same ADT? Explain your answer.
Yes, ADT only describe what something does, programmers can implement it in different ways as long as it follows 
behavior described by the ADT. For example, one can use array and another can use a linked list to get to the same outcome.

## Question 5 - If one programmer creates a Stack using an array and another creates a Stack using a linked list, are both still Stacks? Explain why.
Yes, if the output of the code follows the behavior of what the stack ADT described, then it's just different implementations.

## Question 6 - What does LIFO mean?
LIFO means last in, first out. The most recently added item is the first one to get removed.

## Question 7 - Why did 55 get removed before 15?
55 was the last in, and because the stack is LIFO, 55 gets removed first because it was the most recently added.

## Question 8
If the Stack contains:
* A
* B
* C
* D
#### and D was added last, which item should pop() remove first?
pop() would remove D because it was added last.


## Question 9 - Give one real-world or software example where a Stack could be useful.
#### Examples discussed in class may include:
* Browser Back history
* Undo operations
* Function calls
#### Explain your example.
The undo operation is a real-world example of a stack that reverses your most recent action. 
For example, if I'm organizing some photos in Dolphin (KDE file manager), I might batch rename some files, move them to another directory,
then trash some files. Each action would be pushed to the stack. If I want to recover files from trash, executing undo would pop the last added action 
from the stack and reverse what I just did in Dolphin. It would save time from having to manually move files back from `~/.local/share/Trash/files`.