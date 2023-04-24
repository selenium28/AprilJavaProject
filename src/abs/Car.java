package abs;

public abstract class Car {
	
	// Partial Abstraction (0 to 100% Abstraction)
	// hiding the implementation details from the user -- is called Abstraction
	
	public void mrfTyre() {
		System.out.println("Car ---> MRF Tyre");
	}
	
	// No method body
		public abstract void petrolCar();  // abstract method

		// No method body
		public abstract void dieselCar();  // abstract method
	
	public void abcTyre() {
		System.out.println("Car ---> ABC Tyre");
	}
	
}
