Singly Linked List:

Each node in a singly-linked list contains not only the value but also a reference field to link to the next node. By this way, the singly-linked list organizes all the nodes in a sequence.

Add Operation - Singly Linked List

If we want to add a new value after a given node prev, we should:
1. Initialize a new node cur with the given value;
2. Link the "next" field of cur to prev's next node next;
3. Link the "next" field in prev to cur.

Unlike an array, we don’t need to move all elements past the inserted element. Therefore, you can insert a new node into a linked list in O(1) time complexity, which is very efficient.
