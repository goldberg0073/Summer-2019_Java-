package day49_Recap;

public class Shape {

	protected void Area() {
	System.out.println("Area is 0");	
	}
	protected void perimeter() {
    System.out.println("perimeter is 0");		
	}
    protected void capacity() {
		System.out.println("capacuty is 0");
	}
	
    
    public static void main(String[] args) {
		
    	Rectangle rectangle= new Rectangle(10,20);
    //	rectangle.length=10;
    //	rectangle.width=20;
    	rectangle.Area();
    
    	Rectangle rectangle2 =new Rectangle(30, 40);
    	rectangle2.Area();
    	
    	rectangle2.perimeter();
    	
    	rectangle2.capacity();
    	
    	
    	Square square1=new Square(10);
    	square1.Area();//100
    	square1.perimeter();
    	
    	square1.capacity();
    	
    	
    	Circle circle1=new Circle(5);
    	circle1.Area();
    	circle1.perimeter();
    	
    	
    	Cylinder cylinder=new Cylinder(2, 5);
    	circle1.Area();
    	circle1.perimeter();
    	circle1.capacity();
    	
    	
    	
    	
	}
    
}
