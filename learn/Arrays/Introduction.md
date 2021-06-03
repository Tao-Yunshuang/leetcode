Given a binary array nums, return the maximum number of consecutive 1's in the array.
Algorithm:
1. Maintain a counter for the number of 1's.
2. Increment the counter by 1, whenever you encounter a 1.
3. Whenever you encounter a 0: a. Use the current count of 1's to find the maximum contiguous 1's till now. b. Afterwards, reset the counter for 1's to 0.
4. Return the maximum in the end.
