package day50_Abstraction;

public class Zoo {
	
	public static void main(String[] args) {
		
		
		Dog pongo =new Dog('M',(byte)5,"White","rex");
		pongo.getInfo();
		pongo.Sleep(15);
		pongo.Speak("Ukrainian");
		pongo.Eat("bones");
		pongo.Drink("Vodka");
	System.out.println("======================================");
	
	   Dog max =new Dog('M',(byte)12,"golden","max");
	   max.getInfo();
	   max.Sleep(9);
	   max.Speak("Russian");
       max.Eat("meat");
       max.Drink("milk");
       
       Dog[]dogs= {pongo,max};
	   
	
		
     }

}
