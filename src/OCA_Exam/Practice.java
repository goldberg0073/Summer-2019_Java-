package OCA_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Practice {

	
	public static int fib(int num){

		int result=0;
		int j=0;
		int z=1;

		for(int i=1; i<num; i++){

		result=j+z;
		j=z;
		z=result;
		
		}
     return result;

		}
	
	
	
	public static void main (String[]args) {
		System.out.println(fib(8));
		
		
		
		String str="AAABBBCCCXZMuuuuop";
		String [] Arr=str.split("");
		String unique="";
		
		for(int j=0;j<Arr.length;j++) {
			int count=0;
			for(int i=0;i<Arr.length;i++) {
				if(Arr[i].equals(Arr[j])) {
					count++;
								}
		}
			if(count==1) {
				unique+=Arr[j];
			}
		}
		System.out.println(unique);
		System.out.println("#####################################");
		
		
		
		ArrayList<String>names=new ArrayList<>(Arrays.asList("Ahmed","Eric","Ahmed","hisham","Ahmed"));
		
	//	names.removeIf(each->each=="Ahmed");
	//	System.out.println(names);
		
		Iterator<String>MyIterator=names.iterator();
		while(MyIterator.hasNext()) {
			if(MyIterator.next().equals("Ahmed")) {
				MyIterator.remove();
			}
		}
		
		System.out.println(names);
		System.out.println("########################################");
		
		int []array= {1,2,9,9,9,4,5,4,9,9,100};
		ArrayList<Integer>number=new ArrayList<>();
		int countZeros=0;
		for(int each:array) {
			number.add(each);
			if(each==9) {
				countZeros++;
			}
		}
		
		
		number.removeAll(Arrays.asList(9));
		System.out.println(number);
		array=new int[array.length];
		
		for(int i=0;i<array.length-countZeros;i++) {
		  array[i]=number.get(i);	
		}
		
		
		for(int each:array) {
			System.out.println(each+",");
		}
		
		String str1="hello2129";
		int total=0;
		char []charvalue=str1.toCharArray();
		for(char each:charvalue) {
			if(Character.isDigit(each)) {
				total+=Integer.valueOf(""+each);
			}
		}
		
		System.out.println("The total is "+total);
		
		
		ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1,2,3,4,67,89,76,32,12));
	//	numbers.removeIf(each->each>50);
		
		//System.out.println(numbers);
		
		Iterator<Integer>My= numbers.iterator();
		while(My.hasNext()) {
			if(My.next()>50) {
				My.remove();
			}
		}
		
		System.out.println(numbers);
		
		int a=10,b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
		String lowercase="(.*[a-z].*)";
		String password="ADSu12";
		System.out.println(password.matches(lowercase));
		
		
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(100,2,34,3,4,5,12,6,7,8,9,260,0));
	       for (int i = 0; i < list.size(); i++) {

	           for (int j = 0; j < list.size(); j++) {

	           if (list.get(i) > list.get(j)) {

	                       Integer temp = list.get(i);

	                       list.set(i, list.get(j));

	                       list.set(j, temp);

	                       }

	               }

	      }
	       
		System.out.println(list);
		
	}
}
