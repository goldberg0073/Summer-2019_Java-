package day10_IfStatement;

public class Excercice_class {
public static void main(String[] args) {


int Age=7;
boolean GoodPerson=false;

if (Age>=18) {
	if (GoodPerson) { 
		System.out.println("Alcohool is not good for your health");
	}
	else { 
		System.out.println("you can buy cigarettes");
	
		if (Age>=21) {System.out.println("you can buy hookah");}
		if (Age>=25 ) {System.out.println("you can buy alcohool");}

	}
   	
}
else {System.out.println("you can buy milk");}

}
}
	
	
	




