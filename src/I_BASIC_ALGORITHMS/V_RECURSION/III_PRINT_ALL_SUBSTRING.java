package I_BASIC_ALGORITHMS.V_RECURSION;

public class III_PRINT_ALL_SUBSTRING {
    public static void subsets(int i, int j, String s){
        if(i>=s.length()){//sirf i check karo as j toh jata hi rehta hai!
            return;
        }
        else if(j < s.length()){
            System.out.println(s.substring(i,j+1));
            subsets(i,j+1,s);
        }
        else{
            j=i+1; // because j ko i se kam nhi kar sakte that's it!! substring thodi aayega!
            subsets(i+1,j,s);
        }

    }

    public static void main(String[] args) {
        String s="abc";
        int i=0,j=0;
        subsets(0,0,s);
    }
}
