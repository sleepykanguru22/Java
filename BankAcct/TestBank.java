public class TestBank {

	public static void main(String[] args) {
		BankAccount Account1 = new BankAccount();
		
		
		Account1.getCheckingBalance();
		Account1.getSavingBalance();
		Account1.deposit(1000, "saving");
		Account1.withdraw(500, "saving");
		Account1.memberTotalCoins(acct1.getAccountNum());		

	}

}