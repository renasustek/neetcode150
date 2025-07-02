package org.example.ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        // Initialize three arrays of HashSets to store seen numbers for rows, columns, and 3x3 sub-boxes.
        // Each HashSet at a specific index will store unique digits encountered for that row/column/box.
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        // Initialize each HashSet within the arrays ->
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Iterate through each cell of the 9x9 board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];

                // If the cell is empty ('.'), skip it as it doesn't violate Sudoku rules.
                if (num == '.') {
                    continue;
                }

                // Calculate the index of the 3x3 sub-box.
                // T
                // he formula (row / 3) * 3 + (col / 3) gives a unique index from 0-8 for each box.
                // Integer division in Java (e.g., r / 3) works exactly like Python's //
                int boxIdx = (r / 3) * 3 + (c / 3);

                // Check for duplicates:
                // If the number is already present in the current row's set, it's invalid.
                // If the number is already present in the current column's set, it's invalid.
                // If the number is already present in the current 3x3 sub-box's set, it's invalid.
                if (rows[r].contains(num) || cols[c].contains(num) || boxes[boxIdx].contains(num)) {
                    return false; // Found a duplicate, board is not valid.
                }

                // If no duplicate is found, add the number to the respective sets
                rows[r].add(num);
                cols[c].add(num);
                boxes[boxIdx].add(num);
            }
        }

        // If the entire board is traversed without finding any violations, it means the board is valid.
        return true;
    }
}
