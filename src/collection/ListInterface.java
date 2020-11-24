package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
		
		Stack<Integer>st=new Stack<>();
		for(int i=10;i<80;i+=10) {
			st.add(i);
		}
		int num=st.pop();
		System.out.println(num);
		
		List <Integer>list1 =new ArrayList<>(); 
		// Array based class, internally uses the array
		
		
		List<String> list2=new LinkedList<>();   
		// each objects are doubly linked in the linkedList 
        //====> adding & removing data are faster 
		//Retrieving data (get() method) is slower
		
		
		List<Double>list3=new Vector<>(); 
		
		
		ArrayList<Integer> arraylist=new ArrayList<>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.remove(1);
		
		System.out.println(arraylist);
		
		
		LinkedList<Integer> linkedlist=new LinkedList<>();
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.remove(1);
		
		System.out.println(linkedlist);
		System.out.println("=============================================================");
		
		String[]arr= {"A","B","B"};
		
		List<String>NotLinked=new ArrayList<>(Arrays.asList(arr));
		LinkedList<String>Linked=new LinkedList<String>(Arrays.asList(arr));
		
		
		Vector<String>vector=new Vector<>();  // has synchronized keyword ===> more safer but slower
		
		System.out.println("=============================================================");
		
		Stack<Integer>stack=new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		// public synchronized void add(String str){  } ==> this the add method in vector
		// advantage : thread save in Multi-thread 
         // Disadvantage; slower
		
		/*
		Stack : child class of vector ===> has a method called pop() gives the last index in the vector 
		list and remove is from it( last in , first out) 
		
		*/
		
		System.out.println("=============================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
