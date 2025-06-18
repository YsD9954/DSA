package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XVI_TWO_SUM {
    public static void main(String[] args) {
        int arr[] = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        int visited=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==0 && Math.abs(arr[i])!=visited){
                    visited= Math.abs(arr[i]);
                    System.out.println(arr[i]+"+"+arr[j]+"="+"0");
                    System.out.println("Hence -> ["+arr[i]+","+arr[j]+"]");
                }
            }
        }




    }
}


//LOGIC -
//HERE THEY SAID RESULTANT IS 0 SO I WANT PAIR OF NUMBER WHOSE ADDITION IS 0...