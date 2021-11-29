package Bridge;

public class Gpay extends Payments {

	public Gpay(BankPayment b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		bankpayment.upiPayment();
		
	}

}
