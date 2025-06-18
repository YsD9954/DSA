package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXV_TRAPPING_RAIN_WATER {
    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 0, 4, 0, 2};
        int leftmax[]= new int[arr.length];
        int rightmax[] = new int[arr.length];
        int maxL =arr[0];
        int maxR = arr[arr.length-1];
        int trapped=0;


        for (int i=0;i<arr.length;i++){
            if (arr[i]>maxL){
                maxL = arr[i];
            }
            leftmax[i] = maxL;

        }
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]>maxR){
                maxR = arr[i];
            }
            rightmax[i] = maxR;
        }


        for (int i=0;i<arr.length;i++){
            trapped+=Math.min(leftmax[i],rightmax[i])-arr[i];
        }
        System.out.println(trapped);

    }
}
