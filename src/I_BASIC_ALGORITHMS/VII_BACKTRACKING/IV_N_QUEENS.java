

package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

public class IV_N_QUEENS {

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
//NOTE=>
//N QUEENS KO N*N KE CHESS BOARD ME FIT KARNA HAI SIMPLE ...hehe :"
//so HUMKO HIONT YA COMMONENSE BOLA HAO KI HAR EK ROW ME EK QUEENS AANA CHYIE SO THAT N QUEEN SBEHTENGE RIGHT?=> SO CONDERIGN THAT LAGAO EK LOOP JO KI HAR EK ROW KE HAR EK COLIMN ME JAKE DEKHEGHA HeKI LAGA KI NAHI(j => 0-> N)
// AS HUM ROW WISE CHECK KAFRENGE SO IF WE GET SAFE SO WE WILL ADD AND AGIN NOT E BACKTRACK THAT IS FIRSE USKE SABH CALL HONE KE BAAD USKEO FIR EFALSW KAR DENEKA!!
// SO TOUGHEST THING SI KI SAFE KAISE NIKALE DEKHO 8 KE 8 DIRECTION CHECK KARNEKJA VALID HAI TOH THIK NAHI TOH FALSEO
//LAST ME BASE CASE LAGAO KI SABH ROWS HO GAYE KARKE TOH PRIONT KARDO AND RETURN BECAUSE FIRSE HO SAKTAHI KI NAYE WAYS ME NQUEENS LAG SAKTE HAI KARKE!!!
//LASTEM COUNT BHI AAYEGA AS HUM COUNT++ KARRE HAI!! AS KAHA KAAH POSSIBLE COMBIANTIONM BHI PUCHTE HAI! note int nhi le sakte son array of one size liya..
