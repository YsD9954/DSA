package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

public class V_CHECK_KNIGHT_TOUR {

    public static boolean helper(int[][] grid, int row,int col,int num ){
        int n= grid.length;
        if(grid[row][col]==n*n-1){ // base case! for sabh ke sabh number hogaye!!
            return true;
        }
        //check all 8 condition!!
        int i,j;

        // 2 up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && grid[i][j]==num+1){ // num+1 hi check karenge as hume malum hai 0 se start karre and 0 is on (0,0)!
            return helper(grid,i,j,num+1);
        }
        // 2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        // 2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }

        // 2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }

        // 2 right 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }

        // 2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }

        // 2 left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }

        // 2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        return false; //jis bhi number keliye kuch bhi condn nhi mili toh false!!
    }
    public static boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0){
            return false;
        }
        return helper(grid,0,0,0);

    }

    public static void main(String[] args) {
         int grid[][]= {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        System.out.println(checkValidGrid(grid));

    }
}


//NOTE=> NQUEENS KA LOGIC SIRF CHALL GHODE KI!!1
//LEETCODE K QUESTION HAI IS LIYE AISE KIA HAI DON;R WORRY LOGIC DHYAN DOO!!
//SIMPLY MEKO BASS 0,0 SE START KARKE MEREKO CHECK KARNA HAI KI MERE PASS N*N-1 NUMBER TAK ME GHODE KI CHAL SE PAHUCH SAKTO HO KI NAHI ..
//NOW FIR THAT HUMNE BAS I,J KO 0,0 SE START KIYA AN NUMBER AT 0,0 MUST BE 0 ITHER WISE FDIRECT FALSE!!
//AGAIUN BSS HELPER METHID ME 8 CONDITJION DALSDO SATISFY HORI TOH AGGE KE NUMBER KELIYE CALLL AND TIILL N*N-1 TQK DEKHNGE AND KAHI BHI SATISFY NHI DIRECT FALSE!!

//vvvvvvvvvvvvv..iiiiiiiiiiiiii..mmmmmmmmmmmmmmmm...pppppppppppppppppppppppppppppppppppp.............

//NOTE THAT NQUEENS ME HAMNE 8 CONDITION KE LIYE LOOP LAGAYA TA AND THEN CHEK KIYA AS HUMKO "8 direction this but 8 direction me bhut sare plce like for right hamre oass puri row hoti and same doen keliy e sari ki sari columnn toh uske liye firse while loop klagaya tha!!"
//BUT NOWN IN THIS KNIOGHT ME 8 DIRECTION HAI BIUT 8 IDRECTION ME SIRF EK HI PLACE HAI I=LIEK 2 LEFT UP ME USKE PSS EK HI BOX HAI USEBADD VHO ROW THDOI USKI HAI SO 8 DIRECTION HAI BUT 8 PLACES HI HAI NIOT MORE THAT THAT SO SIMLE HAME DIRECT DIRECTION CHECK KIYA MATLAB PLCE CHECK KIYA AND HOGAYA NOR INTERNAL WHILE LOOP!!!
