package OCA_Exam;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Vehicle{
	String type="4w";
	int maxSpeed=100;
	Vehicle(String type,int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
	Vehicle(){
		
	}
}
public class OCA_ExamPart4 extends Vehicle{
	
	private int  dostuff1() {
		
		int x=100;
		
		return x++;
		
	}	
	
	String trans;

       OCA_ExamPart4(String trans,int Speed){
    	 super();
    	   this.trans=trans;
    	   
         }
	
	OCA_ExamPart4(String type,int maxSpeed,String trans){
		super(type,maxSpeed);
		//this(trans);   Constructor call must be the first statement in a constructor 
	}	
	public static void main (String []args) throws IOException {
		
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2014, 6,20);
		LocalDateTime date5=LocalDateTime.of(2014, 6,20,1,1);
		
		LocalDate date3=LocalDate.parse("2014-06-30", DateTimeFormatter.ISO_DATE);
		System.out.println("Date1 = "+date1);
		System.out.println("Date2 = "+date2.plusDays(18));
		System.out.println("Date3 = "+date5);
		
		String str ="dimadimaraja";
		 String str2=str.substring(1, 7);
		 System.out.println(str2);
		 
		StringBuilder sb = new StringBuilder("dima");
		sb.delete(0, sb.length());
		System.out.println(sb);
		
	
		
		ArrayList<Integer>points=new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(2);
		points.remove(null);
		
		System.out.println(new StringBuilder("java s8"));
		System.out.println(points);
			
	}
	
	
}
