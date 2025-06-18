package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XIX_COUNT_THE_REVERSAL {
    public static void main(String[] args) {
        String s = "}{{}}{{{";
        int count1=0;
        int count2=0;

        if (s.length() % 2 != 0) {
            System.out.println(-1);
        }

        else{
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)=='{'){
                    count1++;

                }
                else {
                    if(count1==0){
                        count2++;

                    }
                    else {
                        count1--;
                    }
                }
            }

            int ans = (int)Math.ceil(count1/2.0)+(int)Math.ceil(count2/2.0);
            System.out.println(ans);
        }

    }
}
