package abs;

public class RunCarClass {

	public static void main(String[] args) {
		
//		Car objCar = new Car();  -- we can't create object of Abstract class
		NexonCar objNexonCar = new NexonCar();
		objNexonCar.abcTyre();
		objNexonCar.dieselCar();
		objNexonCar.petrolCar();
		objNexonCar.mrfTyre();
		

	}

}
