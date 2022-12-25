## PROBLEM STATEMENT

Egor has a table of size n \times mn×m, with lines numbered from 11 to nn and columns numbered from 11 to mm. Each cell has a color that can be presented as an integer from 11 to 10^510
5
.

Let us denote the cell that lies in the intersection of the rr-th row and the cc-th column as (r, c)(r,c). We define the manhattan distance between two cells (r_1, c_1)(r
1
​
,c
1
​
) and (r_2, c_2)(r
2
​
,c
2
​
) as the length of a shortest path between them where each consecutive cells in the path must have a common side. The path can go through cells of any color. For example, in the table 3 \times 43×4 the manhattan distance between (1, 2)(1,2) and (3, 3)(3,3) is 33, one of the shortest paths is the following: (1, 2) \to (2, 2) \to (2, 3) \to (3, 3)(1,2)→(2,2)→(2,3)→(3,3).

Egor decided to calculate the sum of manhattan distances between each pair of cells of the same color. Help him to calculate this sum

```bash
The first line contains two integers nn and mm (1 \leq n \le m1≤n≤m, n \cdot m \leq 100\,000n⋅m≤100000) — number of rows and columns in the table.

Each of next nn lines describes a row of the table. The ii-th line contains mm integers c_{i1}, c_{i2}, \ldots, c_{im}c
i1
​
 ,c
i2
​
 ,…,c
im
​
  (1 \le c_{ij} \le 100\,0001≤c
ij
​
 ≤100000) — colors of cells in the ii-th row.
```
