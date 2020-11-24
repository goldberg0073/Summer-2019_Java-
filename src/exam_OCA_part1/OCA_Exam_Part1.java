package exam_OCA_part1;

import java.util.Arrays;

public class OCA_Exam_Part1 {
	
	public static void main(String[] args) {
	
String strr="java";
String strr1="java";
String strr2[]= {"j","a","v","a"};
System.out.println(strr==strr1);
//System.out.println(strr==strr2);
String strr3="";
for(int i=0;i<strr.length();i++) {
	strr3=strr3+strr2[i];
}
System.out.println(strr3);	
System.out.println(strr==strr3);
System.out.println(strr.equals(strr3));	
	int num=10;
	add10(num);
	System.out.println(num);
		
		
		
	int [][] arr= new int [2][];
     double [][] arr2 =new double [][] {{1,2},{3,3}};  
    // long [][] arr3 =new long [2][] {{1,2},{3,3}}; 
	int [][] arr4= {{1,2},{3,4}};

	
	
	int [][]arr5= {{1,2,3},{3,4}};
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.println(arr5[i][j]+" ");
		}
	}
	
	String [] [] arr6= {{"A","B","C"},{"D","E"}};
	
	for(int i=0;i<arr6.length;i++) {
		for(int j=0;j<arr6[i].length;j++) {
	//		System.out.println(arr[i][j]);
//			if(arr6[i][j].equals("B")) {
//				break;
//			}
		}
	}
	
	
	
	
	
	
	String str=" ";
	str.trim();
	System.out.println(str.isEmpty());
	//System.out.println(str);
	
	
	int ivar=100;
	double dvar=123;		
	float fvar =200;
	ivar=(int)fvar;
	fvar=ivar;
	
	

	int wd=0;
	String []days= {"sun","mon","wed","sat"};
	for(int i=0;i<days.length;i++) {
		
		switch (days[i]) {
		
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
	
	System.out.println("whaaaaaat "+wd);
	
	
	int []num1=new int[3];
	System.out.println(Arrays.toString(num1));
	
	
	
	
	int []num2= {1,2,3,4,5};
	num1=num2;
	for(int i=0;i<num1.length;i++) {
		System.out.println(num1[i]);
	}
	
	String ta="A";
	ta=ta.concat("B");
	String tb="C";
	 ta=ta+tb;
	ta.replace('C', 'D');
	ta=ta+tb;
	System.out.println(ta);
	System.out.println((("AB"+"C").replace('C', 'D'))+"C");
	
	}
 static void add10(int num) {
	
	
	    num=num+100;
	
	
	}
 
}