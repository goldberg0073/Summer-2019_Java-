package day36Review;

import java.util.ArrayList;
import java.util.Arrays;


public class ReviewArraysMethods {

	public static void main(String[] args) {
		

		ArrayList<Integer>list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3, 10);
	
	System.out.println(list);
	
	
	System.out.println(list.size());  // size returns the total number of element in the list
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
	System.out.println();
	
	for (int i=list.size()-1;i>=0;i--) {
		System.out.print(list.get(i)+" ");  //  print in reverse order
	}
	// clear(); removes all objects from array list 
	System.out.println();
	
	
	//list.clear();
	//System.out.println(list);
	//System.out.println(list.size());
	
	//set(index,given object) :replace the index with the given object.
	
	ArrayList<String>students=new ArrayList<>();
	students.add("hisham");
	students.add("raja");
	students.add("casablanca");
	students.add("khaldrogo");
	students.add("gameofThrones");
	students.add("raja");
	

	System.out.println(students);
    
	students.set(0,"goldberg");
	System.out.println(students);
	
	
	// indexofmethods (indexOf(object)):returns the first matching object's index number.
	
	System.out.println(students.indexOf("raja"));
	
	// lastIndexOf(object): returns the last index number of the object.
	
	System.out.println(students.lastIndexOf("raja"));
	
	
	ArrayList<String>students2=new ArrayList<>(Arrays.asList("A","B","C","D"));
	
	//equals():
	System.out.println(students.equals(students2));
	//students=students2;
	System.out.println(students.equals(students2));
	
	//contains(object): checks if the given object is contained in the arraylist.
	
	System.out.println(students.contains("Khaldrogo"));
	
	
	//isEmpty() : checks if the size of the Arraylist is 0 or not ,return boolean 
	
	
	//remove(primitives int):removes the index numbers 
	ArrayList<Integer>price= new ArrayList<>();
	price.add(1);//0
	price.add(2);//1
	price.add(3);//2
	
	price.remove(1);//[1,3]
	System.out.println(price);
	
	ArrayList<Integer>nums = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,2,2,2,3,3,3)); 
		for(int i=0 ;i<nums.size();i++) {
			if(nums.get(i)==1) {
				nums.remove(i);
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

 

}
