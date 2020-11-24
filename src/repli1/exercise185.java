package repli1;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise185{
	
	
	public static void test(ArrayList<String> words){
		//write code here
		
		words.add(0,"hey");
		words.add(3,"yo");
		
		System.out.println(words);
	
	}
	
	public static void main(String[] args) {
		
		ArrayList<String>words=new ArrayList<>();
		words.add("google");
		words.add("yahoo");
		words.add("amazon");
		words.add("facebook");
		words.add("wikipedia");
		
		test(words);	
		
	
	
	
	
		
}
	
	
	
}
	
	
	
	
	
	
	
	
