package assignment;


public class Account implements IMonthlyRate {
	private double loanValue;
	private double rate;
	private int daysActive;
	private AccountType accountType;
	
	public double getLoan() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public int getDaysActive() {
		return daysActive;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public double getRate() {
		System.out.println("The rate is " + rate);
		return this.rate;
	}
	
	@Override
	public double getMonthlyRate() {
		return loanValue * rate;
	}
	
	public void setValue(double value) throws Exception {
		if(value < 0) {
			throw new Exception();
		}
		loanValue = value;
	}
	
	
	
	public void setDaysActive(int daysActive) throws Exception {
		if(daysActive < 0) {
			throw new Exception();
		}
		this.daysActive = daysActive;
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: " + accountType + ";";
	}
	
	public void print() {
		System.out.println("This is an account");
	}

	public Account(double value, double rate, AccountType accountType) throws Exception {
		if(value < 0) {
			throw new Exception();
		}
		loanValue = value;
		this.rate = rate;
		this.accountType = accountType;
	}
	
	
}
