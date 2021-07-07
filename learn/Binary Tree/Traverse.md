Given the root of a binary tree, return the preorder traversal of its nodes' values.

Algorithm:
1. Let's start from the root and then at each iteration pop the current node out of the stack and push its child nodes.
2. In the implemented strategy we push nodes into output list following the order Top->Bottom and Left->Right, that naturally reproduces preorder traversal.