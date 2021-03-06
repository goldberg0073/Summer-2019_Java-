package day55_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

/*
 WarmUp:			
	1. create an abstract class called ScrumTeam
			Data: Name
				  JobTitile
				  Salary

			Actions: DailyStandUp();
					 Demo();

	2. Create the following sub classes of ScrumTeam:
				1. Testers:
						Actions: FindBug

				2. Developers:
						Actions: FixBug

	3. Create a class called BOF
			create Array of Testers named sdets, at leats store two objects
			create array of Developers named dev, at least store three objects

			create ArrayList of ScrumTeam:
					store all the developer' and testers' objects


 */


abstract class Scrumteam{
	public String Name,JobTitle;
	public double Salary;
	public abstract void DailyStanUp();
	public abstract void Demo();
	public void getEmployeeInfo() {
		System.out.println("=================================");
		System.out.println("Employee name is "+Name);
		System.out.println(" Job Title "+ JobTitle);
		System.out.println("Salary "+Salary);
		System.out.println("==================================");
	}
}
/*
 extends used when we have 2 classes or 2 interfaces
 Implements key word uses when we have a class and an interface ===> a class implement the interface
 ==== >one super class can have multiple sub class
 ==== >class can implement multiple interfaces 
 */
class  Testers extends Scrumteam{
    public Testers(String Name,String JobTitle,double Salary) {
    	this.Name=Name;
    	this.JobTitle=JobTitle;
    	this.Salary=Salary;
    	 	
    }
	@Override
	public void DailyStanUp() {
		
	System.out.println("Tester "+Name+" is Talking");
	
	}
	@Override
	public void Demo() {
		
	System.out.println("Tester"+Name+" is doing demo");
	}
}




class Developers extends Scrumteam{
	// Name , JobTitle,Salary
	
	 public Developers(String Name,String JobTitle,double Salary) {
		this.Name=Name;
		this.JobTitle=JobTitle;
		this.Salary=Salary;
	} 
	
	@Override
	public void DailyStanUp() {
	System.out.println("Developer is "+Name+" is talking");
		
	}

	@Override
	public void Demo() {
		System.out.println("Developer is "+Name+" is doing demo");
		
	}
	
}


public class BOA {
	public static void main(String[] args) {
		
// reference-type    reference name   existing constructor
		Scrumteam      Madina = new    Testers("Madina", "SDET", 120000);
		Scrumteam       hisham =new    Testers("hisham", "automation", 100000);
		Scrumteam       erhan  =new Testers("Erhan", "manual tester", 50000);
				Madina.DailyStanUp();
				
	Scrumteam[]testers= {Madina,hisham,erhan};
	  for(Scrumteam each:testers) {
		each.getEmployeeInfo();  
	  }
		
	  Scrumteam Nadire = new Developers("Nadire", "Senior Dev", 150000);
	  Scrumteam hisham1 = new Developers("hicham", "Senior Dev", 120000);
	  Scrumteam delare = new Developers("delare", "Junior Dev", 800000);
	  
	  
	  Scrumteam[] developers= {Nadire,hisham1,delare}; 
	  
	  for(Scrumteam each:developers) {
		  each.getEmployeeInfo();
	  }
	  
	  ArrayList<Scrumteam>scrum=new ArrayList<>();
	  scrum.addAll(Arrays.asList(testers));
	  scrum.addAll(Arrays.asList(developers));
	  
	  for(Scrumteam each:scrum) {
		each.getEmployeeInfo();
	  }
	  
	  
	}
	
}

