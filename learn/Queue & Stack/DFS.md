Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

Algorithm:
1. Start traversing the graph from the given node.
2. We would take a hash map to store the reference of the copy of all the nodes that have already been visited and cloned. The key for the hash map would be the node of the original graph and corresponding value would be the corresponding cloned node of the cloned graph. If the node already exists in the visited we return corresponding stored reference of the cloned node.
3. If we don't find the node in the visited hash map, we create a copy of it and put it in the hash map. Note, how it's important to create a copy of the node and add to the hash map before entering recursion.
4. Now make the recursive call for the neighbors of the node. Pay attention to how many recursion calls we will be making for any given node. For a given node the number of recursive calls would be equal to the number of its neighbors. Each recursive call made would return the clone of a neighbor. We will prepare the list of these clones returned and put into neighbors of clone node which we had created earlier. This way we will have cloned the given node and it's neighbors.

You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

Return the number of different expressions that you can build, which evaluates to target.

Algorithm:
1. The brute force approach is based on recursion. We need to try to put both the + and - symbols at every location in the given nums array and find out the assignments which lead to the required result S.
2. For this, we make use of a recursive function calculate(nums, i, sum, S), which returns the assignments leading to the sum S, starting from the ith index onwards, provided the sum of elements upto the ith element is sum.
3. This function appends a + sign and a - sign both to the element at the current index and calls itself with the updated sum as sum+nums[i] and sum−nums[i] repectively along with the updated current index as i+1.
4. Whenver, we reach the end of the array, we compare the sum obtained with S. If they are equal, we increment the count value to be returned.
5. Thus, the function call calculate(nums, 0, 0, S) retuns the required no. of assignments.
