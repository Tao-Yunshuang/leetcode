Binary Tree:

Each node of the tree will have a root value and a list of references to other nodes which are called child nodes. From graph view, a tree can also be defined as a directed acyclic graph which has N nodes and N-1 edges.

A Binary Tree is one of the most typical tree structure. As the name suggests, a binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child.

Pre-order Traversal:

Pre-order traversal is to visit the root first. Then traverse the left subtree. Finally, traverse the right subtree.

In-order Traversal:

In-order traversal is to traverse the left subtree first. Then visit the root. Finally, traverse the right subtree.

Post-order Traversal:

Post-order traversal is to traverse the left subtree first. Then traverse the right subtree. Finally, visit the root.

Recursion-Top Down:
1. return specific value for null node
2. update the answer if needed
3. left_ans = top_down(root.left, left_params)
4. right_ans = top_down(root.right, right_params)
5. return the answer if needed

Recursion-Bottom Up:
1. return specific value for null node
2. left_ans = bottom_up(root.left)
3. right_ans = bottom_up(root.right)
4. return answers
