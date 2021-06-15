package iArrays;

import java.util.HashSet;
import java.util.Set;

public class Search {

    //Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i: arr) {
            if (set.contains(i*2) || (set.contains(i/2)&&i%2==0)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    //Given an array of integers arr, return true if and only if it is a valid mountain array.
    //Recall that arr is a mountain array if and only if:
    //arr.length >= 3; There exists some i with 0 < i < arr.length - 1 such that: arr[0] < arr[1] < ... < arr[i - 1] < arr[i]; arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int peak = 0;
        while (peak < arr.length-1 && arr[peak+1] > arr[peak]) {
            peak++;
        }
        if (peak == 0 || peak == arr.length-1) {
            return false;
        }
        while (peak < arr.length-1 && arr[peak] > arr[peak+1]) {
            peak++;
        }
        return peak == arr.length-1;
    }
}
