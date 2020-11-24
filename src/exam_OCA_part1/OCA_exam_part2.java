package exam_OCA_part1;



import java.util.ArrayList;

import arraysListReview.ArraylistReview;

public class OCA_exam_part2 {

	char c;
	boolean b;
	float f;
	
	
	public static void main(String[] args) {
	
		OCA_exam_part2 obj= new OCA_exam_part2();
		System.out.println(obj.c);
		System.out.println(obj.b);
		System.out.println(obj.f);
		
		
		
		
float f1=(20>9)? 10:20;
System.out.println(f1);
	
ArrayList<Integer>list=new ArrayList<Integer>();
list.add(10);
System.out.println(list);



String [][] chs =new String[2][];

          chs[0]=new String [2];
          chs[1]=new String[5];
     int i=97;
System.out.println(chs.length);
System.out.println(chs[1].length);

     for(int a=0;a<chs.length;a++) {             //chs.length=2;   a=0   a=1  
    	 for(int b=0;b<chs.length;b++) {          //  b=0  b=1  
    		 chs[a][b]=""+i;
    		 i++;
    		 System.out.println(chs[a][b]+" ");
    	 }
     }
     
     for(int a=0;a<chs.length;a++){
    	 for(int b=0;b<chs[a].length;b++) {
    		 System.out.print(chs[a][b]+" ");
    		 
    	 }
     }
     
    
     
}

}
