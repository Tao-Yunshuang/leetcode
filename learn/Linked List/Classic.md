Given the head of a singly linked list, reverse the list, and return the reversed list.

Algorithm:
1. While you are traversing the list, change the current node's next pointer to point to its previous element.
2. Since a node does not have reference to its previous node, you must store its previous element beforehand.
3. You also need another pointer to store the next node before changing the reference.
4. Do not forget to return the new head reference at the end!

