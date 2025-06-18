package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;


public class IX_PRINT_ALL_SUBSTRINGS {
    public static void main(String[] args) {
        String s= "YashDoke";
        int count =0;

        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){ //ctually meko i+1 se karnA tha but muzhe each individual elemetnt bhi ptrint karna hai ..so j bhi i se shuru karenge and then i=j hoga so vahi elenment matlab single element bhi print hoga
                String sub = s.substring(i,j+1);
                System.out.println(sub);
                count++;
            }
        }
        System.out.println("Total Number Of Substring :- "+count);
    }
}
