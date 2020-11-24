package day48_MethodOverRiding;


class Mahribana{

	
//private void method() {
//		System.out.println("Method A"); // the method we are going to override must be inhertibale to the sub class 
//	}
	
	void method() {
		System.out.println("Method A");
	}
		
	public String methodB() {
		return "B";
	}
	
	public double salary(double bonus) {
		return bonus+10000;
	}
}

//public class AccessModifiers {
//    @Override
//	 private void method() {
//		System.out.println("Method A");    // without extending the class there is no override " extends Mahribana"
//	}
//    //override method acces modifiers need to be same or more visble
  
    public class AccessModifiers extends Mahribana {  // Mahribana the class that generate all the methods needs to be override
    	
    	@Override
    	public double salary(double bonus) {
    		return bonus+10000;
   	}
//    	
    	
    	
    	
//    	@Override
//    	protected double salary(int bonus) {  must provide same parameters
//    		return bonus+10000;
//    	}
    	
    	
    	
    	
    	
    	@Override
    	public void method() {
    		
    	}
    	
        @Override
    	public String methodB() {
    		return "C";
    	}
    	
}
