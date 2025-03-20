package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;
import java.util.*;

public class II_PALINDROME_OR_NOT{
    public static void main(String[] args) {
        String str = "NayAN";
        int count = 0;
        String s=str.toUpperCase();
        System.out.println(s);

        for (int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
                if (s.charAt(i)==s.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
        }
        if (count==s.length()/2){    //if i iterate loop till half as till center element if all elemts are checked then we can say it's pelindrokme and no need to shecj after centre as we iterate loop from both direction
            System.out.println("YES! Palindrome Number...");
        }
        else{
            System.out.println("ummm! Not a Palindrome Number...");

        }




    }
}
