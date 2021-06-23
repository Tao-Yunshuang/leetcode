Singly Linked List:

Each node in a singly-linked list contains not only the value but also a reference field to link to the next node. By this way, the singly-linked list organizes all the nodes in a sequence.

In most cases, we will use the head node (the first node) to represent the whole list.

Add Operation - Singly Linked List

If we want to add a new value after a given node prev, we should:
1. Initialize a new node cur with the given value;
2. Link the "next" field of cur to prev's next node next;
3. Link the "next" field in prev to cur.

Unlike an array, we don’t need to move all elements past the inserted element. Therefore, you can insert a new node into a linked list in O(1) time complexity, which is very efficient.

Add a Node at the Beginning

As we know, we use the head node head to represent the whole list.

So it is essential to update head when adding a new node at the beginning of the list.
1. Initialize a new node cur;
2. Link the new node to our original head node head.
3. Assign cur to head.

Delete Operation - Singly Linked List
If we want to delete an existing node cur from the singly linked list, we can do it in two steps:
1. Find cur's previous node prev and its next node next;
2. Link prev to cur's next node next.

In our first step, we need to find out prev and next. It is easy to find out next using the reference field of cur. However, we have to traverse the linked list from the head node to find out prev which will take O(N) time on average, where N is the length of the linked list. So the time complexity of deleting a node will be O(N).

The space complexity is O(1) because we only need constant space to store our pointers.

Delete the First Node

If we want to delete the first node, the strategy will be a little different.

As we mentioned before, we use the head node head to represent a linked list.

If we want to delete the first node, we can simply assign the next node to head.

Doubly Linked List:

The doubly linked list works in a similar way but has one more reference field which is known as the "prev" field. With this extra field, you are able to know the previous node of the current node.

Similar to the singly linked list, we will use the head node to represent the whole list.

Add Operation - Doubly Linked List

If we want to insert a new node cur after an existing node prev, we can divide this process into two steps:
1. link cur with prev and next, where next is the original next node of prev;
2. re-link the prev and next with cur.

Similar to the singly linked list, both the time and the space complexity of the add operation are O(1).

Delete Operation - Doubly Linked List

If we want to delete an existing node cur from the doubly linked list, we can simply link its previous node prev with its next node next.

Since we no longer need to traverse the linked list to get the previous node, both the time and space complexity are O(1).
