package arraysListReview;

import java.text.DecimalFormat;
import java.util.*;

public class ReviewArrayList {

	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<>(Arrays.asList("hicham","hicham","noah","zeniti","hicham","hafidi","metouali","hicham"));
		
		RemovDup(list1);
		 DecimalFormat format=new DecimalFormat("0.00");
		 double numbers=23.83635635927;
		 String num=format.format(numbers);
		 System.out.println(num);

		
	}

	public static ArrayList<String>  RemovDup (ArrayList<String>    list){
		
		ArrayList<String>Result=new ArrayList<>();
		
		ArrayList<Integer>IntegerNUm=new ArrayList<>(Arrays.asList(10,10,12,21,10,123,13,10,10,90,76,10));
		System.out.println(IntegerNUm);
		Iterator<Integer>MyIterator=IntegerNUm.iterator();
		while(MyIterator.hasNext()) {
			if(MyIterator.next()==10) {
				MyIterator.remove();
			}
		}
		
		System.out.println(IntegerNUm);
		
		for(String each : list) {
			if(!Result.contains(each)) {
				Result.add(each);
			}
		}
		System.out.println(Result);
		return Result;
		
	}
	
	
}
