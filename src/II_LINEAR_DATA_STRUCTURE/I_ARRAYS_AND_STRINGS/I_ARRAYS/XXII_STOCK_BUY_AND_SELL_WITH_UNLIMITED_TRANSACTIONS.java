package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXII_STOCK_BUY_AND_SELL_WITH_UNLIMITED_TRANSACTIONS {
    public static void main(String[] args) {
        int arr[] = {10, 22, 5, 75, 65, 80};

        int profit = 0;

        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];


            }
        }
        System.out.println(profit);
    }
}
