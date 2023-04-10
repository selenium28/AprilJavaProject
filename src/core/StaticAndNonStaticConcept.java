package core;

public class StaticAndNonStaticConcept {  // class body

	// Non-static method
	public void sum() {
		int m = 100;
		int n = 200;
		System.out.println(m+n);
	}

	// static method --> Direct calling
	public static void sub() {
		int k = 50;
		int j = 10;
		System.out.println(k-j);
	}

	public static void main(String[] args) {  // method body

		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		// StaticAndNonStaticConcept  --> class
		// obj --> reference variable
		// new --> Java Keyword
		// StaticAndNonStaticConcept()  --> Constructor
		// new StaticAndNonStaticConcept();  --> Object
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sum();
		sub();   // --> Direct calling
//		StaticAndNonStaticConcept.sub();  --> By using class name 

	}
}
