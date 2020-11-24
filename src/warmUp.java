
public class warmUp {

	public static void main(String[] args) {
		
	String a = RemoveDup("AAAAABBBBBCCCCCDDDDD");
		
		
	System.out.println(a);	
		
	
	}

	public static String RemoveDup (String str) {
		
		
		String result="";
	
		for(int i=0;i<str.length();i++) {
		if(!result.contains(str.substring(i,i+1))){
			result+=str.subSequence(i,i+1);
		}
	}
		
		return result;
	}

}
