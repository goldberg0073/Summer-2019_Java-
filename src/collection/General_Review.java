package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class General_Review {
	public static void main(String[] args) {
		
		// iterating collection using iterator interface
		List<Integer>list=new ArrayList<>(Arrays.asList(12,34,56,45,76,98,100,200,303,403));
		// to iterate all over the list items we use the iterator () method 
		Iterator<Integer>myIter=list.iterator();
		// hasNext()        // next()       //remove()
	
	   System.out.println(list);	
		// iterate all over the list items and remove all the Integers >100
	   
	   
	   while(myIter.hasNext()) {
			Integer each=myIter.next();
			if (each>100) {
                 myIter.remove();
			}
		}
		System.out.println(list);
		System.out.println("#############################################");
		
		Collection<String>coll=new ArrayList<String>(Arrays.asList("raja","dima","khadra","eagle","dima","malongo","dima"));
		System.out.println(coll);
		//add item
		coll.add("metouali");
		System.out.println(coll.size());
		//remove item /removeAll items
		System.out.println(coll.remove("khadra")); // we get true and the items is removed from the list collection
		//contains/containsAll
		System.out.println(coll.contains("metouali")); // return true
		System.out.println(coll);
		
		coll.removeIf(each->each=="dima");
		System.out.println(coll);
		
		
		System.out.println("#############################################");
		Collection<Integer>numbers=new ArrayList<>(Arrays.asList(12,23,10,43,54,65,10,23,56,79,10,10));
		System.out.println(numbers);
		
		//removeIf : this is used with lambda expression
		numbers.removeIf(each->each==10);
		System.out.println(numbers);
		System.out.println("#############################################");
		
		List<Integer>listNum=new ArrayList<Integer>(Arrays.asList(5,12,3,5,9,56,5,34,100,5));
		System.out.println(listNum);
		listNum.add(1, 100);// add item to specific index
		listNum.contains(5);//reture boolean
		listNum.remove(5); // will remove item that has index 5 which is 9
		System.out.println(listNum);
		//set method to change element 
		for(int i=0;i<listNum.size();i++) {
			if(listNum.get(i)==100) {
			listNum.set(i, 2000);
				
			}
		}
		System.out.println(listNum);
		//other way 
		ListIterator<Integer> myListIter= listNum.listIterator();
		while(myListIter.hasNext()) {
			Integer each=myListIter.next();
			if(each==2000) {
				myListIter.set(9000);;
			}
		}
		
		
		System.out.println(listNum);
		//replaceAll items using lambda expression
		listNum.replaceAll(each->each+100);
		System.out.println(listNum);
		
		
		
		
	}

}
