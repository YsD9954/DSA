package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;


public class VIII_LONGEST_REPEATING_SUBSEQUENCE {
    public static void main(String[] args) {
        String s = "axxaxy";
        int max = 0;
        for (int i=0;i<s.length();i++){
            int count=0;
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)){
                    count++;
                    max=Math.max(max,count);
                }
            }
        }
        System.out.println("Longest Repeating Subsequence - "+ max);
    }
}








