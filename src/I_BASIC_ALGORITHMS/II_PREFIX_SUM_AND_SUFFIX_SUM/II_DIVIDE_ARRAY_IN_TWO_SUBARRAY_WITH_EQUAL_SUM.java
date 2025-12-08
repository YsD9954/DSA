package I_BASIC_ALGORITHMS.II_PREFIX_SUM_AND_SUFFIX_SUM;

public class II_DIVIDE_ARRAY_IN_TWO_SUBARRAY_WITH_EQUAL_SUM {
    public static void main(String[] args) {
//        see like partition the array into 2 equal subarray!!
//        now we can say like at any point whether is prefix and suffix is same
//   so just find prefix adn suffix sum array
//        then h=just check if prefix of i == to suffix of i+1 so we can say 2 wual sum hai!!
        int a[] = {1,3,5,6,2,1};

        int prefix[] = new int[a.length];
        int suffix[] = new int[a.length];

        prefix[0] = a[0];
        for(int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }

        suffix[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+a[i];
        }

        Boolean flag=false;

        for (int i=0;i<a.length-1;i++){
            if (prefix[i]==suffix[i+1]){
                flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}
