package repli1;

import java.util.ArrayList;

public class RepeatAlMethod {

	public static void main(String[] args) {
		
		ArrayList<Boolean>list=new ArrayList<>();
		list.add(true);
		list.add(false);
		list.add(false);
		list.addAll(list);
		
		System.out.println(list);	
		
	}
	
	public static void repeatAL(ArrayList<Boolean>list){
		  
		list.addAll(list);
		
	}
	
	
}
