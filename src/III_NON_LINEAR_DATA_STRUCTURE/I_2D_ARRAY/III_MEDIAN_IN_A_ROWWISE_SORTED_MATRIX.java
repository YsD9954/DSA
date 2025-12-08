package III_NON_LINEAR_DATA_STRUCTURE.I_2D_ARRAY;

import java.util.Arrays;

public class III_MEDIAN_IN_A_ROWWISE_SORTED_MATRIX {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5},{2,6,9},{3,6,9}};

//        int r=3;
//        int c=3;
//        int visted[] = new int[r*c];
//        int pos=0;
//
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c;j++){
//                visted[pos] = arr[i][j];
//                pos++;
//
//            }
//        }
//        int temp=0;
//
//        for (int i=0;i<visted.length;i++){
//            for (int j=i+1;j<visted.length;j++){
//                if (visted[i]>visted[j]){
//                    temp = visted[i];
//                    visted[i]=visted[j];
//                    visted[j]=temp;
//                }
//            }
//        }
//
//
//        System.out.println("MEDIAN = "+ visted[visted.length/2]);


//        method2=>

        int ans[] = new int[arr.length*arr[0].length];// r*c!
        int idx=0;

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                ans[idx]=arr[i][j];
                idx++;
            }
        }
//        for (int i=0;i<ans.length;i++){
//            System.out.println(ans[i]);
//        }
        Arrays.sort(ans);
        System.out.println("Median :- "+ans[ans.length/2]);
    }
}
