# Algebra Simplifying Program
This is a command line app for simplifying algebraic expressions.
## Background
This is my first Java project. I wanted to explore more about expression parsing, and I figured that the domain of algebra would be a good place to start!

## Installation
The only prerequesite is the **jvm** (https://www.java.com/en/download/)

This app only works on Windows. The jar is too large to store on GitHub, so feel free to 
download it from my Google Drive instead 
(https://drive.google.com/file/d/1_SSqXgHrTwpiJs3AOPSRMXAGe2UzvzSs/view?usp=sharing). Simply download it, and double click on the jar to run!

## How to Use
- This program will simplify valid algebraic expressions. 
This is **not** the same thing as an equation - note that you can't have the "=" sign!
- Equations with nested brackets are allowed - for instance, `x(x(x+1)+1)+1` will simplify to `x^3 + x^2 + x + 1`.
It can also simplify a sum of terms without brackets - for instance, `x + 2x` will simplify to `3x`.
- It can simplify products of terms - for instance, `yyy` will simplify to `y^3`.
- Spaces are ignored, so `x+1` and `x + 1` are treated as equivalent.
- It is **not** able to understand any expression which cannot be simplified to a polynomial 
(possibly with negative exponents). For instance, it can understand `x^-1 + xy` but cannot understand
 `(x+y)^-1` or `x^y` Hence, terms such as `x^2y` will be interpreted to mean `x^2*y`.

## Licence and Credits
This project is free and open-source software, made by Lorne Hyde.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY.
