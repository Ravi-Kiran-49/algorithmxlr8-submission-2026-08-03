<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Walls and Gates

**Difficulty:** `Medium`

## Problem

You are given an m x n grid rooms initialized with these three possible values:
- -1 A wall or an obstacle.
- 0 A gate.
- INF Infinity means an empty room. We use the value 2^31 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.

Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.

The distance is the number of steps in the shortest walk from the room to any gate, where one step moves to a cell directly up, down, left or right. A walk can pass through empty rooms and gates but never through walls, and it may not leave the grid. Walls and gates keep their values -1 and 0, and an empty room that no gate can reach keeps the value 2147483647.

Input format: the first line contains two integers m and n, the number of rows and columns. Each of the next m lines contains n integers separated by single spaces, one row of rooms, where each value is -1, 0 or 2147483647.

Output format: print the grid after filling it, one row per line, with the values separated by single spaces.

## Examples

### Example 1

**Input**
```
rooms = [[2147483647,-1,0,2147483647],[2147483647,2147483647,2147483647,-1],[2147483647,-1,2147483647,-1],[0,-1,2147483647,2147483647]]
```
**Output**
```
[[3,-1,0,1],[2,2,1,-1],[1,-1,2,-1],[0,-1,3,4]]
```

**Explanation:** There are two gates, at (0,2) and (3,0). For example, the room at (0,0) is 3 steps from the gate at (3,0) by walking down through (1,0) and (2,0), and the room at (3,3) is 4 steps from the gate at (0,2) by the path (2,2), (1,2), (0,2) after first moving left to (3,2).

### Example 2

**Input**
```
rooms = [[0,2147483647],[2147483647,2147483647]]
```
**Output**
```
[[0,1],[1,2]]
```

**Explanation:** The only gate is at the top-left corner. Its two neighbours are 1 step away and the bottom-right room is 2 steps away.

### Example 3

**Input**
```
rooms = [[2147483647,-1,0],[2147483647,-1,2147483647]]
```
**Output**
```
[[2147483647,-1,0],[2147483647,-1,1]]
```

**Explanation:** The wall column in the middle separates the two rooms on the left from the gate, so they stay INF. The room below the gate is 1 step away.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/walls-and-gates).