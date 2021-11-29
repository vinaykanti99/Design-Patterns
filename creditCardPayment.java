package Bridge;

public class creditCardPayment extends Payments {
	 public creditCardPayment(BankPayment b) {
		// TODO Auto-generated constructor stub
		 super(b);
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		bankpayment.payment("Credit card");
	}

}
