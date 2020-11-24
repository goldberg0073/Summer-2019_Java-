package arraysListReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ArraylistReview {

	public static void main(String[] args) {
		
	
	
	ArrayList<Integer> list =new ArrayList<>();
	               //    variableName

	ArrayList<String>items= new ArrayList<>();
	
	// 1- add(object):add object to the index 0 to .....         and add(index,object):add object at the given index
	
	items.add("peach");
	items.add("orange");
	items.add(1, "grape");

	System.out.println(items);    // No need for loop or each loop to print out items Arraylist
	
	
	// 2- get (index number):  return the object
	System.out.println(items.get(2));    //  return object   correspondent to the index number 2  "orange'
	
	
	// 3- size() : give the length of the array as an int value 
	
	int Length = items.size();      // for string  and Array we have length and length() but for Arraylist we have size() ;
	    System.out.println(Length);
	
	// 4-Clear() : remove all objects from ArrayList 
	    //     items.clear();
	
	//  5- set (index, object) ; change the index object value
	
	  
	  System.out.println(items);
	  String str= items.set(2, "apple");  // change the object in the given index (2==> orange) to apple and return the object changed
	  System.out.println(str);
	  System.out.println(items);
    
	  // 6- contains : check if contains object then return a boolen exression False or True ;
	  // we can assign it to boolean result= items.contains("apple");
	  System.out.println(items.contains("apple"));    // return true
	  
	  // 7- equals (arrayList) : check if 2 arraylist are equal or not 
	
	  ArrayList<String> items2= new ArrayList<>();
	
	items2.add("peach");
	items2.add("orange");
	items2.add("grape");
	items2.add("peach");
	boolean result=  items2.equals(items);                              
	
	System.out.println(result);   // return false
	
	
	// remove(index): remove the given index and decrease the size of ArrayList return the object removed
	// can be used to remove a String variable from an ArrayList
	// example remove "wac" from an arrayList[raja,dima,athletic,club]
	
	
	System.out.println(items2.remove(2));
	System.out.println(items2);  // after removing index2's object ==> grape 
	//size became 2 instead of 3 and grape removed from the arrayList
	
	// remove (Integer) :removes first matching object at the same time return a boolean expression
	 boolean resulta=  items2.remove("peach"); // remove the given object and if contains in the arrayList 
	 //return true otherwise false with no change 
	
	System.out.println(resulta);
	System.out.println(items2);
	
	// addAll   combine 2 arrayList list1 and list2 we will print out the new arrayList value (list1) 
	
System.out.println("=========================================================================================================");
	
List<Integer>lista=new ArrayList<>(Arrays.asList(80,60,40,30,50,20,10,70,90));
	System.out.println(lista);

	
	//remove object 90 from the list
//	System.out.println("remove the item on 8 inedx : "+lista.remove(8));
	
	// "removeIf"  another method to remove object from a list (lambda expression)
	lista.removeIf(each->each==90);
	
	System.out.println("new list after removing 90 using lambda : "+lista);
	// add object 100 to the list so will take the last index place
	lista.add(100);
	
	System.out.println(lista);
	//sort the array list in ascending order
	lista.sort(null);
	System.out.println(lista);
	for(Integer  each: lista) {
		System.out.print(each+" ");
	}
	System.out.println("===================================");
	List<String>cars=new ArrayList<String>(Arrays.asList("GTi","audi","mercedes","bmw","jetta","ford","jeguar"));
	
//	System.out.println(cars.remove(0));
//	System.out.println(cars);
//	cars.remove("bmw");
//	// remove using lambda operator
//	cars.removeIf(each->each.contains("je"));
//	
//	for(String car:cars) {
//		System.out.println(car);
//	}
	
       Iterator<String> li  = cars.iterator();
       
      // int num = 0;
       while(li.hasNext()){
    	  
    	   if(li.next().equals("audi")) {
    		   
    		   li.remove();
    	   }
    	   
       }
        
	   System.out.println(cars);


	
	
	
	
	
	
	
	
	
	
	}	
}
