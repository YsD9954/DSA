package II_LINEAR_DATA_STRUCTURE.I_ARRAYS_AND_STRINGS.III_STRINGS;

public class XXIII_ROMAN_TO_INTEGER {
    public static void main(String[] args) {


        String s = "MCMIV";
        int chararray[] =new int[s.length()];

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='I'){
                chararray[i]=1;
            }
            if (s.charAt(i)=='V'){
                chararray[i]=5;
            }
            if (s.charAt(i)=='X'){
                chararray[i]=10;
            }
            if (s.charAt(i)=='L'){
                chararray[i]=50;
            }
            if (s.charAt(i)=='C'){
                chararray[i]=100;
            }
            if (s.charAt(i)=='D'){
                chararray[i]=500;
            }
            if (s.charAt(i)=='M'){
                chararray[i]=1000;
            }
        }
//        for (int i=0;i<s.length();i++){
//            System.out.print(chararray[i]+" ");
//        }
        int ans = chararray[s.length()-1];
        for (int i=s.length()-1,j=i-1;i>0;i--,j--){
            if(chararray[i]>chararray[j]){
                ans=ans-chararray[j];

            }
            else{
                ans=ans+chararray[j];

            }

        }
        System.out.println("Ans = "+ans);

    }
}


//Note-
//1.assigned eqvivalent numbers to chars..and convert to int array..
//2.just if aage vala > piche vala ..then ====>>> subtraction
//3.else addition..