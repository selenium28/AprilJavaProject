package core;

public class StaticAndNonStatic {

	// main method --> starting point
	public static void main(String[] args) {

		int a =10;
		int b = 20;
		System.out.println(a+b);
		System.out.println("Main method");
		StaticAndNonStatic.divide();
		display();

		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.add();
		obj.sub();

	}

	//	Non-static --> we can't access direct 
	public void add() {
		System.out.println("Add Non-static method");
	}

	// static method --> direct calling
	public static void divide() {
		System.out.println("Divide Static method");
	}

	// Non-static 
	public void sub() {
		System.out.println("Sub Non-static method");
	}

	// static method --> direct calling
	public static void display() {
		System.out.println("Display Static method");
	}

}
