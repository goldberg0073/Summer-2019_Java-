package OCA_Exam;

import java.util.Arrays;

public class OCA_ExamPart1 {

	public static void main(String []args) {
	//Questio1
		int[][]arr=new int[][] {{1,2},{3,4}};
		arr[1]=arr[0];
		System.out.println(arr[1]);//hashcode
		System.out.println(arr[1][0]);//1
		// the output will be a hashcode because arr[1] will print an element or object but definitely
		// not an int value  however we need to give the indexes (2 dimentional array)
	
	//Question2
	 
		int[][]arr1=new int[2][];
		double[][]arr2=new double[][] {{1,2},{3,4}};
	  //long [][]arr3=new long [2][] {{1,2},{3,4}};//compile error why?
		int[][]arr4= {{'A','B'},{'C','D'}};
	 // Either we assign values to the array 2 D directely  or give the size we cant do both 
		
		
		//Question3
		
		int[][]arr5= {{1,2,3},{3,4}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr5[i][j]+" ");	
			}
		}
		//arr5[0][0]  
		//arr5[0][1]  
		//arr5[1][0] 
		//arr5[1][1]  
		
		//Question4
		
		
		
		
		
		//Question5
		//Question6
		//Question7
		
	    
	   System.out.println("*********************************************");
		//Question11
		String[][]arrStr= {{"A","B","C"},{"D","E"}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arrStr[i][j]);
				if(arrStr[i][j].equals("B")) {
					break;
				}
			}
		}
	
	// "i" will go from    0 to 1    and "j"  will go from      [0][0]  [0][1] break [0][2] 
	//0 to 2   first loop  then will go from 0 to 1 second loop [1][0]   [1][1] 
	
		//Question12
		System.out.println("*********************************************");
		int wd=0;
		String[]days= {"sun","mon","wed","sat"};
		for(int i=0;i<days.length;i++) {
			switch(days[i]) {
			case "sat":
			case "sun":
				wd-=1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd+=2;
			}
		}
		System.out.println("The Answer for question 12 is  "+wd);
		
		//Question14
		
		int[]num1=new int[3];
		int[]num2= {1,2,3,4,5};
		num1=num2;
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		
		
		//Question20
		String ta="A";
		ta=ta.concat("B");
		System.out.println(ta);
		String tb="C";
		ta=ta+tb;
		System.out.println(ta);//ABC
		ta.replace('C', 'D');
		System.out.println(ta);// will still ABC because we did not assign this value to "ta"
		
		
		//Question23
		int numbers[];
		numbers=new int[2];
		numbers[0]=10;
		numbers[1]=20;
		
		numbers=new int[4];
		numbers[2]=30;
		numbers[3]=40;
		System.out.println(Arrays.toString(numbers));
		// Before we give value to the array we must give size first or 
		// give value directely using curly braces
	


		//Question26
	
		String stuff="TV";
		String res="";
		
		res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No Result";
		
		
		//Question 31
		
		//switch statement can not have a value of double Only Int , String or Enum
		// IMPORTANT the type must match with the case values
		int z=10;
		//double z=10;
		switch(z) {
		case 10:System.out.println("Monday");
		
		
		}
	
	
	
	
	}
	
	
}
