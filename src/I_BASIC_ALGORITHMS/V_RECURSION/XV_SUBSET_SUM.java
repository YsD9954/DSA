package I_BASIC_ALGORITHMS.V_RECURSION;

public class XV_SUBSET_SUM {
    private static boolean subsetSum(int[] arr, int sum, int i, int n, int ans) {
        if(i==n) return false;
        if(sum == ans) return true;
        if(sum<ans) return false;

        boolean include = subsetSum(arr,sum,i+1,arr.length,ans+arr[i]);
        boolean exclude = subsetSum(arr,sum,i+1,arr.length,ans);

        return include||exclude;
    }
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int start =0;
        int ans=0;
        System.out.println(subsetSum(arr,sum,start,arr.length,ans));
    }


}
