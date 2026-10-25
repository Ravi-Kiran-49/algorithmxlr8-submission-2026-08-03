<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Graph Valid Tree

**Difficulty:** `Medium`

## Problem

You have a graph of n nodes labeled from 0 to n - 1. You are given an integer n and a list of edges where edges[i] = [a_i, b_i] indicates that there is an undirected edge between nodes a_i and b_i in the graph.

Return true if the edges of the given graph make up a valid tree, and false otherwise.

A valid tree is connected (every node can reach every other node) and has no cycles. Equivalently, the graph has exactly n - 1 edges and is connected. A single node with no edges is a valid tree, while a graph with more than one connected component is not.

Input format: the first line contains n. The second line contains m, the number of edges. Each of the next m lines contains an edge as two integers a and b separated by a space.

Output format: print true if the edges form a valid tree, otherwise print false.

## Examples

### Example 1

**Input**
```
n = 5, edges = [[0,1],[0,2],[0,3],[1,4]]
```
**Output**
```
true
```

**Explanation:** There are 4 = n - 1 edges, every node is reachable from node 0, and there is no cycle, so the graph is a tree.

### Example 2

**Input**
```
n = 5, edges = [[0,1],[1,2],[2,3],[1,3],[1,4]]
```
**Output**
```
false
```

**Explanation:** The edges 1-2, 2-3 and 1-3 form a cycle, so the graph is not a tree.

### Example 3

**Input**
```
n = 4, edges = [[0,1],[2,3]]
```
**Output**
```
false
```

**Explanation:** There is no cycle, but nodes 0 and 1 cannot reach nodes 2 and 3, so the graph is not connected.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/graph-valid-tree).