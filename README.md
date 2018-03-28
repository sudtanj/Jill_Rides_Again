# Jill Rides Again Problem Analysis - UVa Judges
A problem analysis project about Maximum Subarray Problem in Universitas Pelita Harapan solved by using Greedy Algorithm and Dynamic Algorithm.

## Project Member
| No | Profile Picture | Member Name | Github Userid | Student Id Number |
| ------ | ------ | ------ | ------ | ------ |
| 1. | <img src="https://avatars.githubusercontent.com/bryanchr" width=100 height=100 /> |Bryan Christofel Yehezkiel | <a title="@bryanchr" href="https://github.com/bryanchr">@bryanchr</a> | 00000016528 | 
| 2. | <img src="https://avatars.githubusercontent.com/feroniameimei" width=100 height=100/> | Feronia Meilinda | <a title="@feroniameimei" href="https://github.com/feroniameimei">@feroniameimei</a> |   00000012566 |
| 3. | <img src="https://avatars.githubusercontent.com/rickhenhermawan" width=100 height=100/> | Rickhen Hermawan | <a title="@rickhenhermawan" href="https://github.com/rickhenhermawan">@rickhenhermawan</a> |           00000012311 |
| 4. | <img src="https://avatars.githubusercontent.com/sudtanj" width=100 height=100/> | Sudono Tanjung | <a title="@sudtanj" href="https://github.com/sudtanj">@sudtanj</a> |              				 00000012273 |

## Greedy Algorithm
A greedy algorithm is an algorithmic paradigm that follows the problem solving heuristic of making the locally optimal choice at each stage with the hope of finding a global optimum. In many problems, a greedy strategy does not in general produce an optimal solution, but nonetheless a greedy heuristic may yield locally optimal solutions that approximate a global optimal solution in a reasonable time.

### Brute Force Algorithm
Brute-force search is an exhaustive method that checks all possibilities for the solution to the problem. This algorithm is simple to implement and is guaranteed to find a solution. Brute force is slow and inefficient when the problem size is large, but is often used when the size is small and manageable. If simplicity is more important than speed, then brute force is a reasonable approach.

The running time of this algorithm is O(n<sup>2</sup>).

## Dynamic Programming
In computer science, mathematics, management science, economics and bioinformatics, dynamic programming (also known as dynamic optimization) is a method for solving a complex problem by breaking it down into a collection of simpler subproblems, solving each of those subproblems just once, and storing their solutions. The next time the same subproblem occurs, instead of recomputing its solution, one simply looks up the previously computed solution, thereby saving computation time at the expense of a (hopefully) modest expenditure in storage space. (Each of the subproblem solutions is indexed in some way, typically based on the values of its input parameters, so as to facilitate its lookup.) The technique of storing solutions to subproblems instead of recomputing them is called "memoization".

### Kadane’s Algorithm
A bit of a background: Kadane's algorithm is based on splitting up the set of possible solutions into mutually exclusive (disjoint) sets. We exploit the fact that any solution (i.e., any member of the set of solutions) will always have a last element i (this is what is meant by "sum ending at position  i"). Thus, we simply have to examine, one by one, the set of solutions whose last element's index is  1, the set of solutions whose last element's index is 2, then {\displaystyle 3} 3, and so forth to n. It turns out that this process can be carried out in linear time.

The runtime complexity of Kadane's algorithm is O(n).
