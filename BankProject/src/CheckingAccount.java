
public class CheckingAccount extends Account {

	
	public CheckingAccount (double money, String accountNumber) {
		super(money, accountNumber);
	}
	
	public void withdrawPay() {
		int counter = Account.getCounter();
		double temp = getMoney();
		if (counter > 3) {
			temp = temp - (counter - 3);
		}
		setMoney(temp);
	}
}