package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class X_PERMUTATION_OF_STRING {
    public static void main(String[] args) {
        String s = "Yash";
        permute(s, "");
    }

    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, ans + ch);
        }
    }
}


//Note ==>
//call in main--> permute("ABC","")
//----------------------------------------
//ch-> "A"
//ros-> "" + "BC" ==> "BC"
//permute("BC","A")

//ch-> "B"
//ros-> "" + "C" ==> "C"
//permute("C","AB")

//ch-> "C"
//ros-> "" + "" ==> ""
//permute("","ABC")
//sout("ABC")--------------------------(1)

//permute("C","AB")... jisne call kiya uske pass!
//now we had i=0, only one char => loop ends -> return back

//permute("BC","A")... jisne call kiya tha!
//last time i=0 call hua tha, now i=1
//ch-> "C"
//ros-> "B"
//permute("B","AC")

//now ye naya call hai, not a call back
//ch-> "B"
//ros-> "" + "" ==> ""
//permute("","ACB")
//sout("ACB")--------------------------(2)

//return to caller permute("B","AC")
//only one char -> loop ends -> return back

//permute("BC","A")
//loop done for i=0 and i=1 -> return to caller permute("ABC","")

//----------------------------------------
//Back to main call permute("ABC","")
//last time i=0, now i=1
//ch-> "B"
//ros-> "A" + "C" ==> "AC"
//permute("AC","B")

//ch-> "A"
//ros-> "" + "C" ==> "C"
//permute("C","BA")

//ch-> "C"
//ros-> "" + "" ==> ""
//permute("","BAC")
//sout("BAC")--------------------------(3)

//permute("C","BA")...only one char, loop ends -> return back

//permute("AC","B") continues -> now i=1
//ch-> "C"
//ros-> "A"
//permute("A","BC")

//ch-> "A"
//ros-> "" + "" ==> ""
//permute("","BCA")
//sout("BCA")--------------------------(4)

//permute("A","BC") ends -> return to caller permute("AC","B")
//loop done for i=0,1 -> return to permute("ABC","")

//----------------------------------------
//Back to main call permute("ABC","")
//last done i=0, i=1 -> now i=2
//ch-> "C"
//ros-> "AB"
//permute("AB","C")

//ch-> "A"
//ros-> "" + "B" ==> "B"
//permute("B","CA")

//ch-> "B"
//ros-> "" + "" ==> ""
//permute("","CAB")
//sout("CAB")--------------------------(5)

//permute("B","CA") returns (only one char)

//permute("AB","C") continues -> i=1
//ch-> "B"
//ros-> "A"
//permute("A","CB")

//ch-> "A"
//ros-> "" + "" ==> ""
//permute("","CBA")
//sout("CBA")--------------------------(6)

//permute("A","CB") ends -> return
//permute("AB","C") loop done -> return
//----------------------------------------

//// All calls finished!
// OUTPUT in order of prints:
//// (1) ABC
//// (2) ACB
//// (3) BAC
//// (4) BCA
//// (5) CAB
//// (6) CBA
