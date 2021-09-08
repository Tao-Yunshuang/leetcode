Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of unique values from 1 to n. Return the answer in any order.

Algorithm:
1. Let's pick up number i out of the sequence 1 ..n and use it as the root of the current tree. Then there are i - 1 elements available for the construction of the left subtree and n - i elements available for the right subtree.
2. Now let's repeat the step above for the sequence 1 ... i - 1 to construct all left subtrees, and then for the sequence i + 1 ... n to construct all right subtrees.
3. This way we have a root i and two lists for the possible left and right subtrees. The final step is to loop over both lists to link left and right subtrees to the root.

Convert a Binary Search Tree to a sorted Circular Doubly-Linked List in place.

You can think of the left and right pointers as synonymous to the predecessor and successor pointers in a doubly-linked list. For a circular doubly linked list, the predecessor of the first element is the last element, and the successor of the last element is the first element.

We want to do the transformation in place. After the transformation, the left pointer of the tree node should point to its predecessor, and the right pointer should point to its successor. You should return the pointer to the smallest element of the linked list.

Algorithm:
1. Initiate the first and the last nodes as nulls.
2. Call the standard inorder recursion helper(root) :
3. If node is not null :
4. Call the recursion for the left subtree helper(node.left).
5. If the last node is not null, link the last and the current node nodes.
6. Else initiate the first node.
7. Mark the current node as the last one : last = node.
8. Call the recursion for the right subtree helper(node.right).
9. Link the first and the last nodes to close DLL ring and then return the first node.

Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

Algorithm:
1. In this approach, we maintain a stack.
2. Initially, we push a -1 onto the stack to mark the end.
3. We start with the leftmost bar and keep pushing the current bar's index onto the stack until we get two successive numbers in descending order, i.e. until we get 
a[i]<a[i−1].
4. Now, we start popping the numbers from the stack until we hit a number stack[j] on the stack such that a[stack[j]]≤a[i].
5. Every time we pop, we find out the area of rectangle formed using the current element as the height of the rectangle and the difference between the the current element's index pointed to in the original array and the element stack[top−1]−1 as the width i.e. if we pop an element stack[top] and i is the current index to which we are pointing in the original array, the current area of the rectangle will be considered as: (i−stack[top−1]−1)×a[stack[top]].
6. Further, if we reach the end of the array, we pop all the elements of the stack and at every pop, this time we use the following equation to find the area: (stack[top]−stack[top−1])×a[stack[top]], where stack[top] refers to the element just popped.
7. Thus, we can get the area of the of the largest rectangle by comparing the new area found everytime.

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Algorithm:
1. If the first integer to consider has index n that means that the current permutation is done.
2. Iterate over the integers from index first to index n - 1.
3. Place i-th integer first in the permutation, i.e. swap(nums[first], nums[i]).
4. Proceed to create all permutations which starts from i-th integer : backtrack(first + 1).
5. Now backtrack, i.e. swap(nums[first], nums[i]) back.

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

Algorithm:
1. If the input is empty, return an empty array.
2. Initialize a data structure (e.g. a hash map) that maps digits to their letters.
3. Use a backtracking function to generate all possible combinations.
4. The function should take 2 primary inputs: the current combination of letters we have, path, and the index we are currently checking.
5. As a base case, if our current combination of letters is the same length as the input digits, that means we have a complete combination. Therefore, add it to our answer, and backtrack.
6. Otherwise, get all the letters that correspond with the current digit we are looking at, digits[index].
7. Loop through these letters. For each letter, add the letter to our current path, and call backtrack again, but move on to the next digit by incrementing index by 1.
8. Make sure to remove the letter from path once finished with it.
