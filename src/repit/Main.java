package repit;


	
	
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inhabitants = scan.nextInt();
    
   int count=0;
   do{if(inhabitants>0){
      System.out.println("Day " +count+ " ["+inhabitants+ "]");
     inhabitants=inhabitants/2;
     count++;}
    } while(inhabitants>=1);
    System.out.println("---- EXTINCT ----");
    
  }
}
