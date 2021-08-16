Binary search problem.

Divide the set in 2. Trick while dividing is to not exceed the boundary while adding, so use start + (end - start)/2 formula.

After diving the set in 2, keep closing down the endpoints by incrementing start and decrementing end.
Do until they converge, and have a return condition after convergence.