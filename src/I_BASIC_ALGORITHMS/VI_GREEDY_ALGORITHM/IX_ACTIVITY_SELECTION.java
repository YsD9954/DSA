package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class IX_ACTIVITY_SELECTION {
    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5}, finish[] = {2, 4, 6, 7, 9, 9};


        int n = start.length;
        int count=1;
        int activity[][] = new int[n][2];

        for(int i=0;i<n;i++){
            activity[i][0]=start[i];
            activity[i][1]=finish[i];
        }

        Arrays.sort(activity,(a, b)->a[1]-b[1]);

        int end=activity[0][1];
        for(int i=0;i<n-1;i++){
            if(end<activity[i+1][0]){
                end=activity[i+1][1];
                count++;

            }
        }


        System.out.println(count);
    }
}
