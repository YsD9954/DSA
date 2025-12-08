package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.Arrays;

public class XI_MINIMUM_PLATFORMS {
    public static void main(String[] args) {

        // menikalneke time ke accordign sort hio nahi kar akta as dekho usse hogahhi ki meri 11 baje vali train pahile nika jayegi and then 9 baje ki as 9 baje vali badme niklni vali hai so ..aose nhivhakega..

        // toh sort nhio karege as unhon hame arrival time ko sort karke diya hai toh jaise train aayego vaise sirf check karneka availbake hai ki nahu nhi toh nay aplatform!!

        // 9:00  9:40  11:00
        // 9:10  12:00 11:30
        // 9:50  18:00
        // 11:20 20:00
        // 15:00
        // 19:00


        // so only 3 platforms!!
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};


        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms_needed = 1, max_platforms = 1;
        int i = 1, j = 0;
        int n = arr.length;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms_needed++;
                i++;
            } else {
                platforms_needed--;
                j++;
            }
            max_platforms = Math.max(max_platforms, platforms_needed);
        }

        System.out.println(max_platforms);
    }
}
