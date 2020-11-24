package loopReview;

public class loopReview1 {

	public static void main(String[] args) {
		
	
		String str = "AABBCCDD";   // expected result = "A2B2C2D2";
		            //AABBCCDD
		
		String expectedResult = "";
		
	    for(int j=0; j < str.length(); j++) {
	    	int count = 0;
		for(int i=0; i < str.length(); i++) {
			
			if(str.charAt(i) == str.charAt(j)) {
				count++;	
			}
			
		}
		expectedResult += ""+str.charAt(j)+count;
		
		 str = str.replace(""+str.charAt(j), "" );  
			
		 // after adding the str.charAt(j),
	}
	    System.out.println(expectedResult);
	    
	    	
	}
}
