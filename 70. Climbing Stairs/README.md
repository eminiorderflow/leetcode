DP solution. First define the start or terminal value.

Next, write a formula that calls itself and keep incrementing the iteration.


Trick:

For each element, look at it standalone. There are two ways to reach it, from its previous element or the element before it.
So add up the ways to reach those elements and keeping going forward. 
Lastly return the nth value because it contains all the ways to arrive at that number.