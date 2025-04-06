package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXIX_REMOVE_ALL_CONSECUTIVE_CHARACTERS {
    public static void main(String[] args) {
        String s = "abcddcba";//abcddcbb...iske liye bhi dekah hai..
        String ans="";
        for (int i=0,j=i+1;i<s.length()-1;i++,j++){
            if (s.charAt(i)==s.charAt(j)&&i!=s.length()-2){
                continue;
            }
            else if (i==s.length()-2) {
                if (s.charAt(i)==s.charAt(j)){
                    ans = ans+s.charAt(i);
                }
                else{
                    ans = ans+s.charAt(i)+s.charAt(j);
                }
            } else{
                ans = ans+s.charAt(i);
            }
        }
        System.out.println(ans);

    }
}


//NOTE =
//1.JYADA DIMAG MAT LAGAO EASY QUESTION HAI..DIRECT NAYA STRING LEKE USME ADD KARO REQ ELEMENT
//2.NOTE LAST KA ELEMTN SAME HOGA YA NHI HOGA USKAO THOD ABT THA..
//3.REMEMBER LAST KA ELEMTN KE LIYE ALAG HI CAE HAI NORMAL CASE NHI JAYGA..ABAS..AS LAST ME SAME HAI TOH ONLY EK PRINT KARO..ELSE DONO PRINT KARO..
//4.AND NORMAL ELEMENT KELIYE NORMAL CHALTA HAI..
