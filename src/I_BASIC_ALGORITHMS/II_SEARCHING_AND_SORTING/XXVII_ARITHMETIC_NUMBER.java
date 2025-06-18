package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XXVII_ARITHMETIC_NUMBER {
    public static void main(String[] args) {
        int a=1; //first term
        int b=2;//check number is it exist or not..
        int c=3; //common differnnce
        int n=0;
        int tn=0;
        boolean flag=true;
//        tn = a+(n-1)d;
        while(tn<b){
            tn = a+(n-1)*c;

            if (b==tn){
                flag=false;
                System.out.println("Exist at n = " + n);
            }
            n++;
        }
        if (flag==true){
            System.out.println("Not Exist!!!");
        }

        System.out.println();
    }
}
