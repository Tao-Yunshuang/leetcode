Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Algorithm:
1. Return 0 if root is null
2. Left_depth = maximum_depth(root.left)
3. Right_ans = bottom_up(root.right)
4. Return answers

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Algorithm:
1. Their two roots have the same value.
2. The right subtree of each tree is a mirror reflection of the left subtree of the other tree.

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Algorithm:
1. One is going through the tree by considering at each step the node itself and its children.
2. If node is not a leaf, one calls recursively hasPathSum method for its children with a sum decreased by the current node value.
3. f node is a leaf, one checks if the the current sum is zero, i.e if the initial sum was discovered.

Given the root of a binary tree, return the number of uni-value subtrees.

A uni-value subtree means all nodes of the subtree have the same value.

Algorithm:
1. The node has no children (base case)
2. All of the node's children are univalue subtrees, and the node and its children all have the same value
