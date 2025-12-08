package III_NON_LINEAR_DATA_STRUCTURE.I_2D_ARRAY;

public class I_SPIRALLY_TRAVERSING_A_MATRIX {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int r=4;
        int c=4;

//        for (int i=0;i<r;i++){
//            for (int j=0;j<i;j++){
//                if (i==j)
//                System.out.print(arr[i][j]+" ");
//            }
////            System.out.println();
//        }

//        i=0 => j=0to3;
//        i=j => j=3;
//        i=3to0 => j=3;
//        j=3to1 => j=0

        int count=0;
        int i = 0, j = 0;
        int curr_r=r ,curr_c =c ;
        int start_i=0,start_j=0;

        while(count!=r*c) {

            for (i = start_i, j = start_j; j < curr_c; j++) {
                System.out.print(arr[i][j] + " ");
                count++;
                start_i++;
                start_j=curr_c-1;


            }
            for (i = start_i, j = start_j; i < curr_r; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
                start_i=curr_r-1;
                start_j--;

            }

            for (i = start_i, j = start_j; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
                count++;

            }
            for (i = r - 1, j = 0; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
                count++;

            }


        }
    }
}
