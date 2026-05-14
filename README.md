<div align="center">

<br>

<img src="https://img.shields.io/badge/-%F0%9F%94%A2%20PROJECT%20EULER%20%C3%97%20JAVA-%23000000?style=for-the-badge" alt="Project Euler × Java"/>

<br><br>

> *"Mathematics is not about numbers, equations, or algorithms — it's about understanding."*

<br>

| 🔢 **50 Problems** | ☕ **100% Java** | ✅ **All Verified** | 🧠 **Self-Contained** |
|:---:|:---:|:---:|:---:|
| Problems 1–50 | No dependencies | Answers confirmed | One file per problem |

<br>

[![Language](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Problems](https://img.shields.io/badge/Solved-50%2F50-22c55e?style=flat-square)](#)
[![Site](https://img.shields.io/badge/projecteuler.net-0077B5?style=flat-square&logo=target&logoColor=white)](https://projecteuler.net/)
[![Repo](https://img.shields.io/badge/GitHub-Manoranjini6268-181717?style=flat-square&logo=github)](https://github.com/Manoranjini6268/Project-Euler)

</div>

<br>

---

## 🗺️ Progress Map

```
P01 P02 P03 P04 P05 P06 P07 P08 P09 P10
 ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅

P11 P12 P13 P14 P15 P16 P17 P18 P19 P20
 ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅

P21 P22 P23 P24 P25 P26 P27 P28 P29 P30
 ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅

P31 P32 P33 P34 P35 P36 P37 P38 P39 P40
 ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅

P41 P42 P43 P44 P45 P46 P47 P48 P49 P50
 ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅  ✅
```

---

## 📚 What's Inside

<table>
<tr>
<th>Range</th>
<th>Problems</th>
<th>Core Concepts</th>
</tr>
<tr>
<td><b>1 – 10</b></td>
<td>Multiples · Fibonacci · Largest Prime Factor · Palindromes · LCM · Sum of Squares · 10001st Prime · Largest Product · Pythagorean Triplet · Sum of Primes</td>
<td>Brute force · Number theory · Sieve of Eratosthenes</td>
</tr>
<tr>
<td><b>11 – 20</b></td>
<td>Grid Products · Triangle Numbers · Large Sum · Collatz · Lattice Paths · Power Digits · Number Letters · Max Path Sum · Counting Sundays · Factorial Digits</td>
<td>Grid traversal · Dynamic programming · Combinatorics</td>
</tr>
<tr>
<td><b>21 – 30</b></td>
<td>Amicable Numbers · Name Scores · Non-abundant Sums · Permutations · 1000-digit Fibonacci · Reciprocal Cycles · Quadratic Primes · Spiral Diagonals · Distinct Powers · Digit Powers</td>
<td>Number sequences · String operations · Prime generation</td>
</tr>
<tr>
<td><b>31 – 40</b></td>
<td>Coin Sums · Pandigital Products · Digit Fractions · Digit Factorials · Circular Primes · Palindromes · Truncatable Primes · Pandigital Multiples · Right Triangles · Champernowne</td>
<td>Recursion · Digit manipulation · Pandigital checks</td>
</tr>
<tr>
<td><b>41 – 50</b></td>
<td>Pandigital Prime · Triangle Words · Sub-string Divisibility · Pentagon Numbers · Tri-Penta-Hex · Goldbach · Distinct Factors · Self Powers · Prime Permutations · Consecutive Primes</td>
<td>Advanced primality · Polygonal numbers · Permutation logic</td>
</tr>
</table>

---

## 🚀 Quick Start

### Clone

```bash
git clone https://github.com/Manoranjini6268/Project-Euler.git
cd Project-Euler
```

### Run Any Problem

```bash
javac Problem14.java && java Problem14
# → 837799
```

> Each `.java` file is standalone — no build system, no dependencies, just `javac` and `java`.

**Requirements:** Java 8+

---

## 🔍 Sample Solutions

<details>
<summary><b>Problem 1 — Multiples of 3 or 5</b> &nbsp;|&nbsp; Answer: <code>233168</code></summary>

<br>

**Problem:** Find the sum of all the multiples of 3 or 5 below 1000.

```java
public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        System.out.println(sum); // 233168
    }
}
```

</details>

<details>
<summary><b>Problem 2 — Even Fibonacci Numbers</b> &nbsp;|&nbsp; Answer: <code>4613732</code></summary>

<br>

**Problem:** Find the sum of even-valued Fibonacci terms that do not exceed four million.

```
Sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
Even:           ↑              ↑         ↑          ↑
Sum = 2 + 8 + 34 + 144 + ... = 4613732
```

</details>

<details>
<summary><b>Problem 14 — Longest Collatz Sequence</b> &nbsp;|&nbsp; Answer: <code>837799</code></summary>

<br>

**Problem:** Which starting number under one million produces the longest Collatz chain?

```
Collatz rule:  n → n/2      (if n is even)
               n → 3n + 1   (if n is odd)

837799 → ... → 1   (chain length: 525 steps)
```

</details>

<details>
<summary><b>Problem 11 — Largest Product in a Grid</b> &nbsp;|&nbsp; Answer: <code>70600674</code></summary>

<br>

**Problem:** In the 20×20 grid, find the greatest product of 4 adjacent numbers in any direction (↔ ↕ ↗ ↘).

```
Directions checked:
  Horizontal  →   [a][b][c][d]
  Vertical    ↓   [a]
                  [b]
                  [c]
                  [d]
  Diagonal    ↘   [a]
                     [b]
                        [c]
                           [d]
```

</details>

---

## 🧠 Techniques Used

| Technique | Problems |
|---|---|
| **Sieve of Eratosthenes** | 7, 10, 27, 35, 37, 41, 46, 47, 49, 50 |
| **Dynamic Programming** | 15, 18, 31, 67 |
| **Digit Manipulation** | 16, 20, 30, 34, 38, 40, 43 |
| **Permutation Generation** | 24, 41, 43, 49 |
| **Grid Traversal** | 11 |
| **Collatz / Sequence Chains** | 14 |
| **Pandigital Checks** | 32, 38, 41, 43 |
| **Polygonal Numbers** | 12, 42, 44, 45 |

---

## 📁 Structure

```
Project-Euler/
├── Problem1.java     ← Multiples of 3 or 5          → 233168
├── Problem2.java     ← Even Fibonacci Numbers        → 4613732
├── Problem3.java     ← Largest Prime Factor          → 6857
├── Problem4.java     ← Largest Palindrome Product    → 906609
├── Problem5.java     ← Smallest Multiple             → 232792560
│    ⋮
├── Problem25.java    ← 1000-digit Fibonacci Number   → index 4782
│    ⋮
└── Problem50.java    ← Consecutive Prime Sum         → 997651
```

---

## 🎯 Why This Exists

Project Euler problems are solved not just for the answer, but for the journey:

- 🔬 Experimenting with **brute force first**, then optimizing
- 📐 Translating **mathematical insight into code**
- ☕ Staying comfortable in **core Java** without libraries
- 🏗️ Building intuition for **algorithm complexity**

---

<div align="center">

**[⬆ Back to top](#)**

<sub>Built with ☕ Java · Verified against <a href="https://projecteuler.net/">projecteuler.net</a></sub>

</div>
