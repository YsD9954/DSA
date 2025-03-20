package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

import java.util.Arrays;

public class III_DUPLICATE_CHAR_IN_STRING {
//    public static void main(String[] args) {
//        String s = "Yaashhhh";
//        int count_duplicate = 0;
//        char dup[] = new char[s.length()];
//        int pos=0;
//        for (int i=0;i<s.length();i++){
//            for (int j=i+1;j<s.length();j++){
//                if (s.charAt(i)==s.charAt(j)){
//                    dup[pos]=s.charAt(j);
//                    pos++;
//                    count_duplicate++;
//
//
//                }
//            }
//        }
//
//
//        if (count_duplicate==0){
//            System.out.println("NO DUPLICATE!!");
//        }

//    }
//}













            public static void printDuplicates(String str)
            {
                int len = str.length();

                // Sorting the string
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String sortedStr = new String(chars);

                // Loop through the sorted string to find duplicates
                for (int i = 0; i < len; i++) {
                    int count = 1;

                    // Counting the occurrences of each character
                    while (i < len - 1
                            && sortedStr.charAt(i)
                            == sortedStr.charAt(i + 1)) {
                        count++;
                        i++;
                    }

                    // Printing the duplicate character and its
                    // count
                    if (count > 1) {
                        System.out.println(sortedStr.charAt(i)
                                + ", count = " + count);
                    }
                }
            }

            public static void main(String[] args)
            {
                String str = "test string";
                printDuplicates(str);
            }
        }
// This code is contributed by rutikbhosale

