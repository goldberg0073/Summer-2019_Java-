package repit;

public class exercise143 {
	public static void printHollowRect(){
		
		           // 01234   rect.length()=5
	    String rect ="*****\n";
	   for(int j=1;j<=5;j++) {
	    for(int i=0; i<=5;i++){ 
	    	
	    	
	    	rect+=rect.substring(i,i+1)+(rect.substring(j,j+1));
	  	   
	    	
	       
	                                 }
	   }
	   System.out.println(rect);
	  }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
		
		
		
		
		
		
		
		
		
		
		
	}

}
