# QueueList
This Java program implements a queue using two stacks.

1. **QueueList Class:**
   - It has two private stacks, `myStack1` and `myStack2`, and an integer variable `count` to keep track of the number of elements in the queue.
   - Provides methods to simulate queue operations:
     - `enqueue(Integer a)`: Adds an element to the queue.
     - `dequeue()`: Removes and returns the front element of the queue.
     - `getFront()`: Retrieves the front element of the queue without removing it.
     - `isEmpty()`: Checks if the queue is empty.
     - `size()`: Returns the size of the queue.
     - `clear()`: Empties the queue.
     - `display()`: Prints the elements of the queue.

2. **Main Method:**
   - Initializes a `QueueList` object and demonstrates various queue operations using the methods provided:
     - Enqueues elements (1, 2, 3) into the queue.
     - Displays the contents of the queue if it's not empty.
     - Dequeues elements and handles exceptions if the queue is empty.
     - Enqueues new elements (4, 5, 6) into the queue.
     - Displays the contents of the queue, retrieves the first element, checks if the queue is empty, and displays the size.
     - Clears the queue and checks if it's empty afterward.

The code simulates a queue using two stacks (`myStack1` and `myStack2`) by transferring elements between the stacks to maintain the order required for queue operations. It's an example of how a queue can be implemented using stacks in Java.
