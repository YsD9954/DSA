package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class I_REVERSE_THE_STRING {
    public static void main(String[] args) {
//        char s[] = {'y','a','s','h'};

        String s = "Yash";
        System.out.println("Original String :- ");
        for (int i=0;i<s.length();i++){
            System.out.print("'"+s.charAt(i)+"' ");
        }
        System.out.println();
        System.out.println("Reverse String :- ");
        for (int i=s.length()-1;i>=0;i--){
            System.out.print("'"+s.charAt(i)+"' ");
        }
    }
}
