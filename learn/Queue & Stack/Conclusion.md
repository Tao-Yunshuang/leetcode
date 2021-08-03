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
