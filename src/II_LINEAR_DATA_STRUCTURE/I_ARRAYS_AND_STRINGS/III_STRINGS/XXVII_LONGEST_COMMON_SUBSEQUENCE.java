package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXVII_LONGEST_COMMON_SUBSEQUENCE {
    public static void main(String[] args) {
        String s1="ABCDGH";
        String s2="AEDFHA";
        int count1=0;
        int count2=0;
        String str1="";
        String str2="";

        for (int i=0;i<s1.length();i++){
                for (int j=0;j<s2.length();j++){
                    if (s1.charAt(i)==s2.charAt(j)){
                        count1++;
                        str1=str1+String.valueOf(s1.charAt(i));
                        break;
                    }
                }
            }
        for (int i=0;i<s2.length();i++){
            for (int j=0;j<s1.length();j++){
                if (s2.charAt(i)==s1.charAt(j)){
                    count2++;
                    str2=str2+String.valueOf(s2.charAt(i));
                    break;
                }
            }
        }
        if (count1<count2){
            System.out.println(str1);
        }
        else{
            System.out.println(str2);
        }


    }
}


//Note:-
//1. 2 loop lagaye kyuki like above example ek string A ek baar hai and dusre me 2 baar so minimum count vale consider karenge..
//2. baki kuch itna imp nahi hai..
