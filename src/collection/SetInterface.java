package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		/*
		Set() : set interface doesn't have duplicates, and doesn't not have index numbers
		Implemented by HashSet(C),LinkedHashSet
		Extended BY SorttedSet That is implemented TreeSet
		
		Set<Integer>set1= new HashSet<>();
		Set<Integer>set2= new LinkedHashSet<>();
		Set<Integer>set3= new TreeSet<>();
		
		ONLY ACCEPTE UNIQUE OBJECT
		
		Set list doesn't not have index number
		
		 */
		
		Set<Integer>list=new HashSet<Integer>();
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(300);
		System.out.println(list);
		System.out.println(list.remove(100));
		System.out.println(list);
		System.out.println("###############################################################################");
		Set<Integer>set1=new HashSet<Integer>();
		set1.add(100);
		set1.add(100);
		set1.add(100);
		//System.out.println(set1.get(1));         set doesn't have index number
		
		System.out.println(set1);
		
		System.out.println("=###################################################################################=");
		
		Set<Integer>hashset=new HashSet<>();
		hashset.add(100);
		hashset.add(10);
		hashset.add(5);
		hashset.add(10);
		hashset.add(4);
		hashset.add(100);
		hashset.add(20);
		
		/*
		hashset======>
		remove duplicate but the ORDER is not kept
		 */
		
		
System.out.println(hashset);	

       Set<Integer>linkedhashset=new LinkedHashSet<>();
       linkedhashset.add(100);
       linkedhashset.add(10);
       linkedhashset.add(5);
       linkedhashset.add(4);
       /*
       both don't take duplicate  linkedhashset remove duplicate
       but keep the order of objects as it is 
       doubly linked
        */
       System.out.println(linkedhashset);
       
       /*
       SortedSet : sorted the list in ascending order
        */
       SortedSet<String>Treeset=new TreeSet<String>();   
       
       // ====> object can only be created by TreeSet only because 
       //Sorted doesnt not implement the other classes
       Treeset.add("Z");
       Treeset.add("T");
       Treeset.add("H");
       Treeset.add("A");
       
       System.out.println(Treeset);
           
       /*
       Remove duplicate from an array list and sorted
        */
       
       List<Integer>list1=new ArrayList<Integer>(Arrays.asList(10,9,6,45,76));
       Collections.sort(list1); // how to sort list and don't remove duplicate
       System.out.println(list1);
       
       List<Integer>list2=new ArrayList<Integer>(Arrays.asList(10,9,6,10,45,76,10,10));
       TreeSet<Integer>ts=new TreeSet<>(list2); // to sort the list in ascending order and removed the duplicate
       System.out.println(ts);
       
       List<Integer>NumbersList=new ArrayList<Integer>(Arrays.asList(1,5,10,15,20,10,20,10,20,30,40,50,60,40,80,90,90,100));
       System.out.println(NumbersList);
       Set<Integer>NumbersSet=new HashSet<>(NumbersList); 
       System.out.println(NumbersSet);
       NumbersSet.add(null);
       System.out.println(NumbersSet);
   
       
       
}
}