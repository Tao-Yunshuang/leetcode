Given the root of a binary tree, return the preorder traversal of its nodes' values.

Algorithm:
1. Let's start from the root and then at each iteration pop the current node out of the stack and push its child nodes.
2. In the implemented strategy we push nodes into output list following the order Top->Bottom and Left->Right, that naturally reproduces preorder traversal.

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Algorithm:
1. Let's start from the root and then push the left child until it is null.
2. Pop the node and push its right child.

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Algorithm:
1. Initiate queue with a root and start from the level number 0 : level = 0.
2. While queue is not empty :
3. Start the current level by adding an empty list into output structure levels.
4. Compute how many elements should be on the current level : it's a queue length.
5. Pop out all these elements from the queue and add them into the current level.
6. Push their child nodes into the queue for the next level.
7. Go to the next level level++.
