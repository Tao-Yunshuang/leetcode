Recursion is an approach to solving problems using a function that calls itself as a subroutine.

You might wonder how we can implement a function that calls itself. The trick is that each time a recursive function calls itself, it reduces the given problem into subproblems. The recursion call continues until it reaches a point where the subproblem can be solved without further recursion.

A recursive function should have the following properties so that it does not result in an infinite loop:
1. A simple base case (or cases) — a terminating scenario that does not use recursion to produce an answer.
2. A set of rules, also known as recurrence relation that reduces all other cases towards the base case.
Note that there could be multiple places where the function may call itself.

For a problem, if there exists a recursive solution, we can follow the guidelines below to implement it. 

For instance, we define the problem as the function F(X) to implement, where X is the input of the function which also defines the scope of the problem.

Then, in the function F(X), we will:

1. Break the problem down into smaller scopes, such as x0∈X, x1∈X,...,x n∈X;
2. Call function F(x0),F(x1),...,F(xn) recursively to solve the subproblems of X;
3. Finally, process the results from the recursive function calls to solve the problem corresponding to X.

Divide and Conquer

A divide-and-conquer algorithm works by recursively breaking the problem down into two or more subproblems of the same or related type, until these subproblems become simple enough to be solved directly [1]. Then one combines the results of subproblems to form the final solution.

There are in general three steps that one can follow in order to solve the problem in a divide-and-conquer manner.
1. Divide. Divide the problem S into a set of subproblems: {S1, S2,...Sn} where n≥2, i.e. there are usually more than one subproblem.
2. Conquer. Solve each subproblem recursively.
3. Combine. Combine the results of each subproblem.
