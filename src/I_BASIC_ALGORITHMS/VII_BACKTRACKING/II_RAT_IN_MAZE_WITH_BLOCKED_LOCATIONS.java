package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

public class II_RAT_IN_MAZE_WITH_BLOCKED_LOCATIONS {

    public static int maze4(int sr,int sc,int er,int ec,int isVisited[][]){
        if(sr>er || sc>ec){
            return 0;
        }
        if (sr==er && sc==ec){
            return 1;
        }
        if (sr<0||sc<0){ //extra because left and up jaskate hai!!
            return 0;
        }

        if(isVisited[sr][sc]==0 ||isVisited[sr][sc]==-1 ){ //dekho apan condition '-1'(false) vale toh thi.. but 0 vali bhi add ki..
            return 0;
        }

        isVisited[sr][sc] = -1; // 0 nahi hai toh -1 karo !!
        int down_ways=maze4(sr+1,sc,er,ec,isVisited);
        int right_ways=maze4(sr,sc+1,er,ec,isVisited);
        int up_ways=maze4(sr-1,sc,er,ec,isVisited);
        int left_ways=maze4(sr,sc-1,er,ec,isVisited);
        int total_ways = down_ways+right_ways+up_ways+left_ways;


        // firse 1 karke rakho fo rreuse!!
        isVisited[sr][sc]=1; //THIS IS BACKTRACKING!!!!

        return total_ways;
    }
    public static void main(String[] args) {
        int rows = 4;
        int col = 6;
        int blockedLocation[][] = {{1,0,1,1,1,1},
                                   {1,1,1,1,0,1},
                                   {0,1,1,1,1,1},
                                   {0,0,1,0,1,1}};
        int count = maze4(0,0,rows-1,col-1,blockedLocation); //arrays use kiya so 0 based indexing..
        System.out.println(count);
    }
}



//NOTE=>
//blocked location diye hai toh simple hogaya usse hi haium use karlenge for check !!
// 0-> nhi ja sakta 1-> ja sakt hai ... so we directly consider 0 as perment true jo ki change nhi ho sakr ans for 1 -> we said true bt can be changes!!
//so 0-> don't chjangeis perment falso
//and 1-> make it -1 => so if it -1 then we can also mke 1 again like what we did in actual rat problem by making all agian true back so firse aa sakte hai for new pathj!!
//and note condiotn me sirf -1 nji toh 0 bhi aaye kuyki temp false and perment false bioth check hoga ..srf 0 ki mat lagao!!as hamne false ko -1 assume kiya hai and 0 ko additionl perment false okk!!
