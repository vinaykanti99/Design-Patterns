package Bridge;

public class DebitCardPayments extends Payments {
	 public DebitCardPayments(BankPayment b) {
		// TODO Auto-generated constructor stub
		 super(b);
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		bankpayment.payment("Debit card");
	}

}
