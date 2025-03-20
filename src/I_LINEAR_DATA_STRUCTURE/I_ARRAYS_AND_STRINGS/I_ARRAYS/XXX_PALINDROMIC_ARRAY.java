package I_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.I_ARRAYS;

public class XXX_PALINDROMIC_ARRAY {

    public static boolean ispalindrome(int n){
        String str = Integer.toString(n);
        for (int i=0;i<str.length();i++){
            for (int j=str.length()-1;j>=0;j--){
                if (str.charAt(i)!=str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int arr[] = {121, 131, 20};
        int count =0;

        for (int i=0;i<arr.length;i++){
            if (!ispalindrome(arr[i])){
                System.out.println("Not a Palindrome Array!");
                break;
            }
            else{
                count++;
            }
        }

        if (count==arr.length){
            System.out.println("Palindrome Array!");
        }
    }
}
