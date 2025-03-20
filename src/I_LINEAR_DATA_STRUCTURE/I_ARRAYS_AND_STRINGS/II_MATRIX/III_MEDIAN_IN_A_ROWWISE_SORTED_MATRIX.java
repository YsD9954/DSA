package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.II_MATRIX;

import javax.swing.text.ParagraphView;

public class III_MEDIAN_IN_A_ROWWISE_SORTED_MATRIX {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5},{2,6,9},{3,6,9}};

        int r=3;
        int c=3;
        int visted[] = new int[r*c];
        int pos=0;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                visted[pos] = arr[i][j];
                pos++;

            }
        }
        int temp=0;

        for (int i=0;i<visted.length;i++){
            for (int j=i+1;j<visted.length;j++){
                if (visted[i]>visted[j]){
                    temp = visted[i];
                    visted[i]=visted[j];
                    visted[j]=temp;
                }
            }
        }


        System.out.println("MEDIAN = "+ visted[visted.length/2]);
    }
}
