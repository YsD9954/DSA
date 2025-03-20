package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class IV_STRING_ROTATION {
    public static void main(String[] args) {
        String s = "Yash";
        String result = "shYa"; // Removed the leading space

        char arr[] = s.toCharArray();
        char res[] = result.toCharArray();

        int count = 0;
        boolean isRotation = false;

        while (count < s.length()) {
            // Rotate the array
            char temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;

            // Compare the rotated array with the result array
            boolean isMatch = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != res[i]) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                isRotation = true;
                break;
            }

            count++;
        }

        if (isRotation) {
            System.out.println("Yes! The strings are rotations of each other.");
        } else {
            System.out.println("No! The strings are not rotations of each other.");
        }
    }
}




//not an better option ..but efforts mare hai toh go with this but isse easy option is just concat i/p string(s1+s1) so 2 barr same string hai and check target strign is present in concated string or not