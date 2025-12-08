package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Stack;

public class IV_REVERSE_WORD_WITHOUT_USING_STRINGBUILDER {

    public static String reverseWords(String s) {
        int i = 0;
        String words = "";
        Stack<String> stack = new Stack<>();

        while (i < s.length()) {
            if (i == s.length() - 1) {
                if (s.charAt(i) == '.') {
                    if (!words.isEmpty()) {
                        stack.push(words);
                    }
                } else {
                    words += s.charAt(i);
                    stack.push(words);
                }
            } else if (s.charAt(i) == '.') {
                if (!words.isEmpty()) {
                    stack.push(words);
                    words = "";
                }
            } else {
                words += s.charAt(i);
            }
            i++;
        }

        String ans = "";
        while (!stack.isEmpty()) {
            ans += stack.pop();
            if (!stack.isEmpty()) {
                ans += '.';
            }
        }

        return ans;
    }



    public static void main(String[] args) {
        String s = "i.....like.this.program.very.much...";
        System.out.println(reverseWords(s));
    }
}


//NOTE => STTRING BULDER USE KAR SAKTE THE AS USME BHI FUCTION HAI LIKE APPEND SO EASY HOTA BUT KOI NA...

//1. FIRT SIRF CHECK KARO.."." YE NHI HAI NA AND ADD THAT IN WORDS KE STRING ME AND FINALLY JAB TAK KOI "." OR STRING KHATM HOTI HAI PUSH IN STACK!!...
//2. SECOND CONDITION IF I REACHED TO LAST THEN  PUSH AGAIN THAT WORDS KI STRING IN STACK
//3. EK BBAT YAAD RAKHO FOR BOTH CONDITION IF WORD EMPTY HOGA THA IS MERA "." MULTIPLE TIME AAY ARAHEGA SO USKO ADD NHI KARNA HAI SO USKA BHIO CONDITION DONO CONDITON KE AANDR LAGAO.
//4. LAST ME STACK KO POP KARO JAB TAK JHALI NA HO AND ADD "." BETWEEN EACH WORD EXCEPT LAST!!

