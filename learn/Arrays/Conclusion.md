A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
Return the number of indices where heights[i] != expected[i].

Algorithm:
1. Build the correct order of heights by sorting another array, then compare the two arrays.

Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.

Algorithm:
1. Let's use left and right pointers to keep track of the current sequence a.k.a. our window. Let's expand our window by moving the right pointer forward until we reach a point where we have more than one 0 in our window. When we reach this invalid state, let's contract our window by moving the left pointer forward until we have a valid window again. By expanding and contracting our window from valid and invalid states, we are able to traverse the array efficiently without repeated overlapping work.
2. Now we can break this approach down into a few actionable steps: While our window is in bounds of the array...
  1. Add the rightmost element to our window
  2. Check if our window is invalid. If so, contract the window until valid.
  3. Update our the longest sequence we've seen so far
  4. Continue to expand our window

Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.

Algorithm:
1. For each number in the Array, we add it into the Set of maximums. If this causes there to be more than 3 numbers in the Set, then we evict the smallest number.
2. At the end, we check whether or not there are 3 numbers in the Set. If there are, this means the third maximum exists, and will be the minimum in the Set. If not, this means there was no third maximum, and so we should return the maximum of the Set, as per the problem requirements.

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Algorithm:
1. Iterate over the input array one element at a time.
2. For each element nums[i], mark the element at the corresponding location negative if it's not already marked so i.e. nums[nums[i]−1]×−1 .
3. Now, loop over numbers from 1⋯N and for each number check if nums[j] is negative. If it is negative, that means we've seen this number somewhere in the array.
4. Add all the numbers to the resultant array which don't have their corresponding locations marked as negative in the original array.
