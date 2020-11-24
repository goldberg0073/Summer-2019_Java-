package day53_InterfcaeContinue;

public interface Interface_Vs_Abstracttion {
	
	
	public abstract void method1();
	public abstract int method2();
    public void method3();
    void method4();  // the public access modifiers are given by default to the variables and methods in interface
   

     int r=5; // public is given by default and the variable is static  
               //by default (there is no instance variable or method in Interface) constructor neither
}
class Test implements Interface_Vs_Abstracttion{

	@Override
	public void method1() {
		
	}

	@Override
	public int method2() {		
		return 0;
	}

	@Override
	public void method3() {
	}

	@Override
	public void method4() {
		
	}
	
	public static void main(String[] args) {
		
	}
	
}