<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Number of Distinct Islands

**Difficulty:** `Medium`

## Problem

You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical). You may assume all four edges of the grid are surrounded by water.

An island is considered to be the same as another if and only if one island can be translated (and not rotated or reflected) to equal the other.

Return the number of distinct islands.

Two islands have the same shape when shifting one of them up, down, left or right by some amount makes it cover exactly the same set of cells as the other. Rotating or mirroring an island is not allowed, so an L shape and its mirror image count as two different islands. Cells that touch only at a corner are not connected. If the grid contains no land, the answer is 0.

Input format: The first line contains two integers m and n, the number of rows and columns. Each of the next m lines contains n space-separated values, each 0 or 1, giving the rows of the grid from top to bottom.

Output format: Print a single integer: the number of distinct island shapes.

## Examples

### Example 1

**Input**
```
grid = [[1,1,0,0,0],[1,1,0,0,0],[0,0,0,1,1],[0,0,0,1,1]]
```
**Output**
```
1
```

**Explanation:** There are two islands and both are 2 x 2 squares. Shifting the top left square down by 2 and right by 3 gives the bottom right square, so there is only 1 distinct shape.

### Example 2

**Input**
```
grid = [[1,1,0,1,1],[1,0,0,0,0],[0,0,0,0,1],[1,1,0,1,1]]
```
**Output**
```
3
```

**Explanation:** There are four islands: an L shape in the top left, a horizontal pair in the top right, a horizontal pair in the bottom left, and an L shape turned by 180 degrees in the bottom right. The two pairs have the same shape, but the two L shapes differ because rotation is not allowed, so there are 3 distinct islands.

### Example 3

**Input**
```
grid = [[1,0,1],[0,0,0],[1,0,1]]
```
**Output**
```
1
```

**Explanation:** The four corner cells are four separate islands, since corner cells do not touch. Each is a single cell, so they all have the same shape.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/number-of-distinct-islands).