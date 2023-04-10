package core;

public class GlobalAndLocalVariables {
	
	int a = 50;  // Global variable - NonStatic
	static String str = "Java";  // Global variable - Static
	
	// Local Variables  -- Scope of the Local Variables within the Method
	// Global Variables  -- Scope of the Global Variables within the Class
	// static is a keyword in Java & it is bound with class area.

	public static void main(String[] args) {
		int x = 50;
		int y = 10;
		int n = 200;  // local variable
		
		GlobalAndLocalVariables obj = new GlobalAndLocalVariables();
		
		System.out.println(x/y);
		System.out.println(n+obj.a);
		obj.display();

	}
	
	public void display() {
		int m = 100;
		System.out.println(m+a);
		System.out.println(GlobalAndLocalVariables.str);
	
	}

}
