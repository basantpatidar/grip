package com.grip.one;

public class Account {
	
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phone;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public double fundDeposit(double ammount) {
		this.balance += ammount;
		System.out.println(balance);
		return balance;
	}
	public double fundWithdraw(double ammount) {
		this.balance -= ammount;
		System.out.println(balance);
		return balance;
	}
}
