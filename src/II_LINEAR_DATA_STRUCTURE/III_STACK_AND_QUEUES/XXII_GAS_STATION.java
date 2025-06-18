package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;


public class XXII_GAS_STATION {
    public static void main(String[] args) {
        int gas[] = {1, 2, 3, 4, 5};
        int cost[] = {3, 4, 5, 1, 2};
        int result[] = new int[gas.length];
        boolean flag = false;
        for (int i=0;i<gas.length;i++){
//            System.out.println("i-"+i);
            for (int j=i;j<gas.length;j++){
                result[i]+=gas[j]-cost[j];
//                System.out.println(result[i]);
                if (result[i]<0){
                    break;
                }
            }
            for (int j=0;j<i;j++){
                result[i]+=gas[j]-cost[j];
//                System.out.println(result[i]);
                if (result[i]<0){
                    break;
                }
            }

            if (result[i]>=0){
                System.out.println(i);
                flag=true;
                break;
            }

        }

        if (flag==false){
            System.out.println(-1);
        }


    }
}


//Note:-
//kuch nhi hai bhai .. just pura gas ka array trAVERSE KARO HAR EK ELEMENT SE SHURU KAR KE DEKHA ZERO se greater than equal to!! AARA HI KI NAHI AND KAHI BHI RESULT ZERO AAYA THEN JUST BREAK KARKE NEXT ELEMT KO PAKDO..
//now pura array trabverse hone ke baad bhi kuch nhi mila then just flag ke conditionm se -1 print karo !!