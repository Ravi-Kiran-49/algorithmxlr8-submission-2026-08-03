<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Number of Connected Components in an Undirected Graph

**Difficulty:** `Medium`

## Problem

You have a graph of n nodes, labeled from 0 to n - 1. You are given an integer n and an array edges where edges[i] = [ai, bi] indicates that there is an edge between ai and bi in the graph.

Return the number of connected components in the graph.

The graph is undirected, so every edge can be travelled in both directions. A connected component is a maximal group of nodes in which every node can reach every other node of the group through edges. A node that has no edges forms a component by itself, so every node belongs to exactly one component.

Input format: The first line contains the integer n. The second line contains the integer m, the number of edges. Each of the next m lines contains two integers a and b, describing an undirected edge between nodes a and b.

Output format: Print a single integer: the number of connected components in the graph.

## Examples

### Example 1

**Input**
```
n = 5, edges = [[0,1],[1,2],[3,4]]
```
**Output**
```
2
```

**Explanation:** Nodes 0, 1 and 2 are connected through the edges 0-1 and 1-2, forming one component. Nodes 3 and 4 form a second component.

### Example 2

**Input**
```
n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]
```
**Output**
```
1
```

**Explanation:** The edges form a single chain 0-1-2-3-4, so all five nodes are in one component.

### Example 3

**Input**
```
n = 6, edges = [[0,1],[2,3],[4,5]]
```
**Output**
```
3
```

**Explanation:** The three edges join the nodes into three separate pairs: {0, 1}, {2, 3} and {4, 5}.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/number-of-connected-components-in-an-undirected-graph).