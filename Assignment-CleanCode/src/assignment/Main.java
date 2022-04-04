package assignment;


public class Main {

	public static void main(String[] args) {
		try {
			Account account = new Account(1000,0.05,AccountType.STANDARD);
			System.out.println(account.getLoan());
			System.out.println(account);
			System.out.println();
			System.out.println(account.getMonthlyRate());

			
			Account accountprem = new Account(2000,5,AccountType.PREMIUM);
			accountprem.setDaysActive(200);
			System.out.println();
			System.out.println(accountprem);
			
			
			Account[] accounts = new Account[1];
			accounts[0]=accountprem;
			System.out.println("The broker fee is :"+AccountsManagement.calculate(accounts));
			
			Account accountsuperprem = new Account(5000,0.05,AccountType.SUPER_PREMIUM);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
