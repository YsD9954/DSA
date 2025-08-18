package I_BASIC_ALGORITHMS.II_PREFIX_SUM;

//PREFIX SUM..EASY !!

//SO, Consider a example....
//A={2,1,3,4,5};
//so o/p will be...
//pref={2,3,6,10,15};

//pref[0] = A[0];
//pref[1] = A[0]+A[1];
//pref[2] = A[0]+A[1]+A[2];
//pref[3] = A[0]+A[1]+A[2]+A[3];
//pref[4] = A[0]+A[1]+A[2]+A[3]+A[4];

//SO IF YOU OBSERVE CAREFULLY WE CAN SAY THAT...
//pref[0] = A[0];
//pref[1] = pref[0]+A[1];
//pref[2] = pref[1]+A[2];
//pref[3] = pref[2]+A[3];
//pref[4] = pref[3]+A[4];

//so ALGO BECOMES..

//FOR any i>=1
//    pref[i] = pref[i-1]+a[i];
//
//LET'S CODE IT!!...
//class THEORY{
//    public static void main(String[] args) {
//        int A[] = {2,1,3,4,5};
////        simply prefix naya arry abanake karo ..ashamr aarray nhi change karna hai toh..
////        prefix[] = new int[n]
////        prefixp[0] = A[0];
////        ans baki sabh same sirf prefix me add j=karna ..!
////        but abhi keliye hamare me hi change kar diya!! or bola hoga nay array mat banao!
//
//        for (int i=1;i<A.length;i++){
//            A[i]=A[i-1]+A[i];
//        }
//        for (int i=0;i<A.length;i++){
//            System.out.print(A[i]+" ");
//        }
//    }
//}
//


