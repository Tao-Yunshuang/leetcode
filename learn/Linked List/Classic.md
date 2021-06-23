Given the head of a singly linked list, reverse the list, and return the reversed list.

Algorithm:
1. While you are traversing the list, change the current node's next pointer to point to its previous element.
2. Since a node does not have reference to its previous node, you must store its previous element beforehand.
3. You also need another pointer to store the next node before changing the reference.
4. Do not forget to return the new head reference at the end!

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Algorithm:
1. Initiate sentinel node as ListNode(0) and set it to be the new head: sentinel.next = head.
2. Initiate two pointers to track the current node and its predecessor: curr and prev.
3. While curr is not a null pointer:
  1. Compare the value of the current node with the value to delete.
    1. In the values are equal, delete the current node: prev.next = curr.next.
    2. Otherwise, set predecessor to be equal to the current node.
  2. Move to the next node: curr = curr.next.
4. Return sentinel.next.
