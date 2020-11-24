package day21_quizreview;

public class QuizNumber6 {

	
	public static void main(String[] args) {
		

String text="abcdefghijklmn";
String reverse="";

int numberOfCharacter=text.length()-1;
System.out.println(numberOfCharacter);

        for(int i=text.length()-1    ;      i>=0     ;     i--) {
        	
       reverse+=text.charAt(i);
        
        }
		System.out.println(reverse);
		
		System.out.println("**********************************");
		
		
		
		
		
		String sentence ="I like book, I read book, book book book";
		//					"I like , I read book"
		//					"I like , I read"
		int  count = 0;// 1 + 1
		
		
		while( sentence.contains("book") ) {
			count++;
			sentence = sentence.replaceFirst("book", "");  
				// can eventually make the condition false
		}
		
		System.out.println( count );
		System.out.println( sentence );
	
	
	System.out.println();

String sentence1="book book bokk book";
    int count1=0;
    while (sentence1.contains("book"));
                        {     count1++;
    	System.out.print(count1);
        String str= sentence1.replace("book", "raja");
        System.out.println(str);
        
                        }
   
    
	
	
	}
	
	
	
}
