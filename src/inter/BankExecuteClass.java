package inter;

public class BankExecuteClass {

	public static void main(String[] args) {
		
		HDFCBank objHDFCBank = new HDFCBank();
		objHDFCBank.accountNo();
		objHDFCBank.atmCard();
		objHDFCBank.ccCard();
		objHDFCBank.rateOfIntrest();
		
//		BankInterface objBankInterface = new BankInterface();  we can't create object of Interface
		
		BankInterface objBankInterface = new HDFCBank();
		objBankInterface.accountNo();
		objBankInterface.atmCard();
		objBankInterface.ccCard();
		objBankInterface.rateOfIntrest();
		

	}

}
