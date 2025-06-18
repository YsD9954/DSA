//package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;
//
//public class XVIII_NUMERIC_KEYPAD {
//
//    // Mapping of characters to their corresponding keypad sequences
//    private static final String[][] KEYPAD_MAPPING = {
//            {"A", "B", "C"},    // 2
//            {"D", "E", "F"},    // 3
//            {"G", "H", "I"},    // 4
//            {"J", "K", "L"},    // 5
//            {"M", "N", "O"},    // 6
//            {"P", "Q", "R", "S"}, // 7
//            {"T", "U", "V"},    // 8
//            {"W", "X", "Y", "Z"} // 9
//    };
//
//    public static String convertToKeypadSequence(String sentence) {
//        StringBuilder keypadSequence = new StringBuilder();
//        sentence = sentence.toUpperCase();
//
//        for (char character : sentence.toCharArray()) {
//            if (character == ' ') {
//                keypadSequence.append('0'); // Space is represented by '0'
//            } else {
//                for (int i = 0; i < KEYPAD_MAPPING.length; i++) {
//                    String[] group = KEYPAD_MAPPING[i];
//                    for (int j = 0; j < group.length; j++) {
//                        if (group[j].charAt(0) == character) {
//                            // Append the corresponding number (i + 2) repeated (j + 1) times
//                            int number = i + 2;
//                            for (int k = 0; k <= j; k++) {
//                                keypadSequence.append(number);
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return keypadSequence.toString();
//    }
//
//    // Example usage
//    public static void main(String[] args) {
//        String inputSentence = "HELLO WORLD";
//        String outputSequence = convertToKeypadSequence(inputSentence);
//        System.out.println(outputSequence); // Output: 4433555555666096667775553
//    }
//}
