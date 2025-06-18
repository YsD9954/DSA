package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class VI_OPTIMUM_LOCATION {
    public static void main(String[] args) {

        float mindist=Integer.MAX_VALUE;


        int points[][] = { { -3, -2 },
                           { -1, 0 },
                           { -1, 2 },
                           { 1, 2 },
                           { 3, 4 } };
//        assuming point lower to upper hai mere starting and ending X,Y................

        int start_X=points[0][0];
        int start_Y=points[0][1];
        int end_X=points[points.length-1][0];
        int end_Y=points[points.length-1][1];

        for (int x=start_X;x<=end_X;x++){
            for(int y=start_Y;y<=end_Y;y++){
                float dist=0;
                if(x-y-3==0){//mera line ka euation..
//                    System.out.println(x+","+y); no need of point for which distance is min
                    for (int i=0;i<points.length;i++){
                        dist+=(float)Math.sqrt(((points[i][0]-x)*(points[i][0]-x))+((points[i][1]-y)*(points[i][1]-y)));
//                        System.out.println(dist);
                    }
                    mindist=Math.min(dist,mindist);
                }
                else{
                    continue;
                }
            }
        }

        System.out.println("Minimum Distance:- "+mindist);



    }

}




//NOTE-
//1.QUESTION KO RESPECT DO...
//2.FIRST START AND END POINT NIKALO KAHA SE KAHA TAK APNE LINE ME DISTANCE KAM AA SAKTA HAI..AND START LOOP..
//3. FIND DISTANCE IF POINTS ME MERA LINE KA EQUATION SATISFIED HUA..ADN THEN DISTANCE ADD KARO SAB POINTS KE LIYE....
//4.LAST ME MINIMUM DISTANCE KO UPDATE KARO BY COMAPARING..ADN NOTE DIST VALUE HAR EK NEW POINTS JISME LINE KA EQN SATISFY HUA USME ZERO SE START HONI CHJAYIE
//5.BSS KHATAM PRINT KARO MINDISTANCE...