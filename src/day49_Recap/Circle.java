package day49_Recap;

public class Circle extends Shape {

	
//	protected void Area() {
//	System.out.println("Area is 0");	
//	}
//	protected void perimeter() {
//    System.out.println("perimeter is 0");		
//	}
//    protected void capacity() {
//		System.out.println("capacuty is 0");
//	}

	double radius;
	final double PI=3.14;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	@Override
	protected void Area() {
		double Area=radius*radius*PI;
		System.out.println("Area of cercle is "+Area);
	}

	
	@Override
	protected void perimeter() {
		double perimeter=2*radius*PI;
		System.out.println("perimeter of cercle is "+perimeter);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
