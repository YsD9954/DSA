package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

public class II_1ST_NEGATIVE_IN_EVERY_WINDOW_OF_SIZE_K {
    public static void main(String[] args) {
        int arr[] = {12,-1,-7,8,-15,30,16,28};
        int k=3;
        for (int i=0;i<=arr.length-k;i++){//i<=arr.length-k hai equal to bhi hai notonly less than okk!!
            int neg = 0;
            for (int j=i;j<i+k;j++){
                if (arr[j]<0){
                    neg=arr[j];
                    break;
                }
            }
            System.out.print(neg+" "); //if neg nhi mila toh 0!
        }
    }
}

//NOTE=>
//SAME QUETION LIKEPREVIOUS JUST HAMEN NEGATIVE NUMBER NIKALE !!