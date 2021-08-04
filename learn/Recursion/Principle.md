Write a function that reverses a string. The input string is given as an array of characters s.

Algorithm:
1. Base case: if left >= right, do nothing.
2. Otherwise, swap s[left] and s[right] and call helper(left + 1, right - 1).
