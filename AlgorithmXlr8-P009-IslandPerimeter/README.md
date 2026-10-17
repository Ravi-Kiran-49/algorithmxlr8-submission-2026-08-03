<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Island Perimeter

**Difficulty:** `Easy`

## Problem

You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

The perimeter is the number of unit edges of land cells that touch water or the outside of the grid. Each land cell has 4 edges, and every edge shared by two neighbouring land cells is not part of the perimeter.

Input format: the first line contains two integers row and col. Each of the next row lines contains col space separated integers, each 0 or 1.

Output format: print a single integer, the perimeter of the island.

## Examples

### Example 1

**Input**
```
grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
```
**Output**
```
16
```

**Explanation:** There are 7 land cells, giving 7 x 4 = 28 edges. There are 6 pairs of neighbouring land cells, and each pair hides 2 edges, so the perimeter is 28 - 12 = 16.

### Example 2

**Input**
```
grid = [[1]]
```
**Output**
```
4
```

**Explanation:** A single land cell has all 4 of its edges on the perimeter.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/island-perimeter).