<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Diet Plan Performance

**Difficulty:** `Easy`

## Problem

A diet performance system tracks calories from day to day. For every consecutive sequence of k days, if the total calories consumed is less than lower, lose a point; if it exceeds upper, gain a point; otherwise, nothing changes. Given calories, k, lower, and upper, return the total points scored.

Read n, k, lower, and upper on the first line of standard input, then n space-separated integers on the second line. Print the total points to standard output.

## Examples

### Example 1

**Input**
```
5 1 3 3
1 2 3 4 5
```
**Output**
```
0
```

**Explanation:** Two days lose a point, two days gain a point, and one day is neutral, netting 0.

### Example 2

**Input**
```
2 2 0 1
3 2
```
**Output**
```
1
```

**Explanation:** The only window sums to 5, above upper (1), gaining 1 point.

### Example 3

**Input**
```
4 2 1 5
6 5 0 0
```
**Output**
```
0
```

**Explanation:** The three windows' points cancel out to a total of 0.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/diet-plan-performance).