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
        int arr[] = {3,4,2,1};
        nextpermutation(arr);
    }
}


//LOGIC :-
//
//        Find the pivot: Starting from the right side, find the first element that is smaller than the one to its immediate right.
//        In [3, 4, 2, 1], going from right to left: 1 is not less than 2, 2 is not less than 4, but 3 is less than 4.
//        The pivot is 3.

//        Find the successor: Again starting from the right side, find the smallest element that is greater than the pivot.
//        In the part of the array to the right of the pivot [4, 2, 1], the smallest number greater than 3 is 4.
//        The successor is 4.

//        Swap: Swap the pivot with the successor.
//        Swapping 3 and 4 gives [4, 3, 2, 1].

//        Reverse the suffix: Reverse the portion of the array that was to the right of the original pivot position.
//        The part of the array to the right of the original pivot (3) was [4, 2, 1].
//        After the swap, the numbers [3, 2, 1] are reversed. This results in [1, 2, 3].
//        The final result is the new prefix combined with the reversed suffix: [4, 1, 2, 3].
