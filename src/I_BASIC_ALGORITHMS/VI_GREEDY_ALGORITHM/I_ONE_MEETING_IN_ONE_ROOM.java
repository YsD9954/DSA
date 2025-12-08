package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;
import java.util.HashMap;

public class I_ONE_MEETING_IN_ONE_ROOM {

    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        for (int i=0;i<end.length-1;i++){
            for(int j=i+1;j<end.length;j++){
                if (end[i]>end[j]){
                    int temp = end[i];
                    end[i] = end[j];
                    end[j] = temp;

                    int temp2 = start[i];
                    start[i] = start[j];
                    start[j] = temp2;
                }
            }
        }

        System.out.println("passed=> "+start[0]+","+end[0]);
        int count=1;
        int meetend=end[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] > meetend) {
                System.out.println("passed=> "+start[i]+","+end[i]);
                count++;
                meetend = end[i];
            }
        }


        System.out.println(count);

    }
}


//note=>condition me 'meetend<end[i+1]' mat check aakro becuse uske vaje se last tak loop nhi jara tha!!

//also direct sort karsakte ho toh vho karo as time limit bahu jyada hora aise sart ka!!