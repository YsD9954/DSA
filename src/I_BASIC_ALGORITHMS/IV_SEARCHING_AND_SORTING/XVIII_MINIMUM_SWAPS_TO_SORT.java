package I_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XVIII_MINIMUM_SWAPS_TO_SORT {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6};
//        int brr[] = arr; //AISA NHI KARNEKA...VHO ARR JAISA CHNGE HOGA VAISE AUTOMATIC CHANGE HORRAA...BC KUCH MAGICAL HAI..
        int brr[] = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        for (int i=0;i<arr.length;i++){
            if(brr[i]!=arr[i]){
                count++;
            }

        }
        System.out.println(count/2); //chamtkar hua bhai ...kaise yaad aaya malum nhi ..but hamako bass jo bhi values galat jagh hai usko swap karna hai so if hame samje konsio galat hai toh hum directly unko divide by 2 karkee unka ek hi count le lenge..


    }
}


//NOTE:-
//1. QUESTION EAY THA BUT SOLUTION BAHUT IMP HAI..
//2. AISE SOLUTION ME BHI KUCH TOPH NHI HAI BASSS MENE LASTE ME COUNT/2 KIYA VHIO IMP THA KUYKI MEKO ELEMENT PATA CHALE THE KI KONSE CHANGE KARNE HAI BUT USKA DIVE BY 2 SE SWAPO BHI NIKAL GAY AYE NAY ACHAMATKAR HUA HAI..
