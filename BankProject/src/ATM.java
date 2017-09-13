import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		SavingsAccount account1 = new SavingsAccount(901.63, "12345");
		CheckingAccount account2 = new CheckingAccount(1023.86, "54321");
		
		boolean quit = false;
		
		while (!quit) {	
			
			System.out.println();
			System.out.println("ATM");
			System.out.println("Please select one of the following options:");
			System.out.println("D)eposit   W)ithdrawal   M)onth end   Q)uit");
			String input = scnr.next();
			
			if (("D").equalsIgnoreCase(input)) {
				
				System.out.println("Please input your account number.");
				String accountNumber1 = scnr.next();
				
				if ((accountNumber1).equals(account1.getAccountNumber())) {
					System.out.println("How much would you like to deposit?");
					double deposit = scnr.nextDouble();
					account1.addDeposit(deposit);
					System.out.println("You have deposited $" + deposit + ".");
					System.out.println("You now have $" + account1.getMoney());	
				}
			
			} else if (("W").equalsIgnoreCase(input)) {
				
				System.out.println("Please input your account number.");
				String accountNumber2 = scnr.next();
				
				if ((accountNumber2).equals(account2.getAccountNumber())) {
					System.out.println("How much would you like to withdraw?");
					double withdrawal = scnr.nextDouble();
					account2.subtWithdrawal(withdrawal);
					System.out.println("You have withdrawn $" + withdrawal + ".");
					System.out.println("You now have $" + account2.getMoney());
				}
				
			} else if (("M").equalsIgnoreCase(input)) {
				
				Account.monthEnd();
				System.out.println("Month #" + Account.getMonth() + " has ended.");
				account1.moneyInterest();
				account2.withdrawPay();
				
				System.out.println(account1.getMoney());
				System.out.println(account2.getMoney());
				
			} else if (("Q").equalsIgnoreCase(input)){
				
				System.out.println("Thank you. Please come again.");
				quit = true;
				
			} else {
				
				System.out.println("Error: That is not a valid option.");
				
			}	
			
		}
		
		scnr.close();
		
	}			
	
}		



