package day09;

public class HTTPS_statuscode {

	
    public static void main(String[] args) {
		
    	/*
    	200, OK

201, Created

202, Accepted

301, Moved Permanently

303, See Other

304, Not Modified

307, Temporary Redirect

400, Bad Request

401, Unauthorized

403, Forbidden

404, Not Found

410, Gone

500, Internal Server Error

503, Service Unavailable
    	 */
    	
   
    	
    	
    	int StatusCode =500;
    	
    	
    	
    	if (StatusCode==200) {
    		
    		System.out.println("OK");
    	}
    	if (StatusCode==201){
    	System.out.println("Created");
    		
    	}
    	
    	if (StatusCode==301) {
        		
        		System.out.println("Moved Permanently");
        	}
    	if (StatusCode==303) {
        		
       		System.out.println("See Other");
        	}	
    		
    if (StatusCode==304) {
    		
    		System.out.println("Not Modified");
    	}
    	if (StatusCode==307) {
    	System.out.println("Temporary Redirect");
    		
    	}
    	
    	if (StatusCode==400) {
        		
        		System.out.println("Bad Request");
        	}
    	if (StatusCode==401) {
        		        		System.out.println("Unauthorized");
        	}		
    	
    	if (StatusCode==403) {
    		System.out.println("Forbidden");
    	}
    	
    	if (StatusCode==404) {
    		System.out.println("Not Found");
    	}
    	
    	if (StatusCode==410) {
    		System.out.println("Gone");
    	}
    	
    	if (StatusCode==500) {
    		System.out.println("Internal Server Error");
    	}
    	
    	if (StatusCode==503) {
    		System.out.println("Service Unavailable");
    	}
    		
    		
    		
    		
    		
    		
    		
    	
    	
	}
	
	
	
	
}
