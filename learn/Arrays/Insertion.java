package iArrays;

public class Insertion {

    //Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
    //Note that elements beyond the length of the original array are not written.
    //Do the above modifications to the input array in place, do not return anything from your function.
    public void duplicateZeros(int[] arr) {
        int dupZero = 0;
        int left = 0;
        boolean endZero = false;
        while (left + dupZero < arr.length) {
            if (arr[left] == 0) {
                if (left + dupZero == arr.length-1) {
                    endZero = true;
                    break;
                }
                dupZero++;
            }
            left++;
        }
        int right = arr.length - 1;
        if (endZero) {
            arr[right] = 0;
            right--;
        }
        while (right >= 0) {
            arr[right] = arr[right-dupZero];
            if (arr[right-dupZero]==0) {
                arr[right-1] = 0;
                right--;
                dupZero--;
            }
            right--;
        }
    }

    //You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    //Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    //The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    //To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] >= nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
        }
    }
}
