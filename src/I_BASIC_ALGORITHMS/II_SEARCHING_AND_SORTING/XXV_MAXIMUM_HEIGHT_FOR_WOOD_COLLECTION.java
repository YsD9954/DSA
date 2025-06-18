package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

import java.util.Arrays;

public class XXV_MAXIMUM_HEIGHT_FOR_WOOD_COLLECTION {
    public static void main(String[] args) {
        int N=5; //maximum possible no of trees that can be cut...
        int M=20; //req. amount of wood in meter ...

        int tree_height[] ={4,42,40,26,46};
        Arrays.sort(tree_height); // 10,15,17,20
        int max=tree_height[tree_height.length-1];//20
        int sum=0;
        while(sum!=M){ // unhone question me hi clearly bola hai that ki sum of height M se jya da hi hogi toh indirectly.. sum == m hona hi chayie..
            sum=0;
            for (int i=0;i<tree_height.length;i++){
                if (tree_height[i]>=max){
                    sum+=tree_height[i]-max;
                }
            }
            max--;
        }
        max=max+1;//+1 karna pada kuyki..????==> pahile minus hora and uske baad vale iteration me hi condition check hoga in while and then loop break hoga so, ek minues extra ho jayega...
        System.out.println(max);


    }
}
