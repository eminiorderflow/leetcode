Two Solutions:

1. Easy and Slow - Iterate through all the elements, O(n) complexity and return element index which exceeds the target.
Then handle the boundary conditions.

2. Medium and Fast - Divide array in 2, then keep finding the mid points where element is or should be located.
After division, on right arrays keep incrementing the mid value by using class field.

Use - For creating new array, Arrays.copyOfRange(array, start, end) where array is original array that needs to be sliced. 
Start is start index and end last index + 1.