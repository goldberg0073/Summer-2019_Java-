package day53_InterfcaeContinue;

public class Jeep_wrangler implements Cars,GazVehicles {

	@Override
	public void PumpGaz() {
		System.out.println("pumping Gas");
		
	}

	@Override
	public void Start() {
		System.out.println("Call Mechanic");
		System.out.println("Oil changed");
		System.out.println("Jump start");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Jeep is self parking");
		
	}


	

	
	
	
}
