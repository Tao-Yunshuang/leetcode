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

A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.

Algorithm:
1. We start off by finding the middle element, mid from the given nums array.
2. If this element happens to be lying in a descending sequence of numbers. or a local falling slope(found by comparing nums[i] to its right neighbour), it means that the peak will always lie towards the left of this element.
3. Thus, we reduce the search space to the left of mid(including itself) and perform the same process on left subarray.
4. If the middle element, mid lies in an ascending sequence of numbers, or a rising slope(found by comparing nums[i] to its right neighbour), it obviously implies that the peak lies towards the right of this element.
5. Thus, we reduce the search space to the right of mid and perform the same process on the right subarray.

Suppose an array of length n sorted in ascending order is rotated between 1 and n times.

Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Algorithm:
1. Find the mid element of the array.
2. If mid element > first element of array this means that we need to look for the inflection point on the right of mid.
3. If mid element < first element of array this that we need to look for the inflection point on the left of mid.We stop our search when we find the inflection point, when either of the two conditions is satisfied: nums[mid] > nums[mid + 1] Hence, mid+1 is the smallest. nums[mid - 1] > nums[mid] Hence, mid is the smallest.

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Algorithm:
1. Define a function called findBound which takes three arguments: the array, the target to search for, and a boolean value isFirst which indicates if we are trying to find the first or the last occurrence of target.
2. We use 2 variables to keep track of the subarray that we are scanning. Let's call them begin and end. Initially, begin is set to 0 and end is set to the last index of the array.
3. We iterate until begin is greater than or equal to end.
4. At each step, we calculate the middle element mid = (begin + end) / 2. We use the value of the middle element to decide which half of the array we need to search.
5. nums[mid] == target
6. isFirst is true ~ This implies that we are trying to find the first occurrence of the element. If mid == begin or nums[mid - 1] != target, then we return mid as the first occurrence of the target. Otherwise, we update end = mid - 1
7. isFirst is false ~ This implies we are trying to find the last occurrence of the element. If mid == end or nums[mid + 1] != target, then we return mid as the last occurrence of the target. Otherwise, we update begin = mid + 1
8. nums[mid] > target ~ We update end = mid - 1 since we must discard the right side of the array as the middle element is greater than target.
9. nums[mid] < target ~ We update begin = mid + 1 since we must discard the left side of the array as the middle element is less than target.
10. We return a value of -1 at the end of our function which indicates that target was not found in the array.
11. In the main searchRange function, we first call findBound with isFirst set to true. If this value is -1, we can simply return [-1, -1]. Otherwise, we call findBound with isFirst set to false to get the last occurrence and then return the result.

Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if: |a - x| < |b - x|, or |a - x| == |b - x| and a < b

Algorithm:
1. As a base case, if arr.length == k, return arr.
2. Use binary search to find the index of the closest element to x in arr. Initailize two pointers left and right, with left set equal to this index, and right equal to this index plus one.
3. While the window's size is less than k, check which number is closer to x: arr[left] or arr[right]. Whichever pointer has the closer number, move that pointer towards the edge to include that element in our output.
4. Return the elements inside arr contained within the window defined between left and right.

Given the root of a binary search tree and a target value, return the value in the BST that is closest to the target.

ALgorithm:
1. Go left if target is smaller than current root value.
2. Go right if target is larger than current root value.
3. Choose the closest to target value at each step.
