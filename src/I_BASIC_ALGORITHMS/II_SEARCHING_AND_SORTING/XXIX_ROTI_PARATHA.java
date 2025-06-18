//package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;
//
//public class XXIX_ROTI_PARATHA {
//    public static void main(String[] args) {
//        int paratas=10;
//        int cooks=4;
//        int k[]={1,2,3,4}; //ranks for ezach cook..
//        int count=0;
//        int time=0;
//
//        while(count<paratas){
//            for (int i=0;i<k.length;i++){
//                time+=k[i]*(cooks*(cooks+1))/2;
//            }
//        }
//    }
//}


//NHI HORA BHAI AAJ..KUCH BORE HORRA HAI...:(...


package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XXIX_ROTI_PARATHA {
    public static void main(String[] args) {
        int paratas = 10;
        int cooks=1;//no need as ranks.length bhi bhi batati hai...
        int[] ranks = {1,2,3,4}; // Rank of each cook

        int time = 0;

        // Keep increasing time until enough paratas are cooked
        while (true) {
            int totalMade = 0;

            // Go through each cook
            for (int rank : ranks) {
                int currentTime = 0;
                int prataTime = rank;
                int madeByThisCook = 0;

                // While this cook can cook one more prata in remaining time
                while (currentTime + prataTime <= time) {
                    currentTime += prataTime;
                    madeByThisCook++;
                    prataTime += rank; // Next prata takes longer
                }

                totalMade += madeByThisCook;
            }

            // If all paratas are cooked, break
            if (totalMade >= paratas) {
                break;
            }

            time++; // Try next minute
        }

        System.out.println("Minimum time: " + time);
    }
}
