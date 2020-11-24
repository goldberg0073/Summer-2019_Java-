package repit;

public class exetcese156 {
	
	
	public static void main(String[] args) {
	
		
		String[]arr1= {"orange","raja","orange","peach","raja","orange",};
		String t1="orange";
		
		 System.out.println(count_appearance(arr1, t1)) ; 
	}		
	
		public static int  count_appearance(String[] some_array,String some_string) {
		//  0    1     2     3     4     length=4   
		// String [] some_array = {"a","foo","bar","foo","bla"};
		// String some_string="foo";
	int count_appearance1=0;
		 for(int i=0;i<some_array.length;i++) {
	  	if(some_array[i].equals(some_string)) {
			count_appearance1++;
		}
		
	}
		return count_appearance1;
	}


}