package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XIX_FACTORIAL_OF_LARGE_NUMBERS {
    public static void main(String[] args) {

        int n = 5;
        int fact = 1;
        int r = 0;
        if (n == 0) {
            System.out.println("Gharpe Ja... [1] HI HAI ..\n JA RE JA ABHIII...");
        } else {
            for (int i = 1; i < n; i++) {
                fact += fact * i;

            }

            String no = Integer.toString(fact);

            System.out.print("[ ");
            for (int i = 0; i < no.length(); i++) {
                System.out.print(no.charAt(i) + " ");
            }
            System.out.print("]");


        }
    }
}
