package basicCore;

public class ArrayConcept {

	public static void main(String[] args) {
		// Advantages of Array 
		// Code Optimization
		// Random Access --> we can get any data located at an index position
		// Array --> To store similar data types in array variable
		
		// Disadvantage: Size is fixed
		
		int b = 10; // b Normal variable
		int a[] = new int[5];  // a[] --> array variable
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
//		a[5] = 60;   // ArrayIndexOutOfBoundsException
		
		System.out.println(a[2]);
		System.out.println(a.length);
		
		double d[] = new double[5];

	}

}
