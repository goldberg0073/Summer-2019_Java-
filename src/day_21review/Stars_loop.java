package day_21review;

import java.util.Scanner;

public class Stars_loop {

	
	public static void main(String[] args) {
		
		
	Scanner input =new Scanner(System.in);
	String message = input.nextLine();
    String sender;
    String phoneNumber;
    String messageBody;
    System.out.println("Sender: "+message.substring(message.indexOf("<")+1,message.indexOf(">")));
    System.out.println("Phone Number: "+message.substring(message.indexOf("[")+1, message.indexOf("]")));
    System.out.println("Message body: "+message.substring(message.indexOf("{")+1, message.indexOf("}")));
    
	}
}
