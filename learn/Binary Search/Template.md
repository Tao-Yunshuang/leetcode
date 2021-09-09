Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Algorithm:
1. If x < 2, return x.
2. Set the left boundary to 2, and the right boundary to x / 2.
3. While left <= right:
4. Take num = (left + right) / 2 as a guess. Compute num * num and compare it with x:
5. If num * num > x, move the right boundary right = pivot -1
6. Else, if num * num < x, move the left boundary left = pivot + 1
7. Otherwise num * num == x, the integer square root is here, let's return it
8. Return right
