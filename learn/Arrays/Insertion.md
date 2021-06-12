Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place, do not return anything from your function.
Algorithm:
1. Find the number of zeros which would be duplicated. Let's call it possible_dups. We do need to make sure we are not counting the zeros which would be trimmed off. Since, the discarded zeros won't be part of the final array. The count of possible_dups would give us the number of elements to be trimmed off the original array. Hence at any point, length_ - possible_dups is the number of elements which would be included in the final array.
2. Handle the edge case for a zero present on the boundary of the leftover elements.
   Let's talk about the edge case of this problem. We need to be extra careful when we are duplicating the zeros in the leftover array. This care should be taken for the zero which is lying on the boundary. Since, this zero might be counted as with possible duplicates, or may be just got included in the left over when there was no space left to accommodate its duplicate. If it is part of the possible_dups we would want to duplicate it otherwise we don't.
3. Iterate the array from the end and copy a non-zero element once and zero element twice. When we say we discard the extraneous elements, it simply means we start from the left of the extraneous elements and start overwriting them with new values, eventually right shifting the left over elements and creating space for all the duplicated elements in the array.

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Algorithm:
1. Initialize read pointer p1 to point at index m - 1 of nums1.
2. Initialize read pointer p2 to point at index n - 1 of nums2.
3. Initialize write pointer p to the end of nums1.
4. While p is still within nums1:
      If nums1[p1] exists and is larger than or equal to nums2[p2]: Write nums1[p1] into nums1[p], and decrement p1 by 1.
      Else: Write nums2[p2] into nums1[p], and decrement p2 by 1.
