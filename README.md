<p align="center">
  <img src="https://i.imgur.com/yourbanner.gif" alt="Sudoku Solver Banner">
</p>

# 🧩 Sudoku Solver — Console + File Input

A fully functional **Sudoku Solver** built in **Java** using **Backtracking**.  
Created by **Asmit Mandal(Asmit159)**, this project can solve any valid 9×9 Sudoku —  
either entered **manually through the console** or **uploaded via a text file**.

---
## Technology Used
![Java](https://img.shields.io/badge/Language-Java-blue)
![Contributions welcome](https://img.shields.io/badge/Contributions-Welcome-brightgreen)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## ⚙️ Features
- ✅ Solves any standard 9×9 Sudoku using recursion and backtracking.  
- 🖥️ Accepts **manual console input** or **text file input** (`.txt` format).  
- 🧠 Efficient safety checks for row, column, and 3×3 subgrid.  
- 📜 Prints the completed Sudoku grid neatly in the console.  
- 🔒 Author permission required before forking or redistribution.

---

## 🚀 How to Use

### 🧩 Option 1: Console Input
1. Run the program.
2. Enter each Sudoku row (9 numbers separated by space).
3. Use **0** for blank cells.
4. The solved Sudoku will be displayed in the console.

### 📁 Option 2: File Input
1. Create a text file (e.g., `sudoku.txt`) containing the Sudoku grid.  
   Example:
0 0 8 0 0 0 0 0 0
4 9 0 1 5 7 0 0 2
0 0 3 0 0 4 1 9 0
1 8 5 0 6 0 0 2 0
0 0 0 0 2 0 0 6 0
9 6 0 4 0 5 3 0 0
0 3 0 0 7 2 0 0 4
0 4 9 0 3 0 0 5 7
8 2 7 0 0 9 0 1 3

3. Run the program and choose the file input option.
4. Enter the file path when prompted.

---

## 🧠 Algorithm Used
- **Backtracking**:  
Tries placing digits (1–9) in each empty cell.  
Checks if the placement is **safe** (row, column, subgrid).  
If not valid, it **backtracks** and tries another number.  
The recursion continues until the entire Sudoku is solved.

---

## 🧑‍💻 Author
**Asmit Mandal**  
- GitHub: [Asmit159](https://github.com/Asmit159)  
- LinkedIn: [asmit-mandal-aa300a374](https://www.linkedin.com/in/asmit-mandal-aa300a374)

---

## ⚠️ License & Permissions
This project is an original work by **Asmit Mandal**.  
Any **forking, redistribution, or modification** of this code requires **explicit author permission**.

---

⭐ *If you find this project useful, consider starring the repo to support the developer!*

