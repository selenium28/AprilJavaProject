package basic;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=70;
		a[3]=100;
		a[4]=200;
		
		System.out.println(a[2]);
		System.out.println(a[3]);
//		System.out.println(a[4]); ArrayIndexOutOfBoundsException:
		System.out.println(a.length);
		
		Object obj[] = new Object[5];
		obj[0] = "ABC";
		obj[1] = 10;
		obj[2] = 33.33;
		
		System.out.println(obj.length);
		System.out.println(obj[2]);
		
		

	}

}
