package day53_InterfcaeContinue;


interface B{
	void method3();
}

public interface Extends_vs_Implements extends B {   // we can not use the implements key word between interfaces (extends instead)
	
	void method1();
	void method2();                //2 interfaces , 2 classes ======> use the extends keyword
	//void method3();              // 1 interface 1 class ========>implements keywords 

}

abstract class A implements  Extends_vs_Implements {

	//	void method1();
   //	void method2();
	
	//void method3();
	public void method1() {
		
	}
	public void method2() {
		
	}
	public void method3() {
		
	}
	abstract class C extends A implements Extends_vs_Implements{
		
	}
}