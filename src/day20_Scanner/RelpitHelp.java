package day20_Scanner;

public class RelpitHelp {
	
	
	public static void main(String[] args) {
		
		
		
		String item1="Tometoes", item2="Cheese", item3="Apples";
		double price1=3.3,price2=4.4,price3=4.8;
		int count1=1,count2=0,count3=3;
		double totalPrice=price1*count1+price2*count2+price3*count3;
		
	
		
		
		if(count1>0&&count2>0&&count3>0) {
	    	System.out.println("Item1: "+item1+" Price: "+price1*count1+", "+"Item2: "+item2+" Price: "+price2*count2+", "+"Item3: "+item3+ " Price: "+price3*count3);}
	    if (count1<=0&&count2>0&&count3>0) {
	    	System.out.println("Item2: "+item2+" Price: "+price2*count2+", "+"Item3: "+item3+ " Price: "+price3*count3);
	    }
	    
	    if (count1>0&&count2<=0&&count3>0) {
	    	System.out.println("Item1: "+item1+" Price: "+price1*count1+", "+"Item3: "+item3+ " Price: "+price3*count3);
	    }
			
	    if (count1>0&&count2>0&&count3<=0) {
	    	System.out.println("Item1: "+item1+" Price: "+price1*count1+", "+"Item2: "+item2+" Price: "+price2*count2);
	    }
	    if(count1<=0&&count2<=0&&count3>0) {
	    	System.out.println("Item3: "+item3+ " Price: "+price3*count3);
	    }
	    if(count1<=0&&count2>0&&count3<=0) {
	    	System.out.println("Item2: "+item2+" Price: "+price2*count2);
	    }
	    if(count1>0&&count2<=0&&count3<=0) {
	    	System.out.println("Item1: "+item1+" Price: "+price1*count1);
	    }
	    
	    if(count1<=0&&count2<=0&&count3<=0) { 
	    	System.out.println(0);
	    }
		
	    
	    
	    System.out.println("Total price: "+totalPrice);
	    
	    
				
	}

}
