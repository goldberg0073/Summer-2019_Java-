package day49_Recap;


public class Review {
	
	
	
	
	public static void main(String[] args) {
		
		
		String word ="I am very happy with Java";
		
		System.out.println(Reverse(word));
		
	}

	public static String Reverse(String word) {
	   
		return new StringBuffer(word).reverse().toString();
	}
}
