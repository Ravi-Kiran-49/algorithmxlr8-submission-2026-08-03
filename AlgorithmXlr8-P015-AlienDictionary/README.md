<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Alien Dictionary

**Difficulty:** `Hard`

## Problem

There is a new alien language that uses the English alphabet. However, the order of the letters is unknown to you.

You are given a list of strings words from the alien language's dictionary. Now it is claimed that the strings in words are sorted lexicographically by the rules of this new language.

If this claim is incorrect, and the given arrangement of strings in words cannot correspond to any order of letters, return "". Otherwise, return a string of the unique letters in the new alien language sorted in lexicographically increasing order by the new language's rules.

Lexicographic order works as in a normal dictionary: two words are compared at the first position where they differ, and the word whose letter comes first in the alphabet is the smaller one. If one word is a prefix of the other, the shorter word is smaller. So:

- Each pair of adjacent words gives at most one rule "letter x comes before letter y", taken from their first differing position.
- A word followed directly by one of its own proper prefixes (for example "abc" before "ab") makes the claim impossible, and the answer is "".
- Rules that contradict each other (for example z before x and x before z) also make the answer "".

The answer must contain every letter that appears anywhere in words exactly once, and no other letters.

On LeetCode any valid order is accepted when several exist. The tests on this judge are built so that either no order exists or the order of all the letters is fully determined, so the expected output is unique.

Input format: the first line contains an integer n, the number of words. Each of the next n lines contains one word.

Output format: print the letters in alien order as one string with no spaces. If no valid order exists, print an empty line.

## Examples

### Example 1

**Input**
```
words = ["wrt","wrf","er","ett","rftt"]
```
**Output**
```
"wertf"
```

**Explanation:** Comparing adjacent words: wrt and wrf give t before f; wrf and er give w before e; er and ett give r before t; ett and rftt give e before r. Chaining the rules gives w < e < r < t < f, so the answer is wertf.

### Example 2

**Input**
```
words = ["z","x","z"]
```
**Output**
```

```

**Explanation:** z then x gives z before x, but x then z gives x before z. The rules contradict each other, so no order exists and an empty line is printed.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/alien-dictionary).