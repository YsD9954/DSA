
//BACKTRACING ==> IT'S A PART OF RECURSION WHEN IT COMES TO RETURN !!!!

//LET'S UNDERSTAND WITH RAT IN MAZE (2 DIRECTIONS) PROBLEM...

//SO WE HAVE N*M GRID...SO 2 DIRECTION ONLY => RIGHT AND DOWN..
//  1 2 3 4 5 6 ->(M) (COLUMNS HAI NOT ROWS!)
//1|.| | | | | |
//2| | | | | | |
//3| | | | | | |
//4| | | | | |.|
// |
//\/
//(N) (ROWS HAI BHAI NOT COLUMNS!)

//(1,1) -> (N*M)


//SO WE HAVE RECURSION RIGHT SIMPLE RIGHT WAYS AND ODWN WAYS NIKALO...

//
//
//package I_BASIC_ALGORITHMS.VII_BACKTRACKING;
//
//public class I_INTRO_TO_BACKTRACKING {
//    public static int maze2(int sr,int sc,int er,int ec){
//        if(sr>er || sc>ec){
//            return 0;
//        }
//        if (sr==er && sc==ec){
//            return 1;
//        }
//
//        int down_ways=maze2(sr+1,sc,er,ec);
//        int right_ways=maze2(sr,sc+1,er,ec);
//        int total_ways = down_ways+right_ways;
//        return total_ways;
//    }
//    public static void main(String[] args) {
//        int rows = 4;
//        int col = 6;
//        int count = maze2(1,1,rows,col);
//        System.out.println(count);
//
//    }
//}
//


//NOW WHAT IF I TELL YOU TOO MAKE 4 DIRECTIONMAZE LIKE ALL 4 DIRECTION SO??




package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

public class I_INTRO_TO_BACKTRACKING {
    public static int maze4(int sr,int sc,int er,int ec,boolean isVisited[][]){
        if(sr>er || sc>ec){
            return 0;
        }
        if (sr==er && sc==ec){
            return 1;
        }
        if (sr<0||sc<0){ //extra because left and up jaskate hai!!
            return 0;
        }
//why stack overflow??
//because hum (1,1)->(1,2) => aaye so we have came to right but yaha firse e have 4 option so if we go left agai so...then ye toh firse original pe aagaya so firse right me jayega so ye infinte loop chalata rahega okk..
//so use..visted array jo ki if true hua toh firse nhi jane deg so ingfinte loop!!

        if(isVisited[sr][sc]==true){
            return 0;
        }

        isVisited[sr][sc] = true;
        int down_ways=maze4(sr+1,sc,er,ec,isVisited);
        int right_ways=maze4(sr,sc+1,er,ec,isVisited);
        int up_ways=maze4(sr-1,sc,er,ec,isVisited);
        int left_ways=maze4(sr,sc-1,er,ec,isVisited);
        int total_ways = down_ways+right_ways+up_ways+left_ways;
//VERY VERY IMP STEP BECAUSE ELK BAAR TRUE KIYA HAI TOH FIRSE NHI JASKATE BUT WHAT IF MULTIPLE PATH ME KUCH COMMON PART AHI BUT US CIOMMON PART KO HUM EK HI BAAR LE SAKTE HAI SO...
//HENCE WE NEED OT UNCHECKED AGIAN AFTER ALL THE CALL WHICH CAN BE ALLED FROM A PARTICULAR ELEMENT

        isVisited[sr][sc]=false; //THIS IS BACKTRACKING!!!!

        return total_ways;
    }
    public static void main(String[] args) {
        int rows = 3;
        int col = 3;
        boolean isVisited[][]=new boolean[rows][col];
        int count = maze4(0,0,rows-1,col-1,isVisited); //arrays use kiya so 0 based indexing..
        System.out.println(count);

    }
}



//OHHHHHHHHH..... SAMJA FOR BACKTRACKING TO THE PARTICULAR RESULT IN RECURISON WE USE BACKTRACKING!!