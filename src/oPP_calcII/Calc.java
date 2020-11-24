package oPP_calcII;

public class Calc {

	private int x;
	  private int y;
	  private int result;
	  
	  public int getResult(){  // to read the variable result 
		return result;
	  
	  }
	
	  public void setY(int y){  // to change the variable y
	    this.y=y;
	  }
	
	 public void setX(int x) {  // to change the variable x
		 this.x=x;
	 }
	
	 void minus() {
		 result=x-y;
	 }
	 void plus() {
		 result=x+y;
	 }
	 
}
