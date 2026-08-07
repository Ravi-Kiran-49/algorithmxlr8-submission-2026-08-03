<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Minimum Window Subsequence

**Difficulty:** `Hard`

## Problem

Given two strings S and T, return the minimum-length contiguous substring W of S such that T is a subsequence of W. If no such window exists, print "(none)". If multiple minimum-length windows exist, return the leftmost one.

Read S on the first line and T on the second line of standard input. Print the minimum window to standard output, or "(none)" if no valid window exists.

## Examples

### Example 1

**Input**
```
abcdebdde
bde
```
**Output**
```
bcde
```

**Explanation:** "bcde" (indices 1-4) is the leftmost minimal window containing 'b','d','e' in order.

### Example 2

**Input**
```
jmeqksfrsdyypylxrxztz
ec
```
**Output**
```
(none)
```

**Explanation:** No 'c' appears after the 'e' in S, so T can never be matched as a subsequence.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/minimum-window-subsequence).