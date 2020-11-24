package repli1;

import java.util.ArrayList;
import java.util.Collections;

public class exercise187 {

	
	//create your method below
	public static ArrayList<String> combineAL(ArrayList<String>worldList1,ArrayList<String>worldList2) {

		//ArrayList<String>worldList1=new ArrayList<String>();
		
	
//  Collections.sort(worldList1);    // sort the arrayList using Collections.sort
  //Collections.sort(worldList2);
  worldList1.addAll(worldList2);   // combine 2 arrayList 
  ArrayList<String>combineAL=worldList1;  // print out the new arrayList which is 
                                          //the the first arrayLiat after adding the second one to it

  //System.out.println(worldList1);
  return combineAL;
 
	}	

	public static void main(String[] args) {
		
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("hisham");
		list1.add("raja");
		list1.add("club");
		list1.add("athletic");
		list1.add("dima");
		
		ArrayList<String>list2=new ArrayList<String>();
		list2.add("love");
		list2.add("amour");
		list2.add("greenboys");
		list2.add("ultraeagles");
	
	combineAL(list1, list2);
	
	System.out.println(combineAL(list1, list2));
	}
	
	

}
