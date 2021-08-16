Kadane's Algorithm.

The way to do this is to start looking at the increasing sum, O(n) and compare it with the next element in the list.
If the next element is grater than the running sum, start the list from that element.

Trick:

Use 0 as breaking point, until the running sum is greater than 0, keep adding else break to current element and compare with the most recent max value.