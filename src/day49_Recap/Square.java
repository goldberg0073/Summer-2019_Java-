package day49_Recap;

public class Square extends Shape{

//	protected void Area() {
//	System.out.println("Area is 0");	
//	}
//	protected void perimeter() {
//    System.out.println("perimeter is 0");		
//	}
//    protected void capacity() {
//		System.out.println("capacity is 0");
//	}

	double side;
	public Square(double side) {
		this.side=side;
	}
	@Override
	protected void Area() {
		double Area =side*side;
		System.out.println("Area of the square is"+Area);
	}
	@Override
	protected void perimeter() {
		double perimeter=side*4;
		System.out.println("the perimeter of the square is "+perimeter);
	}
	
	
	
}
