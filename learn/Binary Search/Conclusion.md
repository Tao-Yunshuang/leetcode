Given a positive integer num, write a function which returns True if num is a perfect square else False.

Algorithm:
1. If num < 2, return True.
2. Set the left boundary to 2, and the right boundary to num / 2.
3. While left <= right:
4. Take x = (left + right) / 2 as a guess. Compute guess_squared = x * x and compare it with num:
5. If guess_squared == num, then the perfect square is right here, return True.
6. If guess_squared > num, move the right boundary right = x - 1.
7. Otherwise, move the left boundary left = x + 1.
8. If we're here, the number is not a prefect square. Return False.
