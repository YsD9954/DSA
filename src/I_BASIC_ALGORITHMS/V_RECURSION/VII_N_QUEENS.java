package I_BASIC_ALGORITHMS.V_RECURSION;

public class VII_N_QUEENS {

    public static boolean isSafe(char[][] board, int row, int col, int n) {

        // horizontal
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') return false;
        }

        // vertical
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }


    public static char[][] nQueens(char[][] board, int row, int n, char[][] ans) {

        // base condition
        if (row == n) {
            // copy board → ans
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans[i][j] = board[i][j];
                }
            }
            return ans;
        }

        // try placing queen at each column
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                board[row][col] = 'Q';           // place queen

                nQueens(board, row + 1, n, ans); // recursion

                board[row][col] = '.';           // backtrack
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        char board[][] = {
                {'.', '.', '.', '.'},
                {'.', '.', '.', '.'},
                {'.', '.', '.', '.'},
                {'.', '.', '.', '.'}
        };

        char ans[][] = new char[4][4];

        nQueens(board, 0, 4, ans);

        // print answer board
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
