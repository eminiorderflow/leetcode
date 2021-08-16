Trick question to make it O(n).

Constraint ```1 <= nums[i] <= n``` plays the trick.

This constraint makes it necessary that all elements can also be an index.
Use these elements as indices to mark the first occurrence of that index as negative and second discovery if found already negative makes it a duplicate.