package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

import java.nio.file.attribute.FileAttribute;

public class VI_MAX_NO_OF_KNIGHTS_IN_CHESSBOARD {
    static int maxKnight=0;
    private static void nKnights(char[][] chessBoard, int row,int col,int num) {
        int n = chessBoard.length;

        if(row==n){ // base case taht is mere sab rows me fill karke khatam hogaye..

            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(chessBoard[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            maxKnight=Math.max(maxKnight,num);
            return; // bahut imp hai becuse multiple ways bhi ho sakte n queens ko fill karneke !!
        }

        else {
            if (isSafe(chessBoard, row, col)) { //saqfe hai toh k lagao
                chessBoard[row][col] = 'K';
                if (col != n - 1) nKnights(chessBoard, row, col + 1,num+1);// jab toak last colmn nhi aata
                else nKnights(chessBoard, row + 1, 0,num+1);//last col aaya toh next row me and first col me call lagao!!
                chessBoard[row][col] = 'X'; // backtracking because firse aana pad sakta hia!!
            }
        }
        //safe nhi hai toh aage bado and 'k' mat lagoa and very imp num nahi badaneka!! hai else mai mat dalo as sare cmbination nhi priont honge!!
        if (col!=n-1) nKnights(chessBoard,row,col+1,num); //
        else nKnights(chessBoard, row + 1, 0,num); // last comumn ke aage kuvh nhi ahi toh aajao pahile pe firse!!



    }

    public static boolean isSafe(char[][] grid,int row,int col){
        int n=grid.length;
        //check all 8 condition and no need of lop as 8 direction me 8 hi place honge !!
        int i,j;

        // 2 up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && grid[i][j]=='K'){
            return false;
        }
        // 2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]=='K'){
            return false;
        }
        // 2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]=='K'){
            return false;
        }

        // 2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]=='K'){
            return false;
        }

        // 2 right 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]=='K'){
            return false;
        }

        // 2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]=='K'){
            return false;
        }

        // 2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]=='K'){
            return false;
        }

        // 2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]=='K'){
            return false;
        }


        return true;//nhi toh true!!
    }
    public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                chessBoard[i][j]='X';
            }
        }
        int countConfig[] = new int [1];
        nKnights(chessBoard,0,0,0);
        System.out.println(maxKnight);


    }


}
