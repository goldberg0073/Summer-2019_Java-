package repit;

public class exercice159 {
 
//class Main {
 public static String c_profits (int buyPrice,int sellPrice){
		    //your code here
		   
	   if(buyPrice<sellPrice) 
		     
			   return("profit");
		   
	   else if (buyPrice>sellPrice) 
		     
			   return("loss");
		   
	   else //(buyPrice==sellPrice) 
		     
			   return ("no loss");
		
		
		  // else {
		//	   return null;
		//   }
	
 }

 public static void main(String[] args) {
		
		String result=c_profits(105,100);
	 
	 System.out.println(result); 

}   
}	   
		  
		



