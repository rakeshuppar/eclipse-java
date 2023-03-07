package com.xworkz.boot.MachineRunner;

import com.xworkz.things.Machine.ATM;
import com.xworkz.things.Machine.SBIATM;

public class ATMRunner {

	public static void main(String[] args) {

		ATM atm = new SBIATM();
		atm.balance();
		atm.pinNumber();
		atm.withdrawal();
		atm.miniStatement();
		atm.deposit();
		atm.transfer();
		atm.language();
		atm.savingAccount();
		atm.internetBanking();
		atm.paymentBills();

		System.out.println("----------------------------------------");

		SBIATM atm1 = new SBIATM();
		atm1.balance();
		atm1.pinNumber();
		atm1.withdrawal();
		atm1.miniStatement();
		atm1.deposit();
		atm1.transfer();
		atm1.language();
		atm1.savingAccount();
		atm1.internetBanking();
		atm1.paymentBills();

	}

}
