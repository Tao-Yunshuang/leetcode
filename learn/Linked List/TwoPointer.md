Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Algorithm:
1. The space complexity can be reduced to O(1) by considering two pointers at different speed - a slow pointer and a fast pointer. The slow pointer moves one step at a time while the fast pointer moves two steps at a time.
2. If there is no cycle in the list, the fast pointer will eventually reach the end and we can return false in this case.
3. Now consider a cyclic list and imagine the slow and fast pointers are two runners racing around a circle track. The fast runner will eventually meet the slow runner. Why? Consider this case (we name it case A) - The fast runner is just one step behind the slow runner. In the next iteration, they both increment one and two steps respectively and meet each other.

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Notice that you should not modify the linked list.

Algorithm:
1. First, we allocate a Set to store ListNode references.
2. Then, we traverse the list, checking visited for containment of the current node.
3. If the node has already been seen, then it is necessarily the entrance to the cycle. If any other node were the entrance to the cycle, then we would have already returned that node instead.
4. Otherwise, the if condition will never be satisfied, and our function will return null.

Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

It is guaranteed that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Algorithm:
1. Set pointer pA to point at headA.
2. Set pointer pB to point at headB.
3. While pA and pB are not pointing at the same node:
4. If pA is pointing to a null, set pA to point to headB.
5. Else, set pA to point at pA.next.
6. If pB is pointing to a null, set pB to point to headA.
7. Else, set pB to point at pB.next.
8. Return the value pointed to by pA (or by pB; they're the same now).
