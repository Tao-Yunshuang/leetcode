The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.

Given n, calculate F(n).

ALgorithm:
1. Check if the provided input value, N, is less than or equal to 1. If true, return N.
2. Otherwise, the function fib(int N) calls itself, with the result of the 2 previous numbers being added to each other, passed in as the argument. This is derived directly from the recurrence relation: Fn = Fn−1 + Fn−2
3. Do this until all numbers have been computed, then return the resulting answer.
