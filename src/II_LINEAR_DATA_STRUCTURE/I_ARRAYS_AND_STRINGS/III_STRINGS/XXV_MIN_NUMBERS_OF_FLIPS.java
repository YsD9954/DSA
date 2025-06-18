//package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;
//
//public class XXV_MIN_NUMBERS_OF_FLIPS {
//    public static void main(String[] args) {
//        String s = "001";
//        char schar[] = s.toCharArray();
//        int count =0;
//        for (int i=1;i<s.length();i++){
//            for (int j=i-1;j<s.length()-1;j++){
//                if (schar[j]=='0'){
//                    if (schar[i]=='1'){
//                        if (schar[j+1]=='1'){
//                            continue;
//                        }
//                        else{
//                            schar[j+1]='1';
//                            count++;
//                        }
//                    }
//                }
//                if (schar[j]=='1'){
//                    if (schar[i]=='0'){
//                        if (schar[j+1]=='0'){
//                            continue;
//                        }
//                        else{
//                            schar[j+1]='0';
//                            count++;
//                        }
//                    }
//                }
//            }
//        }
//
//        for (int i=0;i<s.length();i++){
//            System.out.print(schar[i]);
//        }
//        System.out.println();
//        System.out.println(count);
//    }
//}





package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXV_MIN_NUMBERS_OF_FLIPS {
    public static void main(String[] args) {
        String s = "1001010111";
        char schar[] = s.toCharArray();
        int count1 = 0, count2 = 0;

        // Checking flips for "010101..."
        for (int i = 0; i < schar.length; i++) {
            if (i % 2 == 0) { // Even index should be '0'
                if (schar[i] != '0') {
                    count1++; // Flip to '0'
                }
            } else { // Odd index should be '1'
                if (schar[i] != '1') {
                    count1++; // Flip to '1'
                }
            }
        }

        // Checking flips for "101010..."
        for (int i = 0; i < schar.length; i++) {
            if (i % 2 == 0) { // Even index should be '1'
                if (schar[i] != '1') {
                    count2++; // Flip to '1'
                }
            } else { // Odd index should be '0'
                if (schar[i] != '0') {
                    count2++; // Flip to '0'
                }
            }
        }

        System.out.println("Minimum flips required: " + Math.min(count1, count2));
    }
}
