package InterviewQuestion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedWords {

    public static void main(String[] args) {

        String str="Goodbye bye bye world world world Reya is is the the best player in eye eye game";


        String removeRepeatedWords = RemoveRepeatedWords(str);
        System.out.println("removeRepeatedWords = " + removeRepeatedWords);


    }



    public static String RemoveRepeatedWords(String str){

        String []Array=str.toLowerCase().split(" ");
        LinkedHashSet<String > list=new LinkedHashSet<>();
        for (String each:Array
             ) {
            list.add(each);
        }
        String NewString="";
        for (String each:list
             ) {
            NewString+=" "+each;
        }

     return NewString;
    }
}
