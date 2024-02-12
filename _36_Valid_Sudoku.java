import java.util.HashSet;
import java.util.Set;

public class _36_Valid_Sudoku {
    public static void main(String[] args) {
        char[][] a = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(a));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValid(board, i, 0, i, 8)) {
                return false;
            }
        }

        // Check each column
        for (int j = 0; j < 9; j++) {
            if (!isValid(board, 0, j, 8, j)) {
                return false;
            }
        }

        // Check each 3x3 sub-box
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValid(board, i, j, i + 2, j + 2)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean  isValid(char[][] board, int startRow, int startCol, int endRow, int endCol) {
        Set<Character> set = new HashSet<>();
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                char current = board[i][j];
                if (current != '.') {
                    if (!set.add(current)) {
                        return false; // Found a duplicate in the row/column/sub-box
                    }
                }
            }
        }
        return true;
    }
}
