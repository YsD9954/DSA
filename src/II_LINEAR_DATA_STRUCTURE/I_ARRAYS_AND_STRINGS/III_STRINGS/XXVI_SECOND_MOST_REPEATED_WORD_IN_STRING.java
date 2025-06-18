package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXVI_SECOND_MOST_REPEATED_WORD_IN_STRING {
    public static void main(String[] args) {
        String s = "aaa bbb ccc bbb aaa aaa";
        String arr[] = new String[6]; // yaha pe hum count bhi kar sakte the bat jane de abhi..
        String temp="";
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '|| s.charAt(i)=='\0'){
                arr[count]=temp;
                count++;
                temp="";
            }
            else {
                temp=temp + String.valueOf(s.charAt(i));
            }
        }
        if (!temp.isEmpty()) {
            arr[count] = temp;
            count++;
        }
        int max=0;
        int max2[] = new int[6];
        for (int i=0;i<6;i++){
            count=0;
            for (int j=i;j<6;j++){
                if (arr[i].equals(arr[j])){
                    count++;
                }
            }
            max=Math.max(max,count);
            max2[i]=count;
        }
        int max2nd=0;
        String max2ndValue="";
//        for second max..
        for (int i=0;i<6;i++){
            if (max2[i]<max && max2[i]>max2nd){
                max2nd = max2[i];
                max2ndValue=arr[i];
            }
        }
        System.out.println("2nd Most Repeated: "+max2ndValue);

    }
}

//Note:-
//1.string ko space ke hisab se string array me spilt kardo ...
//2. abhi array me direct ".equals()" use karke apne ko repeating string mil jayenge...
//3. now repating count karo..
//4 for second repeating counts ka arry banake usko last me ye vali -> '(max2[i]<max && max2[i]>max2nd)' condition lagake 2nd max string and print kardo..!! :)