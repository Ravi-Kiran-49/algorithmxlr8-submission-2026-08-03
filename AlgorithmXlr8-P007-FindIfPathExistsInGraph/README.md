<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Find if Path Exists in Graph

**Difficulty:** `Easy`

## Problem

There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [u_i, v_i] denotes a bi-directional edge between vertex u_i and vertex v_i. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.

You want to determine if there is a valid path that exists from vertex source to vertex destination.

Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise. A path may pass through any number of vertices. If source equals destination, the answer is true.

Input format: the first line has two integers n and m, where m is the number of edges. Each of the next m lines has two integers u and v, one edge. The last line has two integers source and destination.

Output format: print true if a path exists, otherwise print false.

## Examples

### Example 1

**Input**
```
n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
```
**Output**
```
true
```

**Explanation:** There are two paths from vertex 0 to vertex 2: 0 -> 1 -> 2 and 0 -> 2.

### Example 2

**Input**
```
n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
```
**Output**
```
false
```

**Explanation:** Vertices 0, 1 and 2 form one component and vertices 3, 4 and 5 form another. No edge joins them, so there is no path from 0 to 5.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/find-if-path-exists-in-graph).