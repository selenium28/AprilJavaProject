package encap;

public class ExceptionsConditions {

	public static void main(String[] args) {
		int a[] = new int[5];
		int m = 10;
		int n = 0;
		
		try {
			a[7] = 10/5;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Handled");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Handled");
			
		} catch (Exception e) {
			System.out.println("Normal Exception");
			
		} finally {
			System.out.println("1st Finally Block");
		}
		
		System.out.println(" Rest of code....");
		
		try {
			System.out.println(m/n);
		} finally {
			System.out.println("2nd Finally Block");
		}
	
	}

}
