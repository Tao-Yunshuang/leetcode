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

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).

Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Algorithm:
1. Initiate the pointer start to 0, and the pointer end to n - 1.
2. Perform standard binary search. While start <= end:
3. Take an index in the middle mid as a pivot.
4. If nums[mid] == target, the job is done, return mid.
5. Now there could be two situations:
6. Pivot element is larger than the first element in the array, i.e. the subarray from the first element to the pivot is non-rotated, as shown in the following graph.
7. If the target is located in the non-rotated subarray: go left: `end = mid - 1`.
8. Otherwise: go right: `start = mid + 1`.
9. Pivot element is smaller than the first element of the array, i.e. the rotation index is somewhere between 0 and mid. It implies that the sub-array from the pivot element to the last one is non-rotated, as shown in the following graph.
10. If the target is located in the non-rotated subarray: go right: `start = mid + 1`.
11. Otherwise: go left: `end = mid - 1`.
12. We're here because the target is not found. Return -1.
