package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXXI_COUNT_THE_CUSTOMERS_NOT_GET_COMPUTER {
    public static void main(String[] args) {
        int n = 3; // max computers
        String s = "GACCBDDBAGEE"; // pattern
        String temp = ""; // customers currently using computers
        String denied = ""; // customers who got rejected
        int count = n; // available computers
        int countCustomer = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String current = String.valueOf(ch);

            if (temp.contains(current)) {
                // Customer leaving
                temp = temp.replace(current, "");
                count++;
            } else if (denied.contains(current)) {
                // Already denied once, ignore now
                continue;
            } else {
                // New customer
                if (count > 0) {
                    temp = temp + current;
                    count--;
                } else {
                    // No computer available
                    countCustomer++;
                    denied = denied + current;
                }
            }
        }

        System.out.println(countCustomer);
    }
}
