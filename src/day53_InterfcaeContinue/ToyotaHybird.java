package day53_InterfcaeContinue;

public class ToyotaHybird implements Cars,ElectricVehicles,GazVehicles{

	@Override
	public void PumpGaz() {
		System.out.println(" Toyota pumping gaz");
		
	}

	@Override
	public void Charge() {
	System.out.println("Toyota is charging");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Toyota is selfdriving");
		
	}

	@Override
	public void Start() {
		
		System.out.println("The toyota is starting");
	}

	@Override
	public void SelfParking() {
		System.out.println("Self parking");
		
	}

	

}
