package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;
public class XX_LONGEST_CONSECUTIVE_SUBSEQUENCE {
    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 9, 4, 5, 3};
        int temp = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int count=1;
        if (arr[0]==arr[1]){
            count ++;
        }
        for (int i=1;i<arr.length;i++){
            if (arr[i-1]+1 ==(arr[i])){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
