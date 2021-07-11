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

You are given a perfect binary tree where all leaves are on the same level, and every parent has two children.

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Algorithm:
1. We start at the root node. Since there are no more nodes to process on the first level or level 0, we can establish the next pointers on the next level i.e. level 1. An important thing to remember in this algorithm is that we establish the next pointers for a level N while we are still on level N−1 and once we are done establishing these new connections, we move on to N and do the same thing for N+1.
2. As we just said, when we go over the nodes of a particular level, their next pointers are already established. This is what helps get rid of the queue data structure from the previous approach and helps save space. To start on a particular level, we just need the leftmost node. From there on out, its just a linked list traversal.

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Algorithm:
1. We start at the root node. Since there are no more nodes to process on the first level or level 0, we can establish the next pointers on the next level i.e. level 1. An important thing to remember in this algorithm is that we establish the next pointers for a level N while we are still on level N−1 and once we are done establishing these new connections, we move on to N and do the same thing for N+1.
2. As we just said, when we go over the nodes of a particular level, their next pointers are already established. This is what helps get rid of the queue data structure from the previous approach and helps save space. To start on a particular level, we just need the leftmost node. From there on its just a linked list traversal.

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Algorithm:
1. Start traversing the tree from the root node.
2. If the current node itself is one of p or q, we would mark a variable mid as True and continue the search for the other node in the left and right branches.
3. If either of the left or the right branch returns True, this means one of the two nodes was found below.
4. If at any point in the traversal, any two of the three flags left, right or mid become True, this means we have found the lowest common ancestor for the nodes p and q.
