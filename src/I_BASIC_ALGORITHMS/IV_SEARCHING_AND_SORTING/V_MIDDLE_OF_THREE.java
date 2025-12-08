package I_BASIC_ALGORITHMS.IV_SEARCHING_AND_SORTING;

public class V_MIDDLE_OF_THREE {
    public static void main(String[] args) {
        int a=246;
        int b=214;
        int c=450;

        if (a>b && a>c){
            if (b>c){
                System.out.println("a>b>c");
                System.out.println(b+" is middle");
            }
            else {
                System.out.println("a>c>b");
                System.out.println(c+" is middle");
            }
        }

        else if (b>a && b>c){
            if (a>c){
                System.out.println("b>a>c");
                System.out.println(a+" is middle");
            }
            else {
                System.out.println("b>c>a");
                System.out.println(c+" is middle");
            }
        }
        else{
            if (a>b){
                System.out.println("c>a>b");
                System.out.println(a+" is middle");
            }
            else{
                System.out.println("c>b>a");
                System.out.println(b+" is middle");
            }
        }
    }
}
