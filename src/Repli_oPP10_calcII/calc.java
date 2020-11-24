package Repli_oPP10_calcII;

public class calc {
	

	private static int y=20;
	private static int x=50;
	private static int result;

	static int getResult(){
	  return result;
	}

	public  void setY(int y){     
     this.y=y;
	}
	 public  void setX(int x){
	 this.x=x;
	 } 
	
	 
	
	 
   static int plus(int x,int y){
	    calc.x=x;
	    calc.y=y;
	 return  result= calc.x+calc.y;
	
	  
	  }
   static int  minus(int x,int y){
	   
	  return result= x-y;
//	   System.out.println(result);
	  }
	
}
