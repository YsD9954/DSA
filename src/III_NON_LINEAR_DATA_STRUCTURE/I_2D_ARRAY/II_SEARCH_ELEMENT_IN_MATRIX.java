package III_NON_LINEAR_DATA_STRUCTURE.I_2D_ARRAY;

public class II_SEARCH_ELEMENT_IN_MATRIX {
    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int r=4;
        int c=4;
        int target=13;
        int count=0;



        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (arr[i][j]==target){
                    System.out.println("Mil Gaya!");
                    count++;

                }

            }
        }

        if (count==0){
            System.out.println("Nahi Hai!");
        }


    }
}
