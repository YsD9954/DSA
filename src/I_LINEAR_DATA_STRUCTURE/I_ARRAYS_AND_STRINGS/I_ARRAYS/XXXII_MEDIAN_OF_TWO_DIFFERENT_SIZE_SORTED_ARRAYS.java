package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXXII_MEDIAN_OF_TWO_DIFFERENT_SIZE_SORTED_ARRAYS {
    public static void main(String[] args) {
        int a[] = {};
        int b[] = {2, 4, 5, 6};
        int merged[] = new int[a.length+b.length];
        int pos =0;
        int temp=0;

        for (int i=0;i<a.length;i++){
            merged[pos] = a[i];
            pos++;
        }
        for (int i=0;i<b.length;i++){
            merged[pos]=b[i];
            pos++;
        }
        for (int i=0;i<a.length+b.length;i++){
            for (int j=i+1;j<a.length+b.length;j++){
                if (merged[i]>merged[j]){
                    temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }


        System.out.println(merged[(a.length+b.length)/2]);

    }
}
