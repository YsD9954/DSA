package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

public class III_SURVIVE_ON_ISLAND {
//        static int minimumDays(int S, int N, int M) {
//            // code here
//            if (M > N) return -1; // you can't even survive one day
//
//
//
//
//            int sunday = S/7;
//            int buyingdays = S-sunday;
//            // you req no.of days (s)* unit of food req each day(M) = total food reqi;
//            int  totalfood = S*M;
//            // if i am able to piurchase that so s*m/n ==> 0 or if not my ans = s*m/n+1..
//
//            int ans=0;
//
//            if(totalfood%N==0){
//                ans = totalfood/N;
//
//            }
//            else{
//                ans = totalfood/N + 1;
//            }
//
//            if(ans<= buyingdays){ //samjo ki muzhe har din 1 unit lena pada...so muzhe sunday ko len hi padega so mera -1 retun karna hai but ans toh s*m/n hoga isliye yecase explicitly dali hai!!
//                return ans;
//            }
//            else{
//                return -1;
//            }
//        }



//    NHI HORA ERROR HAI
    public static void main(String[] args) {

        int S = 10, N = 16, M = 2;
        if (M>N) {
            System.out.println("Can't Survive!!");
        }
        if(S>=7 && (M*7>S*6)) {
            System.out.println("Can't Survive!!");
        }

        int totalFood = S*M; // toral food for survival on island
        int totalDays = S-(S/7);//cutting sundays!!
        int totalFoodPurchasable = totalFood*totalDays; //max total food that we can get!!!


        if (totalFood>totalFoodPurchasable){ //nhi hai bhai hamare pass utna...
            System.out.println("Can't Survive!!");
        }


        System.out.println((totalFood+N-1)/N);
        int ans=0;


    }
}
