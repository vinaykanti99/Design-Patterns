package Bridge;

public abstract class Payments {
	public BankPayment bankpayment;
	
	public Payments(BankPayment b) {
		// TODO Auto-generated constructor stub
		this.bankpayment=b;
	}

	public abstract void makePayment();
	

}
