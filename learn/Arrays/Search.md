Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
Algorithm:

1. Loop from i = 0 to arr.length, maintaining in a hashTable the array elements from [0, i - 1].

Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

  arr.length >= 3
  
  There exists some i with 0 < i < arr.length - 1 such that:
  
    arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    
    arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    
Algorithm:

Let's walk up from left to right until we can't: that has to be the peak. We should ensure the peak is not the first or last element. Then, we walk down. If we reach the end, the array is valid, otherwise its not.
