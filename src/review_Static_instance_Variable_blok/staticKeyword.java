package review_Static_instance_Variable_blok;

public class staticKeyword {

	
	public String InsName="hisham";            // give public to all of them ===> visible to all other classes
	public static String StaName="hisham";
	
	
	
	public static void printName() {
	//	System.out.println(InsName);     static only accepts static ; does not accept instance
	
	staticKeyword obj1=new staticKeyword();
	    
	System.out.println(StaName);  // static only accepts static 
	
	}

    public void printName2() {
	System.out.println(InsName);  
	
	System.out.println(StaName);  // class members are always accepted
}







}
