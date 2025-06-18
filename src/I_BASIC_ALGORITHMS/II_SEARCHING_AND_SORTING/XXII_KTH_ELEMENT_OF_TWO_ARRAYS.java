package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XXII_KTH_ELEMENT_OF_TWO_ARRAYS {
    public static void main(String[] args) {
        int arr[] = {2,3,6,7,9};
        int brr[] = {1,4,8,10};
        int k=5;
        int ans[] = new int[arr.length+brr.length];
        int temp1=0;
        int temp2=0;
        for (int i=0;i<ans.length;i++){
            if (i<arr.length){
                ans[i]=arr[temp1];
                temp1++;
            }
            else{
                ans[i]=brr[temp2];
                temp2++;
            }
        }
        for (int i=0;i<ans.length-1;i++){
            for (int j=i+1;j<ans.length;j++){
                if (ans[i]>ans[j]){
                    int temp=ans[i];
                    ans[i]=ans[j];
                    ans[j]=temp;
                }
            }
        }

        boolean flag=true;
        for (int i=0;i<ans.length;i++){
            if (i==k-1){//ZERO BASED INDEX HAI SO HAME EK - KARNA PADEGA...
                System.out.println(ans[i]);
                flag=false;
            }
        }

        if (flag==true){
            System.out.println(-1);
        }


    }
}
