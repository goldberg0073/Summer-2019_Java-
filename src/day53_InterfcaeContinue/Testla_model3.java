package day53_InterfcaeContinue;

public class Testla_model3 implements Cars , ElectricVehicles{
	
	public  void Start() {
		System.out.println("Tesla Voice Control \"Tesla Start \" ");
	}
	
	public void Charge() {
		System.out.println("Tesla is Charging");
	}
     public void SelfDrive() {
    System.out.println("Tesla Self driving");	 
     }

	
	public void Flying() {
		System.out.println("Tesla is flying");
	}
}
