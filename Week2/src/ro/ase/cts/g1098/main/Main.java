package ro.ase.cts.g1098.main;

import java.util.ArrayList;

import ro.ase.cts.g1098.exceptions.IllegalTransferException;
import ro.ase.cts.g1098.exceptions.InsufficientFundsException;
import ro.ase.cts.g1098.models.AccountType;
import ro.ase.cts.g1098.models.BankAccount;
import ro.ase.cts.g1098.models.Banker;

public class Main {

	public static void main(String[] args) {
		Banker bank = new Banker("SDG");
		BankAccount debitAccount = bank.openAccount(AccountType.SAVINGS);
		BankAccount creditAccount = bank.openAccount(AccountType.CURRENT);
		
		java.util.List<BankAccount> accounts = new ArrayList<>();
		accounts.add(creditAccount);
		accounts.add(debitAccount);
		accounts.add(bank.openAccount(AccountType.SAVINGS));
		
		
		
		try {
			debitAccount.deposit(1000);
			debitAccount.withdraw(100);
			debitAccount.transfer(creditAccount, 100);
			System.out.println("Final balance: "+debitAccount.getBalance());
		} catch(IllegalTransferException e) {
			System.out.println("You can't do that");
		} catch (InsufficientFundsException e) {
			System.out.println("You need more money");
		}
	}

}
