package MenteringClass;

public class MyFirstOOP_project {
public static void main(String[] args) {
		
		//Salaried_Employees emp1=new Salaried_Employees("muhtar",78,"5937 kingslanding ",1100,"Java instructor",10,850);
	   
		
	    Salaried_Employees emp1=new Salaried_Employees();
		emp1.Name="muhtar";
		emp1.Age=78;
		emp1.setAddress("Kingslanding");
		emp1.job="Java instructor";
		emp1.Salary=1100;
		emp1.bonus=20;
		emp1.deduction=860;
		
		
		emp1.getInfo();
		System.out.println(emp1.getSalary());
	   
	    
	
	
		System.out.println("====================================");
		
		
		//new Hourly_Employees("Asya", 19, "Winterfall",150000,"Multitasks Instructor",45, 34);
		Hourly_Employees emp2=new Hourly_Employees("Asya", 19, "Winterfall", 150000, "multitasks instructor", 45, 34);
		
		emp2.Name="Asiya";
		emp2.Age=19;
		emp2.setAddress("Winrefall");
		emp2.job="Multitasks instructor";
		emp2.RateHour=300;
		emp2.WorkingHours=80;
		emp2.getInfo();
		System.out.println(emp2.getSalary());
		
	}


}
