<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Protect Sheep

**Difficulty:** `Easy`

## Problem

Bob is a farmer. He has a large pasture with many sheep. Recently, he has lost some of them due to wolf attacks. He thus decided to place some shepherd dogs in such a way that all his sheep are protected.

The pasture is a rectangle consisting of R x C cells. Each cell is either empty, contains a sheep, a wolf or a dog. Sheep and dogs always stay in place, but wolves can roam freely around the pasture by repeatedly moving to the left, right, up or down to a neighboring cell. When a wolf enters a cell with a sheep, it consumes it. However, no wolf can enter a cell with a dog.

Initially there are no dogs. Place dogs onto the pasture in such a way that no wolf can reach any sheep, or determine that it is impossible. Note that since you have many dogs, you do not need to minimize their number.

Notes:
- Dogs can only be placed on empty cells. Sheep and wolves keep their cells.
- On Codeforces any valid placement is accepted. In this version, when protection is possible, the expected answer places a dog on every empty cell.

Input format:
The first line contains two integers R and C separated by a space, the number of rows and columns. Each of the next R lines contains C characters describing one row of the pasture:
- . means an empty cell;
- S means a sheep;
- W means a wolf.

Output format:
If it is impossible to protect all sheep, print a single line No. Otherwise print Yes on the first line, followed by R lines describing the pasture after placing the dogs: every empty cell becomes D, and every S and W stays where it was.

## Examples

### Example 1

**Input**
```
R = 6, C = 6, pasture = ["..S...","..S.W.",".S....","..W...","...W..","......"]
```
**Output**
```
Yes
DDSDDD
DDSDWD
DSDDDD
DDWDDD
DDDWDD
DDDDDD
```

**Explanation:** No wolf shares a side with a sheep. Placing a dog on every empty cell means each wolf can only look at dogs, other wolves or the border, so it can never move toward a sheep. All sheep are safe and the pasture is printed with every . replaced by D.

### Example 2

**Input**
```
R = 1, C = 2, pasture = ["SW"]
```
**Output**
```
No
```

**Explanation:** The wolf stands right next to the sheep and can eat it in one move. There is no cell between them where a dog could be placed, so protection is impossible.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/cf-948a-protect-sheep).