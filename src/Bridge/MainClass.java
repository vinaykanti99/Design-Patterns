package Bridge;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments order=new DebitCardPayments(new SBI());
		order.makePayment();
		
		Payments gpay=new Gpay(new Upi());
		gpay.makePayment();
		
		Payments phonepay=new PhonePay(new Upi());
		phonepay.makePayment();

	}

}
