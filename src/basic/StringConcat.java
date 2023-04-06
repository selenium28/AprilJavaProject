package basic;

public class StringConcat {

	public static void main(String[] args) {
		
		// + : operator
		
		int x = 100;
		int y = 200;
		
		String str = "Java";
		String ptr = "Selenium";
		
		System.out.println(x+y);  // 300
		System.out.println(str+ptr);  // JavaSelenium
		System.out.println(x+y+str); // 300Java
		System.out.println(y+str+ptr); // 200JavaSelenium
		System.out.println(x+ptr+x+y+str);  // 100Selenium100200Java
		System.out.println(y+str+(x+y)+str+x+y);  //200Java300Java100200
		

	}

}
