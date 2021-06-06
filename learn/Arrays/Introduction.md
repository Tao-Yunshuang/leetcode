Given a binary array nums, return the maximum number of consecutive 1's in the array.
Algorithm:
1. Maintain a counter for the number of 1's.
2. Increment the counter by 1, whenever you encounter a 1.
3. Whenever you encounter a 0: a. Use the current count of 1's to find the maximum contiguous 1's till now. b. Afterwards, reset the counter for 1's to 0.
4. Return the maximum in the end.

Given an array nums of integers, return how many of them contain an even number of digits.
Algorithm:
1. Divide the number by 10 again and again to get the number of digits.

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Algorithm:
1. We can use two pointers to read the positive and negative parts of the array - one pointer j in the positive direction, and another i in the negative direction.
2. Now that we are reading two increasing arrays (the squares of the elements), we can merge these arrays together using a two-pointer technique.
