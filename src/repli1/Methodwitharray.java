package repli1;

public class Methodwitharray {

	
	
	public static int[] addElements(int[] ints1, int[] ints2) {
	//int []ints;
    
		
	for(int i=0 ; i<5;i++) {
             ints1[i]= ints1[i] + ints2[i];
     }
	     
     return ints1;
	  	   
	  }

public static void main(String[] args) {
	
	
	int[]num1= {5,34,45,78,99};
	int[]num2= {10,20,30,40,50};
	
	
	
	addElements(num1, num2);
	
	
	for(int each:num1) {
		System.out.println(each);
	}
	
	
	
	
}






}
