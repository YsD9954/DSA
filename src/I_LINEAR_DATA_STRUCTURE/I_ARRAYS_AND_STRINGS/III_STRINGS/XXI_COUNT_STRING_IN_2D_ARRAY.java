package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXI_COUNT_STRING_IN_2D_ARRAY {
    public static void main(String[] args) {
        char arr[][] = {{'D','D','D','G','D','D'},
                {'B','B','D','E','B','S'},
                {'B','S','K','E','B','K'},
                {'D','D','D','D','D','E'},
                {'D','D','D','D','D','E'},
                {'D','D','D','D','D','G'}};
        int r = 6, c = 6;
        String s = "GEEKS";
        int countString = 0;

        // Left to Right (Row-wise)
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= c - s.length(); j++) {
                int count = 0;
                for (int k = 0; k < s.length(); k++) {
                    if (arr[i][j + k] == s.charAt(k)) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == s.length()) {
                    countString++;
                }
            }
        }

        // Right to Left (Row-wise)
        for (int i = 0; i < r; i++) {
            for (int j = c - 1; j >= s.length() - 1; j--) {
                int count = 0;
                for (int k = 0; k < s.length(); k++) {
                    if (arr[i][j - k] == s.charAt(k)) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == s.length()) {
                    countString++;
                }
            }
        }

        // Top to Bottom (Column-wise)
        for (int j = 0; j < c; j++) {
            for (int i = 0; i <= r - s.length(); i++) {
                int count = 0;
                for (int k = 0; k < s.length(); k++) {
                    if (arr[i + k][j] == s.charAt(k)) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == s.length()) {
                    countString++;
                }
            }
        }

        // Bottom to Top (Column-wise)
        for (int j = 0; j < c; j++) {
            for (int i = r - 1; i >= s.length() - 1; i--) {
                int count = 0;
                for (int k = 0; k < s.length(); k++) {
                    if (arr[i - k][j] == s.charAt(k)) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == s.length()) {
                    countString++;
                }
            }
        }

        System.out.println("Count of occurrences of the string: " + countString);
    }
}


//hum char loop lagaynege for 4 ways of searching because digobnaql nahi bola hai..
//1 row => LtoR
//2 row=> RtoL
//3 column => UtoD
//4 column => DtoU..