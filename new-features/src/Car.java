
public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String...features) {	// var-args
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features) 
			System.out.println("- " + f);
	}
	
	public static void main(String[] args) {
		Car alto = new Car("Suzuki Alto", "Power Window","Power Steering", "AC");
		
		Car venue = new Car("Hyundai Venue", "Power Window","Power Steering", "AC", "ABS", "Keyless");
		
		alto.specs();
		venue.specs();
	}
}
