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

#### Test-case
Input
```
3
3
  -1
   6
10
   4
  -5
   4
  -3
   4
   4
  -4
   4
  -5
4
  -2
  -3
  -4
```
Output
```
The nicest part of route 1 is between stops 2 and 3
The nicest part of route 2 is between stops 3 and 9
Route 3 has no nice parts
```
Input
```
10
5
21
22
64
-23
9
-94
-67
76
82
-91
-90
-90
32
9
53
-77
-54
2
20
20
-38
47
6
-63
85
40
-81
-36
5
55
-43
46
-23
6
-76
-66
32
-91
63
6
-82
73
24
3
92
11
26
90
31
98
-37
45
-3
87
82
-18
11
-99
-1
53
56
56
-49
86
-18
-73
72
6
-63
35
-20
-93
-39

```
Output
```
The nicest part of route 1 is between stops 1 and 4
The nicest part of route 2 is between stops 3 and 8
The nicest part of route 3 is between stops 1 and 8
The nicest part of route 4 is between stops 2 and 5
The nicest part of route 5 is between stops 1 and 4
The nicest part of route 6 is between stops 5 and 6
The nicest part of route 7 is between stops 2 and 5
The nicest part of route 8 is between stops 1 and 10
The nicest part of route 9 is between stops 3 and 10
The nicest part of route 10 is between stops 2 and 5
```
## Dynamic Programming
In computer science, mathematics, management science, economics and bioinformatics, dynamic programming (also known as dynamic optimization) is a method for solving a complex problem by breaking it down into a collection of simpler subproblems, solving each of those subproblems just once, and storing their solutions. The next time the same subproblem occurs, instead of recomputing its solution, one simply looks up the previously computed solution, thereby saving computation time at the expense of a (hopefully) modest expenditure in storage space. (Each of the subproblem solutions is indexed in some way, typically based on the values of its input parameters, so as to facilitate its lookup.) The technique of storing solutions to subproblems instead of recomputing them is called "memoization".

### Kadane’s Algorithm
A bit of a background: Kadane's algorithm is based on splitting up the set of possible solutions into mutually exclusive (disjoint) sets. We exploit the fact that any solution (i.e., any member of the set of solutions) will always have a last element i (this is what is meant by "sum ending at position  i"). Thus, we simply have to examine, one by one, the set of solutions whose last element's index is  1, the set of solutions whose last element's index is 2, then {\displaystyle 3} 3, and so forth to n. It turns out that this process can be carried out in linear time.

The runtime complexity of Kadane's algorithm is O(n).
#### Test-case
Input
```
3
3
  -1
   6
10
   4
  -5
   4
  -3
   4
   4
  -4
   4
  -5
4
  -2
  -3
  -4
```
Output
```
The nicest part of route 1 is between stops 2 and 3
The nicest part of route 2 is between stops 3 and 9
Route 3 has no nice parts
```
Input
```
10
5
21
22
64
-23
9
-94
-67
76
82
-91
-90
-90
32
9
53
-77
-54
2
20
20
-38
47
6
-63
85
40
-81
-36
5
55
-43
46
-23
6
-76
-66
32
-91
63
6
-82
73
24
3
92
11
26
90
31
98
-37
45
-3
87
82
-18
11
-99
-1
53
56
56
-49
86
-18
-73
72
6
-63
35
-20
-93
-39

```
Output
```
The nicest part of route 1 is between stops 1 and 4
The nicest part of route 2 is between stops 3 and 5
The nicest part of route 3 is between stops 1 and 2
The nicest part of route 4 is between stops 2 and 4
The nicest part of route 5 is between stops 1 and 4
The nicest part of route 6 is between stops 5 and 6
The nicest part of route 7 is between stops 2 and 6
The nicest part of route 8 is between stops 1 and 10
The nicest part of route 9 is between stops 3 and 8
The nicest part of route 10 is between stops 2 and 3
```
