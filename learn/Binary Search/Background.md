Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(logn) runtime complexity.

ALgorithm:
1. Initialise left and right pointers : left = 0, right = n - 1.
2. While left <= right :
3. Compare middle element of the array nums[pivot] to the target value target.
4. If the middle element is the target target = nums[pivot] : return pivot.
5. If the target is not yet found :
6. If target < nums[pivot], continue the search on the left right = pivot - 1.
7. Else continue the search on the right left = pivot + 1.
