package iArrays;

import java.util.*;

public class Conclusion {

    //A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height.
    //Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
    //You are given an integer array heights representing the current order that the students are standing in.
    //Each heights[i] is the height of the ith student in line (0-indexed).
    //Return the number of indices where heights[i] != expected[i].
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int diff = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                diff++;
            }
        }
        return diff;
    }

    //Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int maxOnes = 0;
        int numZero = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                numZero++;
            }
            while (numZero == 2) {
                if (nums[left] == 0) {
                    numZero--;
                }
                left++;
            }
            maxOnes = Math.max(maxOnes, right-left+1);
            right++;
        }
        return maxOnes;
    }

    //Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
            if (set.size() > 3) {
                set.remove(Collections.min(set));
            }
        }
        if (set.size() < 3) {
            return Collections.max(set);
        } else {
            return Collections.min(set);
        }
    }

    //Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] *= -1;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i-1] > 0) {
                result.add(i);
            }
        }
        return result;
    }
}
