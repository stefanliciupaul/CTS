package assignment;

public class AccountsManagement {
	
	public static double calculate(Account[] accounts)
	{
		double totalFee = 0.0;
		Account	account;
		int daysInYear = 365;
		double brokerFee=0.125;
		
		for	(int i = 0; i < accounts.length; i++)	{
			account = accounts[i];
			if(account.getAccountType() == AccountType.PREMIUM || account.getAccountType() == AccountType.SUPER_PREMIUM) {
				totalFee += brokerFee * ( account.getLoan() * Math.pow(account.getRate(), (account.getDaysActive() / daysInYear)) - account.getLoan());
			}
		}
		
		return	totalFee;
	}
}
