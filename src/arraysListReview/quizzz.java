package arraysListReview;

public class quizzz {


	
	public static void main(String[] args) {
		
		
		try {
			System.out.println(9/0);
			System.out.println("this is try block");
			
		}catch(ArithmeticException e) {
			System.out.println("this is catch block");	
		}catch(RuntimeException e) {
			System.out.println("this is catch block");
		}catch(Exception e){
			System.out.println("this is catch block");
		}
		finally {
			System.out.println("this is finally block");
		}
		System.out.println("lets see");
	
	}
}
