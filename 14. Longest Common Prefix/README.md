2 solutions.

1. Start with empty prefix ```""``` and keep adding character to it if it occurs in all strings.

2. Preferred: Start with the first String as prefix and keep substringing it until matched with the next String. Repeat to run through all the strings.
 
 Hint:
 Use String.indexOf(prefix) in a while loop until a no-match(==0) to break the loop.