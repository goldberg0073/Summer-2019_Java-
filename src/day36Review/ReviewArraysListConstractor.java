package day36Review;

import java.util.ArrayList;
import java.util.Arrays;

public class ReviewArraysListConstractor {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,3,3,4,47,7,7));
		
		      list =RemoveDup(list);
		
		System.out.println(list);
	
		ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(4,4,4,5,5,56,6,7,7,8,8,8));
		
		
		       System.out.println(RemoveDup(list2));
		       
		       
		       String []names= {"raja","casablanca","dima","raja","raja"};
		       ArrayList<String>list3= new ArrayList<>(Arrays.asList(names));
		       System.out.println(RemoveDup2(list3));
		
		
	}
	
	public static ArrayList<Integer> RemoveDup(ArrayList<Integer>list){
		
		
		ArrayList<Integer>result=new ArrayList<>();
		for(Integer each:list) {
			if(!result.contains(each)) {   // "each" loop check all object in list variable however,"i" will be checking the indexes 
				result.add(each);          //of the list (to get indexes from the arraylist we use get(i) methods.
		
			
			/*
			 for(int i=o ;list.size();i++){
			 if(!result.contains(list.get(i)){
			 result.add(list.get(i));
			 }
			 }
			 */
			
			}
		}
return result;
		
	}
	public static ArrayList<String> RemoveDup2(ArrayList<String>list){
		ArrayList<String>result=new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			if(!result.contains(list.get(i))) {   
				result.add(list.get(i));
			}
		}
		return result;
		}
	
}
