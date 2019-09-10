package day14_Scanner;


import java.util.Scanner;


public class ScannerClass {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a Byte Value 1");
	     byte byteNum   = input.nextByte();
	         
	System.out.println("You have entered : "+byteNum);
	System.out.println("Enter a Byte Value 2");
	     byte byteNum2     =  input.nextByte();
	     System.out.println("You have entered : "+byteNum2);


    System.out.println(byteNum+byteNum2);



}




}
