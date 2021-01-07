package day23_Arrays;

public class Warmup1 {

	public static void main(String[] args) {
		
		/*
		 2. write a program that can find the unique characters from a String.
			Ex: 
				input:
					AAABCDEEFF

				output:
					BCD        //  j=0 compare i=0 1 2 3 4 5 6 7 8 
		 
		 */
					String str ="ALL THE LETTERS";
					//			 i			
					String Unique ="";   // to store all the unique chars from str
					
				for(int j=0; j< str.length(); j++)	{
					
					int count = 0 ;  // count how many times the character is appeared    // countA=1
					
					for(int i=0; i < str.length(); i++) {
						//		highest value of i:  str.length()-1
						if( str.substring(i, i+1).equals( ""+str.charAt(j) )  ) {     
							count++;
						}
					}
					
					if(count == 1) {
						Unique+=""+str.charAt(j);
					}
					
				}
		            System.out.println("The Unique Letters are : ");
					System.out.println(Unique);

		System.out.println("###################################################");

		boolean exp=10>9;
		boolean result=Boolean.valueOf(exp);
		System.out.println("result = " + result);

		String string="12345";
		Integer integer=Integer.parseInt(string);
		System.out.println("integer = " + integer);


		
		
	}
	
	
}
