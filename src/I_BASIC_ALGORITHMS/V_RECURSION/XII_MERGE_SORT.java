package I_BASIC_ALGORITHMS.V_RECURSION;

import java.util.ArrayList;

public class XII_MERGE_SORT {
    public static void merge(int[] nums,int st,int mid,int end){
        int i = st;
        int j=mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i++;
            }
            else{
                temp.add(nums[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(nums[i]);
            i++;
        }

        while(j<=end){
            temp.add(nums[j]);
            j++;
        }

        for(int idx=0;idx<temp.size();idx++){
            nums[idx+st]=temp.get(idx);

        }

    }

    public static void mergesort(int[] nums,int st,int end){
        if (st >= end) return;   // BASE CASE

        int mid = st+(end-st)/2;
        mergesort(nums,st,mid);//left
        mergesort(nums,mid+1,end);//right
        merge(nums,st,mid,end);

    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        mergesort(nums,0,nums.length-1);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }


}
