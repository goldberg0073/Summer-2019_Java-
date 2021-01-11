package InterviewQuestion;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        String Str1="AQTGAQTG" , Str2="GAQTGAQTZ";
        boolean sameLetters = SameLetters(Str1, Str2);
        System.out.println("sameLetters = " + sameLetters);

    }
    public static boolean SameLetters(String str1,String str2){
        char[]char1=str1.toCharArray();
        char[]char2=str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        String NewStr1="" , NewStr2="";
        for (char each:char1
             ) {
            NewStr1+=each;
        }

        for (char each:char2
        ) {
            NewStr2+=each;
        }

        if(NewStr1.equals(NewStr2)){
            return true;
        }
       else
           return false;
    }

}
