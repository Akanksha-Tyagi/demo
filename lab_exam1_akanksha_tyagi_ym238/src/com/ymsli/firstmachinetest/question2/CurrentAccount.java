package com.ymsli.firstmachinetest.question2;

public class CurrentAccount extends Account {

	private float minimumBalanceAmount=500;

	public CurrentAccount() {
	}

	public CurrentAccount(Owner owner, float balance, String number) {
		super( owner, balance, number);
	}

	public float getMinimumBalance() {
		return minimumBalanceAmount;
	}

	@Override
	public void print() {
		System.out.println("Owner: "+getOwner());
		System.out.println("Balance: "+getBalance());
		System.out.println("Number: "+getNumber());
		System.out.println("Minimum Balance: "+getMinimumBalance());
	}

	@Override
	public void withdraw(float amount) {

		float balance = getBalance() - amount;
		if (balance > minimumBalanceAmount) {
			setBalance(balance);
			System.out.println("Withdrawl successful");
		} else {
			System.out.println("Unable to withdraw the amount!!!!");
		}
	}

	@Override
	public void deposit(float amount) {
		setBalance(getBalance()+amount);		
	}
	
	public float getCharges() {
		return (float)(minimumBalanceAmount*0.05);
	}


}
