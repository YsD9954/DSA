package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

public class VI_MAX_NO_OF_KNIGHTS_IN_CHESSBOARD {
    private static void nQueens(char[][] chessBoard, int row,int countConfig[]) {
        int n = chessBoard.length;

        if(row==n){ // base case taht is mere sab rows me fill karke khatam hogaye..
            countConfig[0]++;

            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(chessBoard[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            return; // bahut imp hai becuse multiple ways bhi ho sakte n queens ko fill karneke !!
        }
        for (int j=0;j<n;j++){
            if(isSafe(chessBoard,row,j)){
                chessBoard[row][j]='Q';
                nQueens(chessBoard,row+1,countConfig);
                chessBoard[row][j]='X'; // backtracking because firse aana pad sakta hia!!

            }

        }


    }

    public static boolean isSafe(char[][] chessBoard,int row,int col){
//        hame 8 ke 8 diredction dekhne hai!! safe hai ki nahi!!
        int n=chessBoard.length;
//        columns -> south, north!
        for (int i=0;i<n;i++){
            if (chessBoard[i][col]=='Q'){
                return false;
            }
        }
//        rows -> east  , west!!
        for (int j=0;j<n;j++){
            if (chessBoard[row][j]=='Q'){
                return false;
            }
        }


//        north east => rows kammm, colmns badhenge!!

        int i=row;
        int j = col;

        while (i>=0 && j<n){
            if (chessBoard[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
//        south east => rows badhenge, colmns badhenge!!

        i=row;
        j = col;

        while (i<n && j<n){
            if (chessBoard[i][j]=='Q'){
                return false;
            }
            i++;
            j++;
        }

//        south west => rows badhenge, colmns kam!!

        i=row;
        j = col;

        while (i<n && j>=0){
            if (chessBoard[i][j]=='Q'){
                return false;
            }
            i++;
            j--;
        }
//        north west => rows kam, colmns kam!!

        i=row;
        j=col;
        while (i>=0 && j>=0){
            if (chessBoard[i][j]=='Q'){
                return false;
            }
            i--;
            j--;

        }
        return true;//if abh kuch thik hai matlab safe hai!!

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
        nQueens(chessBoard,0,countConfig);
        System.out.println(countConfig[0]);


    }


}
