package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XIX_BISHU_AND_SOLDIERS {
    public static void main(String[] args) {
        int N=7;
        int powers[]={1,2,3,4,5,6,7};
        int Q[]={3,10,2};

        for (int i=0;i<Q.length;i++){
            int count=0;
            int ans=0;
            for (int j=0;j<powers.length;j++){
                if (Q[i]>=powers[j]){
                    count++;
                    ans+=powers[j];
                }
            }
            System.out.println(count+"  "+ans);

        }


    }
}
