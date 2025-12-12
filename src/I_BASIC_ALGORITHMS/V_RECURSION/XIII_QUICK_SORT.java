package I_BASIC_ALGORITHMS.V_RECURSION;

public class XIII_QUICK_SORT {
    public static void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){ //low==high ans low>high me no need os sorting!!
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx-1);// don't consider pivot...
            quickSort(arr, pivotIdx+1, high);
        }
    }

    private  static int partition(int[] arr, int st, int end) {
        // code here
        int idx = st-1;
        int pivot = arr[end]; //hamne end select kiya...
        for(int i=st;i<end;i++){
            if(arr[i]<=pivot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i]=temp;
            }
        }
        idx++; //relocate pivot in between uske lower adnnhigher..
        int temp2 = arr[idx];
        arr[idx] = arr[end];
        arr[end]=temp2;
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        quickSort(nums,0,nums.length-1);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
