package MenteringClass;

public class Hourly_Employees extends Employees {

	int WorkingHours;
	int RateHour;
	double Salary;
	
	
	public double getSalary() {
		System.out.println("The salary for this month");
		return Salary=WorkingHours*RateHour;
	}
	
	public Hourly_Employees(String name,double age,String address,double Salary,String job,int H,int R) {
		super(name,age,address,Salary,job);
		WorkingHours=H;
		RateHour=R;
		
		
	}
	
}
