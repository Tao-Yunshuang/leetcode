Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Algorithm:
1. Let the binary representation of n to be b1, b2,..., blength_limit, from the Least Significant Bit(LSB) to the Most Significant Bit(MSB). For the ith bit, if bi=1, it means we need to multiply the result by x2i.
2. Initially x1=x, and for each i>1, we can use the result of x2i−1 to get x2i in one step.
