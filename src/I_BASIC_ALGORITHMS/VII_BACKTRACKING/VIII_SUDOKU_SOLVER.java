package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

public class VIII_SUDOKU_SOLVER {
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

    public static void solve(char[][] board,int row,int col,char[][] board_copy){
        //basecase
        if(row==9){// sudoku solve karke kahatam so save karlo.. !!!
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    board_copy[i][j]=board[i][j];
                }
            }
        }
        else if(board[row][col]!='.'){ // if '.' nhi hai so hum kuch nhi karenge just aage badhege!!
            if(col!=8) solve(board,row,col+1,board_copy);
            else solve(board,row+1,0,board_copy);
        }
        else{ // abhi aaya na maja '.' mil gaya
            // check karo konsa eleemnt dal sakte ho karke ..
            for(char ch='1';ch<='9';ch++){
                if(isValid(ch,board,row,col)){
                    board[row][col]=ch;
                    if(col!=8) solve(board,row,col+1,board_copy);
                    else solve(board,row+1,0,board_copy);
                    board[row][col]='.';//backtracking!!
                }

            }

        }
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

        char board_copy[][] = new char[9][9];
        solve(board,0,0,board_copy);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=board_copy[i][j];
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
}


//NOTE => SIMPLE HAI JUST PICHLE QUESTION ME WE VERIFIED VALID SUDOKU HAI KI NHI..
//SO..
//1. CHECK KI '.' HAI KI NHI AS NUMBER KO CHANGE NHI KAR SAKTE!!
//2. IF NUMBER HAI TOH NORMAL COL AAGE KARO AND EXTRA CONDn FOR  LAST COLUMN i.e ROW+1 KAOR AND COL FIRSE 0..
//3. NOW MAIN THING IF NUMBER NHI HAI SO HAUME NUMBER BHARNE HAI !!..
//    -> TO FILL NUMBER CHECK KARO KONSA K=NUMBER FORM 1 TO 9 FIT HO SAKTA HAI!! OKK BY USING IS VALID JO PCIHLE BAAR USE KIYA THA..
//    -> AGAIN IF VALID HAI TOH COL ++ AND EXTRA CONDn FOR LAST COL i.e ROW++ AND COL=0..
//4.BSS LAST ME BASE CASE LAGAO i.e ROW ==9 AS ROW SIRF 0->8 HI HAI SO 9 IS BASE CASE..
//5.COPY COMPLETE SUDOKU IN BOARD COPY AND AGIAN IN MAIN FUNCTION BOARD ME BOARD CPY DALDO AS ...JAV AHI BHAI:)
//THAT'S IT FINAL PRINT KARDO APNE HISAB SE!!!

//HARD HAI BUT EASSSSSHHYYYYYYYYYYYY:)!!