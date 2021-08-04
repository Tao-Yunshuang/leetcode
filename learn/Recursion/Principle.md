Write a function that reverses a string. The input string is given as an array of characters s.

Algorithm:
1. Base case: if left >= right, do nothing.
2. Otherwise, swap s[left] and s[right] and call helper(left + 1, right - 1).

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Algorithm:
1. Start the recursion with head node of the original linked list.
2. Every recursion call is responsible for swapping a pair of nodes. Let's represent the two nodes to be swapped by firstNode and secondNode.
3. Next recursion is made by calling the function with head of the next pair of nodes. This call would swap the next two nodes and make further recursive calls if there are nodes left in the linked list.
4. Once we get the pointer to the remaining swapped list from the recursion call, we can swap the firstNode and secondNode i.e. the nodes in the current recursive call and then return the pointer to the secondNode since it will be the new head after swapping.
5. Once all the pairs are swapped in the backtracking step, we would eventually be returning the pointer to the head of the now swapped list. This head will essentially be the second node in the original linked list. 
