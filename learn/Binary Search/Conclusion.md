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

Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

Algorithm:
1. Our binary search (a typical one) proceeds in a number of rounds.
2. At each round, let's maintain the loop invariant that the answer must be in the interval [lo, hi]. Let mi = (lo + hi) / 2. 
3. If letters[mi] <= target, then we must insert it in the interval [mi + 1, hi].
4. Otherwise, we must insert it in the interval [lo, mi].
5. At the end, if our insertion position says to insert target into the last position letters.length, we return letters[0] instead. This is what the modulo operation does.
