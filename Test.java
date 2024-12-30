package com.spec.venu;
class RBIBank{
	int balance;
	void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From RBI successfully deposited....amount..."+amt);
	}
	void withdraw(int amt) {
		this.balance=this.balance-amt;
		System.out.println("From RBI sucessfully withdrawn....amount.."+amt);
	}
	void checkBalance() {
		System.out.println("From RBI avl balance...."+this.balance);
	}
}
class SBIBank extends RBIBank{
	public SBIBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt<50000) {
			this.balance=this.balance +amt;
			System.out.println("From SBI successfully deposited....amount..."+amt);
		}else {
			System.out.println("From SBI Day Limit exceeds");
		}
	}
	void withdrawn(int amt) {
		if (amt<50000) {
			this.balance=this.balance-amt;
			System.out.println("From SBI successfully withdrawn....amount..."+amt);
			
		}else {
			System.out.println("From SBI Day Limit exceeds");
		}
	}
}
class ICICIBank extends RBIBank{
	public ICICIBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt<50000) {
			this.balance=this.balance +amt;
			System.out.println("From ICICI successfully deposited....amount..."+amt);
		}else {
			System.out.println("From ICICI Day Limit exceeds");
		}
	}
	void withdrawn(int amt) {
		if (amt<50000) {
			this.balance=this.balance-amt;
			System.out.println("From ICICI successfully withdrawn....amount..."+amt);
			
		}else {
			System.out.println("From ICICI Day Limit exceeds");
		}
		}
}
class HDFCBank extends RBIBank{
	public HDFCBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if (amt<50000) {
			this.balance=this.balance +amt;
			System.out.println("From HDFC successfully deposited....amount..."+amt);
		}else {
			System.out.println("From HDFC Day Limit exceeds");
		}
	}
	void withdrawn(int amt) {
		if (amt<50000) {
			this.balance=this.balance-amt;
			System.out.println("From HDFC successfully withdrawn....amount..."+amt);
			
		}else {
			System.out.println("From HDFC Day Limit exceeds");
		}
	}
	}
public class Test{
	public static void main(String[]args) {
		
		SBIBank sbi = new SBIBank(10000);
		ICICIBank icici = new ICICIBank(75000);
		HDFCBank hdfc = new HDFCBank(85000);
		
		System.out.println("For SBI Bank Starts....");
		sbi.checkBalance();
		sbi.deposit(6000);
		sbi.checkBalance();
		sbi.deposit(67000);
		sbi.checkBalance();
		System.out.println("For SBI Bank ENDS.....");
		
		System.out.println("For ICICI Bank Starts....");
		sbi.checkBalance();
		sbi.deposit(6000);
		sbi.checkBalance();
		sbi.deposit(67000);
		sbi.checkBalance();
		System.out.println("For ICICIBank ENDS.....");
		
		System.out.println("For HDFC Bank Starts....");
		sbi.checkBalance();
		sbi.deposit(6000);
		sbi.checkBalance();
		sbi.deposit(67000);
		sbi.checkBalance();
		System.out.println("For HDFC Bank ENDS.....");
		
	}
}
