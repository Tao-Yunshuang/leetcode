Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. 

Algorithm:
1. Iterate over the string s and process each character as follows:
2. Case 1) If the current character is a digit (0-9), append it to the number k.
3. Case 2) If the current character is a letter (a-z), append it to the currentString.
4. Case 3) If current character is a opening bracket [, push k and currentString intocountStack and stringStack respectively.
5. Case 4) Closing bracket ]: We must begin the decoding process,
6. We must decode the currentString. Pop currentK from the countStack and decode the pattern currentK[currentString]
7. As the stringStack contains the previously decoded string, pop the decodedString from the stringStack. Update the decodedString = decodedString + currentK[currentString]

An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and newColor. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with newColor.

Return the modified image after performing the flood fill.

Algorithm:
1. we change the color of that pixel to the new color, then check the 4 neighboring pixels to make sure they are valid pixels of the same color, and of the valid ones, we floodfill those, and so on.

Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.

Algorithm:
1. For our BFS routine, we keep a queue, q to maintain the queue of cells to be examined next.
2. We start by adding all the cells with 0s to q.
3. Intially, distance for each 0 cell is 0 and distance for each 1 is INT_MAX, which is updated during the BFS.
4. Pop the cell from queue, and examine its neighbors. If the new calculated distance for neighbor {i,j} is smaller, we add {i,j} to q and update dist[i][j].

There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.

Algorithm:
1. When visiting a room for the first time, look at all the keys in that room.
2. For any key that hasn't been used yet, add it to the todo list (stack) for it to be used.
