package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class I_FIRST_AND_LAST_POSITION_IN_SORTED_ARRAY {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int n= 5;
        int ans[]={-1, -1};//only when i/p array is positive if not max integer aisa kuch lena padega ..adn then -1 ke jagh usko replace karna padega pure code me..

        for (int i=0;i<arr.length;i++){
            if (arr[i]==n && ans[0]==-1){
                ans[0]=i;
            }
            else if(arr[i]==n && ans[0]!=-1){
                ans[1]=i;
            }
        }
        System.out.println("First Ocurrence - "+ans[0]+"; Last Ocurrence - "+ans[1]);

    }
}


//Note-
//1. ek toh ans array 2 hi values ka lo..
//2. pahila index jab first occur hoga tabhi bharega..yaad rakho and if pahila bahr gaya hen only second bharega..
//3.thoda dimag lagaya hai ..and baki kuch nhi sirf value mathch hua toh daldo last me a first pahile bhar gaya..