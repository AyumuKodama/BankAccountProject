
public class SavingsAccount extends Account {

	private static double rate = 0.05;
	private double interest;
	
	public SavingsAccount(double money, String accountNumber) {
		super(money, accountNumber);
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void moneyInterest() {
		double temp = 0;
		for (int i = 0; i < Account.getMonth(); i++) {
			temp = getMoney();
			interest = getMoney() * rate;
			temp += interest;
			setMoney(temp);
		}
	}
}