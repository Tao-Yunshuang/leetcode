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

You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.

Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.

Algorithm:
1. First of all, we create a stack and then we push the head node to the stack. In addition, we create a variable called prev which would help us to track the precedent node at each step during the iteration.
2. Then we enter a loop to iterate the stack until the stack becomes empty.
3. Within the loop, at each step, we first pop out a node (named curr) from the stack. Then we establish the links between prev and curr. Then in the following steps, we take care of the nodes pointed by the curr.next and curr.child pointers respectively, and strictly in this order.
4. First, if the curr.next does exist (i.e. there exists a right subtree), we then push the node into the stack for the next iteration.
5. Secondly, if the curr.child does exist (i.e. there exists a left subtree), we then push the node into the stack. In addition, unlike the child.next pointer, we need to clean up the curr.child pointer since it should not be present in the final result.
6. And voila. Lastly, we also employ the pseudoHead node to render the algorithm more elegant, as we discussed in the previous approach.

Given a Circular Linked List node, which is sorted in ascending order, write a function to insert a value insertVal into the list such that it remains a sorted circular list. The given node can be a reference to any single node in the list and may not necessarily be the smallest value in the circular list.

If there are multiple suitable places for insertion, you may choose any place to insert the new value. After the insertion, the circular list should remain sorted.

If the list is empty (i.e., the given node is null), you should create a new single circular list and return the reference to that single node. Otherwise, you should return the originally given node.

Algorithm:
1. As we mentioned in the intuition, we loop over the linked list with two pointers (i.e. prev and curr) step by step. The termination condition of the loop is that we get back to the starting point of the two pointers (i.e. prev == head)
2. During the loop, at each step, we check if the current place bounded by the two pointers is the right place to insert the new value.
3. If not, we move both pointers one step forwards.
4. Case 1). The value of new node sits between the minimal and maximal values of the current list. As a result, it should be inserted within the list.
5. Case 2). The value of new node goes beyond the minimal and maximal values of the current list, either less than the minimal value or greater than the maximal value. In either case, the new node should be added right after the tail node (i.e. the node with the maximal value of the list).
6. Case 3). Finally, there is one case that does not fall into any of the above two cases. This is the case where the list contains uniform values.
