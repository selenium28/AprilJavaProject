package cons;

public class ConstructorClass {

	public static void main(String[] args) {
		// Constructor name should be same as class name.
		// Constructor doesn't have return type
		// Can we use access modifiers in Constructor  --> Yes
		// Whenever we create an object Constructor automatically get call.
		
		ConstructorClass obj = new ConstructorClass();
		obj.display();

	}
	
	public void display() {  // method
		System.out.println("Display");
	}
	
	ConstructorClass(){  // Constructor Block
		System.out.println("I'm in Constructor block");
	}

}
