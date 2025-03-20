package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.II_MATRIX;

public class V_SORTED_MATRIX {
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        int r=4;
        int c=4;

        int visted[] = new int[r*c];
        int pos=0;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                visted[pos] = arr[i][j];
                pos++;

            }
        }

        int max = visted[0];
        int temp = 0;

        for (int i=0;i<visted.length;i++){
            for (int j=i+1;j<visted.length;j++){
                if(visted[i]>visted[j]){
                    temp = visted[i];
                    visted[i] = visted[j];
                    visted[j] = temp;


                }
            }
        }
//        for (int i=0;i<visted.length;i++){
//            System.out.print(visted[i]+" ");
//        }

        int sorted_arr[][] = new int[r][c];
        int position=0;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                sorted_arr[i][j]=visted[position];
                position++;

            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(sorted_arr[i][j]+" ");

            }
            System.out.println();
        }




    }
}
