package day09;

public class TimeGmt {

	
	public static void main(String[] args) {
		
	
		int hour=40 , minutes=59 , seconds=60 ; 
	    String amOrPm= "AM";
	    String amOrPm1="PM";
	    
	   
	    
	    
	    if ( hour>=1 && hour<=12 && minutes>=1 && minutes<=60  && seconds>=1 && seconds<=60) {
	    	
	    	System.out.println(hour+":"+minutes+":"+seconds+ amOrPm);
	    }
	    
	    else if (hour>12 && hour<=24 && minutes>=1 && minutes<=60  && seconds>=1 && seconds<=60) {
	    	
	    	System.out.println(hour+":"+minutes+":"+seconds+ amOrPm1);
	    }
	
	    else {
	    	System.out.println("this is a nice weed quality!!! ");
	    }
	
	
	
	
	
	
	}

	
	
}
