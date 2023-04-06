package core;

public class GlobalLocalVeriables {
	static int a =10;  // Global Variable
	static int m = 30;

	// Scope of the Global Variable is within the class
	// Scope of the Local variable is within the method
	public static void main(String[] args) {
		int b = 20;  // Local variable
		System.out.println(m+b);
		GlobalLocalVeriables obj = new GlobalLocalVeriables();
		obj.add();
		divide();
	}


	public void add() {
		System.out.println("Add Non-static method");
		System.out.println(a+m);
	}


	public static void divide() {
		int x = 50;  // Local Variable  
		int y = 10;
		System.out.println(x/y);
		System.out.println("Divide Static method");
	}

}
