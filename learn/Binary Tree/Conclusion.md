Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

Algorithm:
1. Build hashmap value -> its index for inorder traversal.
2. Return helper function which takes as the arguments the left and right boundaries for the current subtree in the inorder traversal. These boundaries are used only to check if the subtree is empty or not. Here is how it works helper(in_left = 0, in_right = n - 1):
3. If in_left > in_right, the subtree is empty, return None.
4. Pick the last element in postorder traversal as a root.
5. Root value has index index in the inorder traversal, elements from in_left to index - 1 belong to the left subtree, and elements from index + 1 to in_right belong to the right subtree.
6. Following the postorder logic, proceed recursively first to construct the right subtree helper(index + 1, in_right) and then to construct the left subtree helper(in_left, index - 1).
7. Return root.

Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.

Algorithm:
1. Build a hashmap to record the relation of value -> index for inorder, so that we can find the position of root in constant time.
2. Initialize an integer variable preorderIndex to keep track of the element that will be used to construct the root.
3. Implement the recursion function arrayToTree which takes a range of inorder and returns the constructed binary tree:
4. if the range is empty, return null;
5. initialize the root with preorder[preorderIndex] and then increment preorderIndex;
6. recursively use the left and right portions of inorder to construct the left and right subtrees.
7. Simply call the recursion function with the entire range of inorder.
