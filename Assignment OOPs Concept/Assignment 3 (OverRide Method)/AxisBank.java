package org.system;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("This Deposit() Method is overrided from Bakninfo Class ");
	}
	public static void main(String[] args) {
		AxisBank overRide = new AxisBank();
		overRide.deposit();
	}
}
