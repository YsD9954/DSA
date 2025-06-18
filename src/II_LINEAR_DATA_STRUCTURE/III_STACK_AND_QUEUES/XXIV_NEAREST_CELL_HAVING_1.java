//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//public class XXIV_NEAREST_CELL_HAVING_1 {
//    public static void main(String[] args) {
//        int arr[][]={{0,1,1,0},{1,1,0,0},{0,0,1,1}};
//        int res[][] = new int[arr.length][arr[0].length];
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                if (arr[i][j]==1){
//                    res[i][j]=0;
//                }
//                else{
//                    int temp1=i;
//                    int temp2=j;
//                    int c1,c2,c3,c4;
//                    c1=c2=c3=c4=0;
//                    while (temp1!=-1 && arr[temp1][temp2]!=1){
//                        temp1--;
//                        c1++;
//                    }
//                    temp1=i;
//                    temp2=j;
//                    while (temp2!=-1 &&arr[temp1][temp2]!=1){
//                        temp2--;
//                        c2++;
//                    }
//                    temp1=i;
//                    temp2=j;
//                    while (temp1!=arr.length&&arr[temp1][temp2]!=1){
//                        temp1++;
//                        c3++;
//                    }
//                    temp1=i;
//                    temp2=j;
//                    while (temp2!=arr.length&&arr[temp1][temp2]!=1){
//                        temp2++;
//                        c4++;
//                    }
//                    int x=Math.min(c1,c2);
//                    int y=Math.min(c3,c4);
//                    res[i][j]= Math.min(x,y);
//                }
//            }
//        }
//
//        for (int i=0;i< res.length;i++){
//            for (int j=0;j<res[0].length;j++){
//                System.out.print(res[i][j]);
//            }
//            System.out.println();
//        }
//
//    }
//}





//MY FIRST LOGIC...

//AND SEE THIS UPDATED ...





package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

public class XXIV_NEAREST_CELL_HAVING_1 {
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}};
        int res[][] = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    res[i][j] = 0;
                } else {
                    int minDist = Integer.MAX_VALUE;
                    for (int x = 0; x < arr.length; x++) {
                        for (int y = 0; y < arr[0].length; y++) {
                            if (arr[x][y] == 1) {
                                int dist = Math.abs(i - x) + Math.abs(j - y);
                                minDist = Math.min(minDist, dist);
                            }
                        }
                    }
                    res[i][j] = minDist;
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
