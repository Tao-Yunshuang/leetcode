Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

Algorithm:
1. First, we set up a false "prehead" node that allows us to easily return the head of the merged list later. We also maintain a prev pointer, which points to the current node for which we are considering adjusting its next pointer.
2. Then, we do the following until at least one of l1 and l2 points to null: if the value at l1 is less than or equal to the value at l2, then we connect l1 to the previous node and increment l1. Otherwise, we do the same, but for l2.
3. Then, regardless of which list we connected, we increment prev to keep it one step behind one of our list heads.
4. After the loop terminates, at most one of l1 and l2 is non-null. Therefore (because the input lists were in sorted order), if either list is non-null, it contains only elements greater than all of the previously-merged elements. This means that we can simply connect the non-null list to the merged list and return it.

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Algorithm:
1. Initialize current node to dummy head of the returning list.
2. Initialize carry to 0.Initialize p and q to head of l1 and l2 respectively.
3. Loop through lists l1 and l2 until you reach both ends.
4. Set x to node p's value. If p has reached the end of l1, set to 0.
5. Set y to node q's value. If q has reached the end of l2, set to 0.
6. Set sum=x+y+carry.
7. Update carry=sum/10.
8. Create a new node with the digit value of (summod10) and set it to current node's next, then advance current node to next.
9. Advance both p and q.
10. Check if carry=1, if so append a new node with digit 1 to the returning list.
11. Return dummy head's next node.
