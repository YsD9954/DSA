package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXVIII_SMALLEST_DISTINCT_WINDOW {
    public static void main(String[] args) {
        String s = "AABBBCBBAC";
        String ans = "";
        for (int i=0;i<s.length();i++){
            if (ans.contains(String.valueOf(s.charAt(i)))){
                continue;
            }
            else{
                ans+=s.charAt(i);
            }
        }
//        System.out.println(ans);
        System.out.println(ans.length());
    }
}


//Note:-
//VAISE SOLUTION WRONG HAI BUT ANSWER CORRECT HAI ..TOH ABHI KELIYE CHODO BADME FIRSE KARENGE..