package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class IV_COUNT_SQUARES {
    public static void main(String[] args) {
        int n=9;
        int count=0;

        for (int i=1;i<n;i++){
            if (i*i<n){
//                System.out.println(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
