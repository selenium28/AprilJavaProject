package encap;

public class ExceptionHanding {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 10;
		
//		System.out.println(b/a);
		
		try {
			System.out.println(b/a);
		} catch (Exception e) {
			System.out.println("Exception Handled");
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("After Exception");

	}

}
