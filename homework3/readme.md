Name: Junhua Lai

Programming Language: Java

IDE / Editor: IntelliJ IDEA

## Question 1 - What does ADT stand for?
ADT stands for abstract data types.

## Question 2 - In your own words, what is an Abstract Data Type?
Abstract Data Type describes what a data type should have and do.

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
For example, if I'm organizing some photos in a file manager like Dolphin from KDE, I might batch rename some files, move them to another directory,
then trash some files. Each action would be pushed to the stack. If I want to recover files from trash, executing undo would pop the last added action 
from the stack and reverse what I just did. It would save time from having to manually move files back from `~/.local/share/Trash/files`.

## Question 10 - What does FIFO mean?
FIFO means first in, first out. The first thing in the queue gets processed first before it moves to the next.

## Question 11 - Why was 15 removed before 55?
The queue is FIFO and 15 was first, so it would be the first to be dequeued if `dequeue()` was called. 

## Question 12 -If customers enter a line in this order:
* Alex
* Maria
* John
* Sarah
#### who should leave the Queue first?
Alex would leave the queue first because they are the first person to enter.

## Question 13 - Give one real-world or software example where a Queue could be useful.
#### Possible examples:
* Printer jobs
* Customer-service requests
* Tasks waiting to be processed
* People waiting in line
#### Explain your answer.
People waiting in line are a first in, first out queue example because since they are first in line, 
they will be the first to be served and get out of the line.

# Part 15 — Stack vs Queue
#### Scenario 1 — Undo Feature
#### A text editor remembers your recent actions.
#### If you type:
* A
* B
* C
#### the most recent action should be undone first.
#### Stack or Queue?
#### Explain.
This would be a stack because it is last in, first out. C would be the undone first since it is the most recent action pushed to the undo Stack.

## Scenario 2 — Printer
#### Three students send documents to a printer.
#### The first document submitted should normally print first.
#### Stack or Queue?
#### Explain.
This is an example of a queue because the first item sent to the printing queue will be printed and would be first in, first out.

## Scenario 3 — Browser Back Button
#### You visit:
Google
YouTube
GitHub
Amazon
#### You click the Back button.
#### Which page should appear first?
#### What ADT does this resemble?
This resembles a stack because it's last in, first out. If you were on amazon, and you click the
back button, GitHub would appear.

## Scenario 4 — Customer Service
#### Customers are waiting to talk to an employee.
#### The person who arrived first should normally be helped first.
#### Stack or Queue?
This would be a queue because it's first in, first out. The person first in line would get served and
get dequeued before the next person in line gets served. 

## Scenario 5 — Plates
#### You place five plates on top of one another.
#### Which ADT does this represent?
#### Explain.
This would be a stack because it's last in, first out. Ideally, you take the top plate first which is the last one to be put on top of the stack.

# Part 16 — Predict the Output

#### Question 14 - What does pop() return?
18

#### Question 15 - What does the final peek() return?
22

#### Question 16 - What does dequeue() return?
7

#### Question 17 - What does the final peek() return?
12

# Part 17 — Compare the ADTs
#### Complete the table.

| Feature            | Stack                | Queue          |
|--------------------|----------------------|----------------|
| Rule               | LIFO                 | FIFO           |
| Add operation      | push()               | enqueue()      |
| Remove operation   | pop()                | dequeue()      |
| View next item     | peek()               | peek()         |
| First item removed | most recent          | oldest         |

# Part 18 — Connect the ADT to the Implementation. Answer the following.
#### Question 18 - If you implement a Stack using an array, which part is the ADT?
The methods of the Stack that does the adding and removing operations
#### Question 19 - Which part is the implementation?
The actual code of the methods, variables, conditions, etc.
#### Question 20 -If you replace the array with a linked list but keep the same Stack operations, did the ADT change? Explain.
It did not because ADT just defines the methods and behavior the class will be
