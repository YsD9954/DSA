package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.II_MATRIX;

public class IX_KTH_ELEMENT_IN_MATRIX {
    public static void main(String[] args) {
        int arr[][]={{16, 28, 60, 64}, {22, 41, 63, 91}, {27, 50, 87, 93}, {36, 78, 87, 94 }};
        int r=3;
        int c=3;
        int visted[] = new int[r*c];
        int pos=0;
        int k=3;

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
//



        System.out.println(visted[k-1]);


    }
}
