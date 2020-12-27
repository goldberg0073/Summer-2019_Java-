package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToBeDeleted {

    int rollno;
    String name;
    static String college ="ITS";

    ToBeDeleted(int r,String n){
        rollno = r;
        name = n;
    }
    void display (){System.out.println(rollno+" "+name+" "+college);}

    public static void main(String[] args) {

        ToBeDeleted s1 = new  ToBeDeleted(111,"Karan");
        ToBeDeleted s2 = new  ToBeDeleted(222,"Aryan");

        s1.display();
        s2.display();










    }

}
