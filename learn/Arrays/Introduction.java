package iArrays;

public class Introduction {

    // Given a binary array nums, return the maximum number of consecutive 1's in the array.
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        return Math.max(count, maxCount);
    }

    //Given an array nums of integers, return how many of them contain an even number of digits.
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int num: nums) {
            int digit = 0;
            while (num != 0) {
                digit++;
                num = num/10;
            }
            if (digit%2 == 0) {
                even++;
            }
        }
        return even;
    }

    //Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                result[i] = nums[left]*nums[left];
                left++;
            } else {
                result[i] = nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}
