<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Course Schedule II

**Difficulty:** `Medium`

## Problem

There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

- For example, the pair [0, 1] indicates that to take course 0 you have to first take course 1.

Return the ordering of courses you should take to finish all courses. The ordering must contain every course exactly once, and for every pair [ai, bi] course bi must appear before course ai. If it is impossible to finish all courses (the prerequisites contain a cycle), return an empty array.

On LeetCode any valid ordering is accepted. This judge expects one specific ordering: the lexicographically smallest valid one. You get it by repeatedly taking, among all courses whose prerequisites are already taken, the one with the smallest label (Kahn's topological sort with a min heap instead of a plain queue).

Input format: the first line contains numCourses. The second line contains m, the number of prerequisite pairs. Each of the next m lines contains two integers a b, meaning course b must be taken before course a.

Output format: print the course labels of the ordering on one line, separated by single spaces. If it is impossible to finish all courses, print an empty line.

## Examples

### Example 1

**Input**
```
numCourses = 2, prerequisites = [[1,0]]
```
**Output**
```
[0,1]
```

**Explanation:** There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1].

### Example 2

**Input**
```
numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
```
**Output**
```
[0,1,2,3]
```

**Explanation:** Course 0 has no prerequisites, so it is taken first. After that both course 1 and course 2 are available and the smaller label 1 is taken, then course 2. Course 3 needs both 1 and 2, so it comes last. [0,2,1,3] is also a valid order, but [0,1,2,3] is the lexicographically smallest one, which is what this judge expects.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/course-schedule-ii).