package Bridge;

public class SBI implements BankPayment {

	@Override
	public void payment(String cardType) {
		// TODO Auto-generated method stub
		System.out.println("Using SBI bank " +cardType+ " for payment");
		
	}

	@Override
	public void upiPayment() {
		// TODO Auto-generated method stub
		
	}

	

}
