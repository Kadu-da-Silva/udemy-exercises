package entities;

public class Account {
	private int number;
	private double balance;
	public String holder;
	
	//constructo
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	//pega o id da conta
	public int getNumber() {
		return number;
	}
	
	//pega o saldo da conta
	public double getBalance() {
		return balance;
	}
	//pega nome
	public String getHolder() {
		return holder;
	}
	//altera nome
	public void setHolder(String holder) {
		this.holder = holder;
	}
	//métodos
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: " + number +
				", Holder: " + holder +
				", Balance: $" 
				+ String.format("%.2f",balance);
	}

}
