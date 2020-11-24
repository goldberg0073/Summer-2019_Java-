package classAndObject;

public class ClasspersonObject {
	public static void main(String[] args) {
		
		
		
		
		PersonClass person1 = new PersonClass();
		PersonClass person2 = new PersonClass();
		person1.age=25;
		person1.gender='f';
	    person1.job="doctor";
	    person1.name="karim";
	    System.out.println(person1.job);
	
	    person2.age=37;
	    person2.gender='m';
	    person2.job="businnesman";
	    person2.name="kamal";
	
	
	
	    System.out.println(person2.gender);
	    System.out.println(person2.job);
	    
	  
	    
	    person1.run();
	    
	    
	    
	}

	
	
	
	
}
