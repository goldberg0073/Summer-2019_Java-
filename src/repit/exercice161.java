package repit;

public class exercice161 {
	
	
	
	
	public static void main (String[] args ){
	    waterTax(300);
	System.out.println(waterTax(300)); 
	}
	  
	  
	  public static double waterTax(double units)
	  {
	    double bill = 0.0;
 //your code here   1             2                       1          2            1              2             1
	 bill=(units>=0&&units<=50)?bill=units*0.60:(units>50&&units<=100)?units*0.90:(units>100&&units<=150)?bill=(units*0.90)+50:(units>150)?bill=(units*0.90)+100:(units*0.90)+100;
	    
	    
	    
	    //end your code here
	    
	    
	    return bill;
	
	  }
}
