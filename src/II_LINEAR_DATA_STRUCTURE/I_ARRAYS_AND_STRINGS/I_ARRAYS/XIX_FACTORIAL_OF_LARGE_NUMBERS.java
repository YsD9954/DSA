package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

import java.math.BigInteger;

public class XIX_FACTORIAL_OF_LARGE_NUMBERS {
    public static void main(String[] args) {

//        int n = 16; // till 16 0/p aayega ...
//        int fact = 1;
//
//        if (n == 0) {
//            System.out.println("Gharpe Ja... [1] HI HAI ..\n JA RE JA ABHIII...");
//        } else {
//            for (int i = 1; i < n; i++) {
//                fact += fact * i;
//
//            }
//            System.out.println(fact);
//


//        method 2 ==> kitna bhi bada number aaye hum nhi darte...1L takh bhi kaerpa re..
            int n = 10000;
            BigInteger fact = BigInteger.ONE;

            if (n == 0) {
                System.out.println("Gharpe Ja... [1] HI HAI ..\n JA RE JA ABHIII...");
            } else {
                for (int i = 1; i < n; i++) {
                    fact = fact.multiply(BigInteger.valueOf(i));

                }
                System.out.println(fact);

        }
    }
}
