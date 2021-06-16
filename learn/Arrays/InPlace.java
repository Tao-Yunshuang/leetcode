package iArrays;

public class InPlace {

    //Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
    //After doing so, return the array.
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int maxNum = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            int old = arr[i];
            arr[i] = maxNum;
            maxNum = Math.max(old, maxNum);
        }
        return arr;
    }

    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //Note that you must do this in-place without making a copy of the array.
    public void moveZeroes(int[] nums) {
        int slow = 0;
        while (slow < nums.length && nums[slow] != 0) {
            slow++;
        }
        int fast = slow + 1;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
                slow++;
            }
            fast++;
        }
    }

    //Given an array nums of non-negative integers, return an array consisting of all the even elements of nums, followed by all the odd elements of nums.
    //You may return any answer array that satisfies this condition.
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int leftRe = nums[left] % 2;
            int rightRe = nums[right] %2;
            if (leftRe == 0 && rightRe == 1) {
                left++;
                right--;
            } else if (leftRe == 0 && rightRe == 0) {
                left++;
            } else if (leftRe == 1 && rightRe == 1) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}
