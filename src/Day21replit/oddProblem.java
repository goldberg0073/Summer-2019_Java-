package Day21replit;

import java.util.Scanner;

public class oddProblem {

	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String word=input.nextLine();
		 int position;
		 int length;
				
		if(word.length()%2==1) {
			position=word.length()/2;      //rajadec      the middle will be 1 letter
			length=1;                      //0123456      length()=7  position 7/2=3  position+1=4
			
			String R=word.substring(position, position+length);
			System.out.println(R);
		}
		else {
			position=word.length()/2-1;   //raja10raja     the middle will be 2 letters
			length=2;                    //012345678910  length()=10    position=4     position+2=6 
			String R=word.substring(position, position+length);
			System.out.println(R);
		}
}
}