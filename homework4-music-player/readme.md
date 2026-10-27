### Part A
| Method       | Structures it touches                                                                                     | Big-O | One-line reason                                                                                                                           |
|--------------|-----------------------------------------------------------------------------------------------------------|-------|-------------------------------------------------------------------------------------------------------------------------------------------|
| addSong      | library(hashMap), playlist (doubly linked list)                                                           | O(1)  | It access the tail stored in a variable and links it to the new nod. Duplicate check is also a hashmap lookup.                            |
| findSong     | library(hashMap)                                                                                          | O(1)  | It does one hashmap lookup                                                                                                                |
| play         | library(hashMap), history(Stack), playcounts(hashMap)                                                     | O(1)  | It does one hashmap lookup, one stack push, and one play-count update, which are all O(1).                                                |
| queueLater   | library (hashMap), up next (ArrayDeque)                                                                   | O(1)  | ArrayDeque allows for direct adding to back of queue                                                                                      |
| queueNext    | library (hashMap), up next (ArrayDeque)                                                                   | O(1)  | ArrayDeque allows for direct adding to front of queue                                                                                     |
| next         | library(hashMap), up next(ArrayDeque), playlist(doubly linked list), history(stack), play counts(hashMap) | O(n)  | Every removed song (n) from queue has to be checked so worse case is o(n)                                                                 |
| back         | library(hashMap), Up next(ArrayDeque), history(Stack), play counts(hashMap)                               | O(n)  | Every removed song (n) from history stack has to be checked so worse case is O(n)                                                         |
| removeSong   | library(hashMap), playlist(doubly linked list), play counts(hashMap)                                      | O(1)  | Hashmap stores the node directly so it can be accessed directly. So it can be unlink it through its prev/next pointers without traversal. |
| showPlaylist | playlist(doubly linked list)                                                                              | O(n)  | It traverses through linked list to grab all nodes                                                                                        |

### Part B
Playlist: The playlist contains all the songs in order and is a doubly linked list that allows me to add and remove songs.
If it were instead implemented with an array, it would get slower from O(1) to O(n) because it would have to shift the elements.
If I used Java's LinkedList instead of creating my own, getting the position of a node would be O(n) because using Java's built-in methods like `.get()` or `.indexOf()` would require traversing the list.

History: The history stores all the previously played songs in a stack so that if you use `back()`, it would pop the most recently played song from history. 
If history were to become an array, it would be relatively the same, but you would have to manage arrays which have a fixed size. 
If I were to implement my own stack, the cost between my own implementation and using the built-in would be the same, but using the built-in class saves a lot of time over creating of my own stack.