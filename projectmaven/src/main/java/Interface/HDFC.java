package Interface;

public class HDFC implements  RBI {

	public static void main(String[] args) {
		HDFC obj =new HDFC();
		obj.recurringDeposit(1000,3);
	}
	public	void recurringDeposit(double amount,int year)
	{
		int n = year * 12; // number of months
	    double P = amount;
	    double r = interestrate;

	    double maturityAmount = P * n + (P * n * (n + 1) / 2.0) * (r / (12 * 100));

	    System.out.println("After"+ year+ "   " + amount);
	    System.out.printf("Maturity Amount = ₹%.2f\n", maturityAmount);
	}

}
