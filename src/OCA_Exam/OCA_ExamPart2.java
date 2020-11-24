package OCA_Exam;

import java.util.ArrayList;

public class OCA_ExamPart2 {
	
	public static void main (String[]args) {
		
		String []arr= {"A","B","C","D"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			if(arr[i].equals("C")) {
				continue;
			}
			

			System.out.println("Work Done");
			
		}	
		
		ArrayList<String>names=new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		names.remove("Bran");
		System.out.println(names);
		
		
		Boolean[]bool=new Boolean[2]; 
		bool[0]=Boolean.valueOf(null);
		System.out.println(bool[0]);
		
		
		//System.out.println(new String("Java SE 8"));
		System.out.println("*****");
		System.out.println(new OCA_ExamPart2("Java SE 8"));
	}
	

	String msg;
	public OCA_ExamPart2(String str) {
		msg=str;
	}
	
}
