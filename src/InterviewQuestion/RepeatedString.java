package InterviewQuestion;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        scan.next();


        String str="abcac";
        int num=10;
        RepeatedString(str,num);




    }

    public static void RepeatedString(String str,int num){   // "abcac"   num =10

        String Repeated="";
        while(Repeated.length()<num){
            Repeated+=str;

        }

        System.out.println("Repeated = " + Repeated);
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <Repeated.length() ; j++) {
                if(str.charAt(i)==Repeated.charAt(j)){
                    count++;
                }

            }

            if(str.charAt(i)=='a')
            System.out.println("character = " + str.charAt(i)+" is repeated "+count);


        }



    }
}
