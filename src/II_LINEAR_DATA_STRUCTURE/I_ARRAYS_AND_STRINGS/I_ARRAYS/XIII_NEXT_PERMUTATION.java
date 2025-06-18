package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XIII_NEXT_PERMUTATION {
    public static void nextpermutation(int arr[]){
        int curr=arr.length-2;
        int temp = 0;

        if(arr[curr]<arr[curr+1]){
            temp = arr[curr];
            arr[curr]=arr[curr+1];
            arr[curr+1] = temp;

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }


    }
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        nextpermutation(arr);
    }
}


//LOGIC :-

// IF 2ND LAST ELEMENT IS LESS THAN LAST ELEMENT THEN SWAP THEM ONLY...
//Example 1:
//        Input: nums = [1,2,3]
//        Output: [1,3,2]

//IF 2ND LAST ELEMENT IS GREATER THAN LAST ELEMENT THEN REVERSE THE ARRAY COMPLETELY...
//Example 2:
//        Input: nums = [3,2,1]
//        Output: [1,2,3]
