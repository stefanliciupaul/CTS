package ro.ase.cts.g1098.models;

import ro.ase.cts.g1098.exceptions.IllegalTransferException;
import ro.ase.cts.g1098.exceptions.InsufficientFundsException;

public abstract class Account {
	
	public abstract double getBalance();
	public abstract void deposit(double amount) throws IllegalTransferException;
	public abstract void withdraw(double amount) throws IllegalTransferException, InsufficientFundsException;
	public abstract void transfer(Account destination, double amount) throws IllegalTransferException, InsufficientFundsException;
}
