<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Minimum Swaps to Group All 1's Together

**Difficulty:** `Medium`

## Problem

Given a binary array data, return the minimum number of swaps (each swapping any two elements anywhere in the array) required to group all the 1s in the array together into one contiguous stretch.

Read n on the first line and the n binary values on the second line of standard input. Print the minimum number of swaps needed to standard output.

## Examples

### Example 1

**Input**
```
5
1 0 1 0 1
```
**Output**
```
1
```

**Explanation:** The window [1,0,1] (indices 2-4) already holds 2 of the 3 total ones, needing only 1 more swap.

### Example 2

**Input**
```
5
0 0 0 1 0
```
**Output**
```
0
```

**Explanation:** A single 1 is trivially already grouped, needing no swaps.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/minimum-swaps-to-group-all-1s-together).