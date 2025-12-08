package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

public class VII_VALID_SUDOKU {

    public static boolean isValid(char c, char[][] board, int k, int l) {
        // Row
        for (int i = 0; i < 9; i++) {
            if (i != l && board[k][i] == c) return false;
        }

        // Column
        for (int j = 0; j < 9; j++) {
            if (j != k && board[j][l] == c) return false;
        }

        // 3x3 Subgrid
        int rowStart = (k / 3) * 3;
        int colStart = (l / 3) * 3;

        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (board[i][j] == c && (i != k || j != l)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidSudoku(char[][] board) {
        int m=9,n=9; //9X9 ka hi hoga na...
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else if(!isValid(board[i][j],board,i,j)){
                    return false;

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char board[][] =
                {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};


        System.out.println(isValidSudoku(board));
    }


}


//NOTE => BAHIUT EASY QUESTION AND BACKTRACKING VAISE OTH HAI NHI AS MENE BINA BACKTRACKING KE 99% BETTER SOLUTOIN DIY IN LEETCODE SO ....
//1. CHECK KOI BHI ROW ADN COLUMN DUPLICATE ELEMTN NHI HONE CHAYEI ..EASY!!!:0
//2. VERY IMP HAR EK MATRIX ME BHI DUPLICATE NHI HONE CHAYE!!..SO IT'S IMP TO FIND HAR EKL MATRIX KA STARTING INDEX (LIKE ROW AND COL) SO USKA FORMULA HJAI FIRST DIVIDE AND THEN MULTIPLY BY 3 WE WILL GET HAR EK ELMENT KE LIYE USKA INNER MATRIX KA STARTING ELEMTN
//3. NOT HAT HE UPPER KI DONO POIJNT CHEKC KARTE TIME DEKHNA KI HAMR ADIYA HUA NUMBER SE KCOMPARE NA KARE SO EK (COMPARE &&ROW||COLM CONDn)..
//4. LAST ME '." USKO CHOD DO USKE SATH KUCH NHI KARNA ..OKK
