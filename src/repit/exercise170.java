package repit;

public class exercise170 {

	
	public static void main(String[] args) {
		
		  String begood= clean("good bla bla bla bla bla bla bad what everbla bla bla","bla" );  // 0,3  1,4  2,5 

		System.out.println(begood);
		
	}
	
	public static String clean (String text ,String badWord) {
		
		
	    String clean="";
		for(int i=0 ; i<text.length()-badWord.length();i++) {
			
			if (text.substring(i,badWord.length()+i).contains(badWord)) {      //0    3
			
			
			}
		}
		
	
		 clean += text.replaceAll(badWord,"");
		return clean;
		
	
	}
	
	
	
	
}
