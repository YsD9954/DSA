//package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;
//
//public class XXXIV_PRINT_SENTENCES_FROM_WORD_LIST {
//    public static void main(String[] args) {
//        String[][] chararr = {
//                {"you ", "we "},
//                {"have ", "are "},
//                {"sleep", "eat", "drink"}
//        };
//
//        for (int i = 0; i < chararr[0].length; i++) {
//            for (int j = 0; j < chararr[1].length; j++) {
//                for (int k = 0; k < chararr[2].length; k++) {
//                    String temp = chararr[0][i] + chararr[1][j] + chararr[2][k];
//                    System.out.println(temp);
//                }
//            }
//        }
//    }
//}




package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXXIV_PRINT_SENTENCES_FROM_WORD_LIST {
    public static void main(String[] args) {
        String[][] chararr = {
                {"you ", "we "},
                {"have ", "are "},
                {"sleep", "eat", "drink"}
        };

        printAllCombinations(chararr, 0, "");
    }

    // Recursive function to generate all combinations
    public static void printAllCombinations(String[][] arr, int row, String sentence) {
        // Base case: if we reached the end of rows
        if (row == arr.length) {
            System.out.println(sentence.trim());
            return;
        }

        // Loop through each word in current row
        for (int i = 0; i < arr[row].length; i++) {
            if (!arr[row][i].isEmpty()) {  // Skip empty strings
                printAllCombinations(arr, row + 1, sentence + arr[row][i]);
            }
        }
    }
}
