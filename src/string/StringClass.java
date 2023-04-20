package string;

public class StringClass {

	public static void main(String[] args) {
		
		String str = new String("Java");
		String str2 = new String("Selenium");
		
		String str3 = "Java";
		String str4 = new String("Selenium");
		
		String str5 = "Dev";
		String str6 = "Dev";
		String str7 = "Selenium";
		
		// == --> address comparison
		// equals --> content comparison
		
		System.out.println(str==str3);  // false 
		System.out.println(str.equals(str3));  // 
		
		System.out.println(str4.equals(str7));  // true
		System.out.println(str4==str7);  // false

	}

}
