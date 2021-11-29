package Bridge;

public class Axis implements BankPayment {

	@Override
	public void payment(String cardType) {
		// TODO Auto-generated method stub
		System.out.println("Using Axis bank " +cardType+ " for payment");
	}

	@Override
	public void upiPayment() {
		// TODO Auto-generated method stub
		
		
	}

}
