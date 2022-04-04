package assignment;


public class Account {
	public double	loanValue,rate;	
	public int	daysActive;
	public AccountType accountType;
	
	public double loan() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public double getRate() {
		System.out.println("The rate is "+rate);
		return this.rate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue*rate;
	}
	
	public void setValue(double value) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
	}
	
	public String toString() {
		return "Loan: "+this.loanValue+"; rate: "+this.rate+"; days active:"+daysActive+"; Type: "+accountType+";";
	}
	
	public void print() {
		System.out.println("This is an account");
	}

	public static double calculate(Account[] accounts)
	{
		double totalFee=0.0;
		Account	account;
		int temp = 365;
		for	(int i=0;i<accounts.length;i++)	{
			account=accounts[i];
			if(account.accountType==AccountType.PREMIUM||account.accountType==AccountType.SUPER_PREMIUM)
//				1.25%	broker's	fee
				totalFee+=.0125	* ( account.loanValue*Math.pow(account.rate,(account.daysActive/365)) - account.loanValue);	//	interest-principal
		}
		
		return	totalFee;
	}

	public Account(double value, double rate, AccountType accountType) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = accountType;
	}
	
	
}
