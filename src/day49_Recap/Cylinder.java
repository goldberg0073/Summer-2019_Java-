package day49_Recap;

public class Cylinder extends Shape{

	double radius;
	double height;
	final double PI=3.14;
	double diameter;
	
	
	public Cylinder(double radius,double height) {
		this.height=height;
		this.radius=radius;
		diameter=radius*2;
	}
	
	protected void Area() {
	double Area=(2*PI*radius*radius)+(height*2*PI*radius);
	System.out.println("Area of the Cylinder is "+Area);
	}
	
	protected void perimeter() {
		double perimeter=2*(diameter*PI+height);
		System.out.println("perimeter of the Cylinder is "+perimeter);
		}
	
	
	
}
