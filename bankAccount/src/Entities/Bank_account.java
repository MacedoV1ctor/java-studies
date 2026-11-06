package Entities;

public class Bank_account {
	private int numberAccount;
	private String titular;
	private double deposit;
	
	public Bank_account(int numberAccount, String titular, double deposit) {
		this.numberAccount = numberAccount;
		this.titular = titular;
		this.deposit = deposit;
	}
	
	public Bank_account(int numberAccount, String titular) {
		this.numberAccount = numberAccount;
		this.titular = titular;
	}
	
	public int getNumberAccount() {
		return this.numberAccount;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void makeDeposit(double value) {
		this.deposit += value;
	}
	
	public void withdrawal(double value) {
		this.deposit -= value + 5.00;
	}
	
	public String toString() {
		return "Account number: " + this.numberAccount + "\n" +
			   "titular: " + this.titular + "\n" +
			   "Account deposit: " + this.deposit;
	}
	
}
