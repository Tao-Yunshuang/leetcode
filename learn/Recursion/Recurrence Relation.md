You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

Algorithm:
1. If the tree is empty root == null or the value to find is here val == root.val - return root.
2. If val < root.val - go to search into the left subtree searchBST(root.left, val).
3. If val > root.val - go to search into the right subtree searchBST(root.right, val).
4. Return root.
