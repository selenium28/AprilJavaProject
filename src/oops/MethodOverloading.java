package oops;

public class MethodOverloading {

	// Duplicate methods are not allowed in java
	// Method inside method is not allowed
	// Method Overloading --> When method name is same with different input parameters within the 
	// same class is known as MethodOverloading. 
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.display();
		int c = obj.display(50, 5);
		System.out.println(c);

	}
	
	public void display() {  // 0 parameter
		System.out.println("Zero Parameters");
	}
	
	public void display(int a) {  // 1 parameters
		System.out.println("One Parameters");
	}
	
	public int display(int m, int n) {  // 2 parameters
		System.out.println("Two Parameters");
		int c = m * n;
		return c;
	}
	
	public void display(double d) {  // 1 parameters
		System.out.println("One Parameters");
	}

}
