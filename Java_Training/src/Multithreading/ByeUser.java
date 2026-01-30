package Multithreading;

public class ByeUser extends Thread{
	BankAccount acc;
	// constructor to initialize
	ByeUser(BankAccount acc){
		this.acc=acc;
	}
	// override the run()
	public void run() {
		// call the acc variable and call the withdraw method
		acc.withdraw(1700);
		System.out.println("from ByeUser userrr....!!");
	}
}
