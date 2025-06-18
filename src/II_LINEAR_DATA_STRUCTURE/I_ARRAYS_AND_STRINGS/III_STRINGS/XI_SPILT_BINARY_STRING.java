package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XI_SPILT_BINARY_STRING {
    public static void main(String[] args) {
        String s = "0100110101";
        int start=0;
        int count0=0;
        int count1=0;
        if (s.charAt(0)=='0'){
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='1'){
                    String sub = s.substring(start,i+1);
                    for (int j=0;j<sub.length();j++){
                        if (sub.charAt(j)=='0'){
                            count0++;
                        }
                        else{
                            count1++;
                        }
                    }
                    if (count0==count1){
                        System.out.println(sub);
                        start=i+1;
                    }
                    count0=0;
                    count1=0;
                }
            }
        }
        else{
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='0'){
                    String sub = s.substring(start,i+1);
                    for (int j=0;j<sub.length();j++){
                        if (sub.charAt(j)=='0'){
                            count0++;
                        }
                        else{
                            count1++;
                        }
                    }
                    if (count0==count1){
                        System.out.println(sub);
                        start=i+1;
                    }
                    count0=0;
                    count1=0;
                }
            }
        }
    }
}
//NOTE:-
//1. CHECK START 1 HAI KI 0...
//2. IF 0 SE START HAI THEN -> CHECK NEXT 1 KAB HAI AND THEN USS SUBSTRING ME CHECK NO OF ONES ..->IF 0'S AND 1'S ARE MATCHED THEN -> PRINT TAHT SUB ARRAY AND START WILL BE I+1 ->IF NOT THEN GO AHEAD BUT DON'T CHANGE I!!
//3. SMAE FOR 1 SE SHURU HO RAA TOH...