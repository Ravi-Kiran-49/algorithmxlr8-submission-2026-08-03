<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Check If a String Contains All Binary Codes of Size K

**Difficulty:** `Medium`

## Problem

Given a binary string s and an integer k, return true if every possible binary code of length k (there are exactly 2^k of them) appears as a substring of s, or false otherwise.

Read s on the first line and k on the second line of standard input, and print true or false to standard output.

## Examples

### Example 1

**Input**
```
00110110
2
```
**Output**
```
true
```

**Explanation:** All 4 possible 2-bit codes (00, 01, 10, 11) appear somewhere in s.

### Example 2

**Input**
```
0110
1
```
**Output**
```
true
```

**Explanation:** Both possible 1-bit codes (0 and 1) appear in s.

### Example 3

**Input**
```
0110
2
```
**Output**
```
false
```

**Explanation:** Not all 4 possible 2-bit codes appear in this short string.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/check-if-a-string-contains-all-binary-codes-of-size-k).