package Day21replit;


public class Replit_weekend {
	
	public static void main(String[] args) {
		
		int sum1=0;
		for(int i=1 ;i<=1000;i++) {
		sum1+=i;
			
		}
		System.out.println(sum1);
    
        int sum3=0;
        for(int i=1;i<=1000;i++) {
        	if(i%2==1) {
        		sum3+=i;
        	}
        }
		System.out.println("sum of all odd numbers: "+sum3);
        
		int sum4=0;
		for(int i=1;i<=1000;i+=2) {
			sum4+=i;
		}
		System.out.println("sum of all odd numbers: "+sum4);
        
		
		
		
		
	}
	
	
}	


