package repit;

public class exercise166 {
	public static void main(String[] args) {
			
		 String a =mergeStrings( "dimadima", "raja");//driamjaadima
		 System.out.println(a); //01234567
		
	}

	public static String mergeStrings(String one, String two) {
	       
		String str="";
		String str1=str+str.concat(one.substring(one.length()-two.length(), one.length()));
		   
			
		if(one.length()>two.length()) {
				   
			    
			    	for(int i=0 ;i<two.length();i++){          // one.length()=5      two.length()=8
			           
					
			    		str+=one.substring(i,i+1).concat(two.substring(i, i+1)); 	 
			    	//	str.concat(one.substring(one.length()-two.length(), one.length()));
	                     //8-4 , 7
		  
			    	
			    	}
			    	
			  }
			    	
/*			  
			  
			String str1= 
		                     //8-4 , 7
			  
			  
			  
			  
			  					  
			  
			  if (one.length()<two.length()) {
				  
			    	 for(int i=0 ;i<one.length();i++){
				           
						  str+=one.substring(i,i+1).concat(two.substring(i, i+1));
					//	 0,1 hw  1,2 eo 2,3 lr 3,4 ll 4,5 od 5,6 123  
					  }
			 }
			
			  String str2=str.concat(two.substring(two.length()-one.length(),two.length()));
			  
			  
			  
			  
			  
			if(one.length()==two.length()) {
				  
				 for(int i=0 ;i<one.length();i++){
					  str+=one.substring(i,i+1).concat(two.substring(i, i+1));
				//	 0,1 hw  1,2 eo 2,3 lr 3,4 ll 4,5 od 5,6 123  
				  
				 }
			}
*/
		return str1;
		

	}
	
}
