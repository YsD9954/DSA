package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;
;

public class X_FIND_PAIR_OF_GIVEN_DIFFERNCE {
    public static void main(String[] args) {
        int arr[] = {5,20,3,2,5,80};
        int x=78;
        boolean flag=false;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (Math.abs(arr[i]-arr[j])==78){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    flag=true;
                }
            }
        }
        if (flag==false){
            System.out.println("NO pair with absolute Differnce of "+x);
        }



    }
}
