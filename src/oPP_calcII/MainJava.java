package oPP_calcII;

public class MainJava {

	
	
	public static void main(String[] args) {
		
		
		Calc a = new Calc();
		  a.setX(78);       //x=78
		  a.setY(19);       //y=19
		 
		  
		  
		  a.plus();         // result=x+y
		 
		  System.out.println("1+1 = "+ a.getResult());// 78+19
		  
		  a.minus();
		  
		  System.out.println("1-1 = "+a.getResult()); // 78-19
		
	}
	
	
}
