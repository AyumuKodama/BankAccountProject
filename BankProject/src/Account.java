
public abstract class Account {
	
	private double money;
	private String accountNumber;
	private static int month = 0;
	private static int counter = 0;
	
	public Account(double money, String accountNumber) {
		this.money = money;
		this.accountNumber = accountNumber;
	}

	public double getMoney() {
		return money;
	}
	
	public void setMoney(double money) {
		this.money = money;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public static int getCounter() {
		return counter;
	}
			
	public double addDeposit(double deposit) {
		double temp = money;
		temp += deposit;
		money = temp;
		return money;
	}
	
	public double subtWithdrawal(double withdrawal) {
		double temp = money;
		temp -= withdrawal;
		money = temp;
		counter++;
		return money;
		
	}
	
	public static int getMonth() {
		return month;
	}
	
	public static void monthEnd() {	
		month++;
		counter = 0;
	}
}