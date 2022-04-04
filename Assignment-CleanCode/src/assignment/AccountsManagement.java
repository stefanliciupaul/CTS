package assignment;

public class AccountsManagement {
	
	public static double calculate(Account[] accounts)
	{
		double totalFee = 0.0;
		int daysInYear = 365;
		double brokerFee=0.125;
		
		for	(int i = 0; i < accounts.length; i++)	{
			if(accounts[i].getAccountType() == AccountType.PREMIUM || accounts[i].getAccountType() == AccountType.SUPER_PREMIUM) {
				totalFee += brokerFee * ( accounts[i].getLoan() * Math.pow(accounts[i].getRate(), ((double)accounts[i].getDaysActive() / daysInYear))
							- accounts[i].getLoan());
			}
		}
		
		return totalFee;
	}
}
