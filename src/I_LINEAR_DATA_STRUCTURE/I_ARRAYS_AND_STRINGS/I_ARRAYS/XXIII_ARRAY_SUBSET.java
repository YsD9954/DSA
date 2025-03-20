package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXIII_ARRAY_SUBSET {
    public static void main(String[] args) {
        int a[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int b[] = {11, 3, 7, 1, 7};
        int count =0;
        for (int i=0;i<b.length;i++){
            for (int j=0;j<a.length;j++){
                if (b[i]==a[j]){
                    count++;
                }
            }
        }
        if(count<b.length){
            System.out.println("Not Subset!!!");
        }
        else{
            System.out.println("Subset!!!");
        }
    }
}
