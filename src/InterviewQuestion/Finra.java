package InterviewQuestion;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Hey, Enter some thing");
//        String original = scan.nextLine();
//
//        String reverse="";
//
//        for (int i = original.length()-1; i >=0 ; i--) {
//            reverse+=original.charAt(i);
//        }
//        if(reverse.equals(original)){
//            System.out.println(original+" is Palindrome");
//        }else{
//            System.out.println(original+" is not Palindrome");
//        }

        int i=0;

        while(i<30){
            i++;
            if(i%3==0&&i%5!=0){
                System.out.println("fin");
            }
            else if (i%5==0&&i%3!=0){
                System.out.println("ra");
            }
            else if(i%3==0 &&i%5==0){
                System.out.println("finra");
            }
            else{
                System.out.println(i+ " ");
            }
        }

    }
}
