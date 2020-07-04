# How does a queue get tested #
A queue can be tested in several different ways.
The two most important ways are:

## Queue length limits ##
Here three things could be tested:
1. The maximum length of a queue can be teted by trying to exceed the maximum number of items.
2. If the queue works if no element is inside the queue
3. Dynamic changes in queue length can be tested by adding a transaction to the queue during the processing of the elements.

## Queue selection and sorting ##
Here you could test if the queue is implemented right by analyzing the runtime and if the FIFO principal is applied when using the queue.
