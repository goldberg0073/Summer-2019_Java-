package loopReview;

public class Classreviewloop {

	
	public static void main(String[] args) {
		
		String input="XXXYYYZZZ";
		
		String removedup="";
		for (int i=0;i<input.length();i++) {
			if(!removedup.contains(input.substring(i, i+1))) {
				removedup+=input.substring(i, i+1);	
			}	
		}		
		System.out.println(removedup);
		
		String result="";
		
		for(int j=0;j<removedup.length();j++) {
		
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.substring(i,i+1).equals(removedup.substring(j, j+1))) {
				count++;
			}
	
		}
		result+=removedup.substring(j, j+1)+count;
		
		}
		System.out.println(result);
							}
	 }
	

