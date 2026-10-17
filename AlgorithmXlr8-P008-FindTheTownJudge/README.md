<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Find the Town Judge

**Difficulty:** `Easy`

## Problem

In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:
- The town judge trusts nobody.
- Everybody (except for the town judge) trusts the town judge.
- There is exactly one person that satisfies the first two properties.

You are given an array trust where trust[i] = [a_i, b_i] representing that the person labeled a_i trusts the person labeled b_i. If a trust relationship does not exist in the trust array, then such a trust relationship does not exist. Trust is not transitive: if a trusts b and b trusts c, that does not mean a trusts c.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise. When n = 1 and there are no trust pairs, person 1 is the judge.

Input format: the first line contains two integers n and m, where m is the number of trust pairs (m can be 0). Each of the next m lines contains two integers a and b, meaning person a trusts person b.

Output format: print a single integer, the label of the town judge, or -1.

## Examples

### Example 1

**Input**
```
n = 2, trust = [[1,2]]
```
**Output**
```
2
```

**Explanation:** Person 1 trusts person 2 and person 2 trusts nobody, so person 2 is trusted by everyone else and is the town judge.

### Example 2

**Input**
```
n = 3, trust = [[1,3],[2,3],[3,1]]
```
**Output**
```
-1
```

**Explanation:** Person 3 is trusted by persons 1 and 2, but person 3 trusts person 1, so person 3 cannot be the judge. Nobody else is trusted by everyone else, so there is no judge.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/find-the-town-judge).