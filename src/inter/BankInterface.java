package inter;

public interface BankInterface {
	
	// 100% abs
	// No method body
	// always define only abs methods
    // we can't create object of Interface
	
	public void rateOfIntrest();
	public void accountNo();
	public void atmCard();
	
	default void ccCard() {
		System.out.println("Default --- Bank -- ccCard");
	}
	

}
