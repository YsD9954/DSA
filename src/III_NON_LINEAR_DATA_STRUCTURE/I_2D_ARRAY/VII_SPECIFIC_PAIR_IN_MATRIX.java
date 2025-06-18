package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.II_MATRIX;

public class VII_SPECIFIC_PAIR_IN_MATRIX {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, -1, -4, -20}, { -8, -3, 4, 2, 1 }, { 3, 8, 6, 1, 3 }, {-4, -1, 1, 7, -6}, { 0, -4, 10, -5, 1 }};
        int r=5;
        int c=5;
        int max = 0;
        int min = 0;

        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];

                }
                if (arr[i][j]<min){
                    min=arr[i][j];

                }

            }
        }
        System.out.println(max-min);




    }
}
