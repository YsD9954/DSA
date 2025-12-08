//package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;
//
//public class XXVIII_SMALLEST_FACTORIAL_TRAILING_ZEROES {
//    public static void main(String[] args) {
//        int n=3;
//        int zeroes=0;
//        int fact=1;
//        int i=1;
//
//        while(zeroes<n){
//            zeroes=0;
//            fact*=i;
//            String str_fact = Integer.toString(fact);
//            for (int j=str_fact.length()-1;j>=0;j--){
//                if (str_fact.charAt(j)=='0'){
//                    zeroes++;
//                }
//                else{
//                    break;
//                }
//            }
//            i++;
//        }
//        System.out.println(i-1); //same abhi tak samja hoga kyu hi -1 kiya ...as last me i++ hua and uske baad condin check hui ..so jab satisgfy hua tha but tobhi i++ hua and then ek extra i so hjhamne lastme -1 kiya...
//    }
//}

//APNA LOOP ME HUM EACH I KE LIYA FACTORIAL NIKA L RAHE HAI ISLIYA FOR BIGGER N VHO INFINTE LOOP ME JA RAHA AHI..
//SO FOR '0'S WE NEED ONLY MULTIPLE OF VALE FACTORIAL OTHER WISE 0 POSSIBLE HI NAI HAI..!YEEEDEEEE :(..

package I_BASIC_ALGORITHMS.IV_SEARCHING_AND_SORTING;

public class XXVIII_SMALLEST_FACTORIAL_TRAILING_ZEROES {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        int zeroes = 0;
        while (zeroes < n) {
            int num =i;
            zeroes=0;
            while (num > 0) {
                num /= 5;
                zeroes += num;
            }
            i++;
        }

        System.out.println(i - 1);
    }

}
