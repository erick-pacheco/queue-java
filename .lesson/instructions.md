# Instructions  
### Description:
In the Collections Framework, there is a branch related to Queues. A **queue** is a data structure that is ordered and whose elements are worked with from only the beginning and end of the data structure. An element is **ordered** when it holds a specific position in the data structure. Queues adhere to the “first in, first out”, or FIFO, method of processing elements. When adding to a queue, the element is added to the end of the data structure and when removing from the queue, the element that is at the beginning of the data structure is removed.

Common queue operations:
* offer: add to the end of the data structure
* poll: remove from the front of the data structure
* peek: get the first element in the data structure

In this activity you will learn about how to create and use queues. Please follow the steps below:

### Steps:
1. Add the following code inside of the **main()** method:
```Java
 ArrayDeque<Integer> queue = new ArrayDeque<>();
```
The statement we added creates an ArrayDeque, a subtype of Queue, and assigns it to a corresponding reference variable. This queue can store Integer objects.

2. Now that we have a queue to work with, let's add some elements to it. Add the following code inside of the **main()** method, below any code you have in it so far:
```Java
queue.offer(1);
queue.offer(2);
queue.offer(3);
queue.offer(4);
queue.offer(5);
```
The **offer()** method adds to the queue. Elements are added to the end of the queue.

3. Next, let's see what the first element in the queue is. Add the following code inside of the **main()** method, below any code you have in it so far:
```Java
System.out.println(queue.peek());
```
The **peek()** method returns the value of the first element in the queue. The output to the console should be `1`.

4. Now it's your turn. Create a queue that will hold String objects.
5. Add the following String objects into your queue: `"Zero", "One", "Two", "Three", "Four", "Five"`
6. Create a for-each loop that iterates over your queue.
7. For every iteration of the loop, remove and print out the current first element using the **System.out.println()** and **poll()** method.
8. Run the program. Notice how the queue polls the first item that went into the queue first. This is called FIFO (First in first out).

### Test:
Use the test provided. 

#### Sample output:
```
1
Zero
One
Two
Three
Four
Five
```