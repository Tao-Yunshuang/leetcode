You are given an m x n grid rooms initialized with these three possible values.

-1 A wall or an obstacle.

0 A gate.

INF Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.

Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.

Algorithm:
1. we initiate breadth-first search (BFS) from all gates at the same time.
2. Since BFS guarantees that we search all rooms of distance d before searching rooms of distance d + 1, the distance to an empty room must be the shortest.
