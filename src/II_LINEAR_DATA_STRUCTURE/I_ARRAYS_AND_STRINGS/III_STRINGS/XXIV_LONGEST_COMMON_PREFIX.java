package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXIV_LONGEST_COMMON_PREFIX {
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        int n=strs[0].length();
        for (int i=0;i<strs.length;i++){
            n=Math.min(n,strs[i].length());
        }
        String ans="";
        char temp='c';//random kuch bhi intialize karne keliye dall do..
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<strs.length;j++){
                temp = strs[0].charAt(i);
                if (strs[j].charAt(i)==temp){
                    count++;
                }
            }
            if(count==strs.length){
                ans=ans+String.valueOf(temp);
            }
        }
        System.out.println(ans);
    }
}


//Note-
//1.find out less char vali srtring so kam maximum prefix toh uske jyada nhi ho akta...
//2.loop outer..=> 0 to less string vali chars ke equal (n)..
//3 loop inner => iterate to check same index char for all element/strings in array..
//4.so dhayan se outer string ke chars the..inner apna array...
//5.baki count karke check karo ans me add karo..