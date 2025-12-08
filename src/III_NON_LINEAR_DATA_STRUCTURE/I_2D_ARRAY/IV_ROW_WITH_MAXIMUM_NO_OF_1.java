package III_NON_LINEAR_DATA_STRUCTURE.I_2D_ARRAY;

public class IV_ROW_WITH_MAXIMUM_NO_OF_1 {
    public static void main(String[] args) {
        int arr[][] = {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};
        int r=4;
        int c=4;

        int count =0;
        int count_arr[] = new int[r];

        for (int i=0;i<r;i++){
            count=0;

            for (int j=0;j<c;j++){
                if (arr[i][j]==1){
                    count++;
                }


            }
            count_arr[i] = count;
        }

        int max=Integer.MIN_VALUE;
        int pos=0;
        for (int i=0;i<count_arr.length;i++){

            if(count_arr[i]>max){
                max=count_arr[i];
                pos = i;

            }
        }


        System.out.println(pos);
    }
}
