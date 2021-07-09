Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

Algorithm:
1. Build hashmap value -> its index for inorder traversal.
2. Return helper function which takes as the arguments the left and right boundaries for the current subtree in the inorder traversal. These boundaries are used only to check if the subtree is empty or not. Here is how it works helper(in_left = 0, in_right = n - 1):
3. If in_left > in_right, the subtree is empty, return None.
4. Pick the last element in postorder traversal as a root.
5. Root value has index index in the inorder traversal, elements from in_left to index - 1 belong to the left subtree, and elements from index + 1 to in_right belong to the right subtree.
6. Following the postorder logic, proceed recursively first to construct the right subtree helper(index + 1, in_right) and then to construct the left subtree helper(in_left, index - 1).
7. Return root.
