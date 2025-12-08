package IV_ADVANCED_ALGORITHMS.II_DYNAMIC_PROGRAMMING;

public class V_MINIMUM_COST_PATH {

    static int path(int m,int n){

        if (m==1 && n==1){
            return 1;
        }
        if (m==0 ||n==0){
            return 0;
        }
        int rightcost = 0,downcost = 0;
        rightcost=rightcost+path(m,n-1);
        downcost=downcost+path(m-1,n);
                
        return rightcost+downcost ;
    }

    public static void main(String[] args) {
        int grid[][] = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}};

        System.out.println(path(4,4));

    }
}
