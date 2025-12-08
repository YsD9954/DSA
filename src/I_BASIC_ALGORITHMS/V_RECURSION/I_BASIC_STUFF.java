package I_BASIC_ALGORITHMS.V_RECURSION;

//1. print yash n times..
//
//public class I_BASIC_STUFF {
//    public static void print(String s, int n){
//        if(n==0){
//            return;
//        }
//        print(s,n-1);
//        System.out.println(s);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print("yash",n);
//    }
//}

//2. print linearly form 1 to N

//public class I_BASIC_STUFF {
//    public static void print(int n){
//        if(n==0){
//            return;
//        }
//        print(n-1);
//        System.out.println(n);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print(n);
//    }
//}

//3. print N to 1..

//
//public class I_BASIC_STUFF {
//    public static void print(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print(n);
//    }
//}


//4. sum of 1 to N..

//2. print linearly form 1 to N

//public class I_BASIC_STUFF {
//    public static void print(int n){
//        if(n==0){
//            return;
//        }
//        print(n-1);
//        System.out.println(n);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        print(n);
//    }
//}

// print N to 1..

//
//public class I_BASIC_STUFF {
//    public static int  print(int sum, int n) {
//        if (n == 0) {
//            return sum;
//        }
//        sum = sum + n;
////        System.out.println("-"+sum);
//        return print(sum, n - 1);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        int sum = print(0, n);
//        System.out.println(sum);
//    }
//}
//            or

//public class I_BASIC_STUFF {
//    public static int  print(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        return n+print(n-1);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        int sum = print(n);
//        System.out.println(sum);
//    }
//}

//4. factorial..

//
//public class I_BASIC_STUFF {
//    public static int  print(int n) {
//        if (n == 0||n == 1) {
//            return 1;
//        }
////        System.out.println("-"+sum);
//        return n*print(n - 1);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        int product = print(n);
//        System.out.println(product);
//    }
//}



//5. fibbo
//
//public class I_BASIC_STUFF {
//    public static int  print(int n) {
//        if (n <= 0) {
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        int fibbo = print(n-1)+print(n - 2);
//        System.out.println("-> "+fibbo);
//        return fibbo;
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        for(int i=0;i<n;i++){
//            int fibbo = print(i);
//            System.out.printf("index %d  :- %d \n", i, fibbo);
//        }
//
//    }
//}



//6. sort the arrray...



public class I_BASIC_STUFF {
    public static int[]  print(int[] arr, int n) {
        if (n == 0) {
            return arr;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("------------------------------");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        return print(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {2,8,5,4,10};
        int n = arr.length;
        System.out.println("Before: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        arr = print(arr,n-1);
        System.out.println("After: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}