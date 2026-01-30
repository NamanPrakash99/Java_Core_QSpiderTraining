package Multithreading;

public class HaiUser extends Thread {
	BankAccount acc;
	// constructor to initialize
	HaiUser(BankAccount acc){
		this.acc=acc;
	}
	// override the run()
	public void run() {
		// call the acc variable and call the withdraw method
		acc.withdraw(500);
		System.out.println("from haiUser userrr....!!");
	}
}
