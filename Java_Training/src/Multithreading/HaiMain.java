package Multithreading;

public class HaiMain {
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		HaiUser h1=new HaiUser(b1);
		ByeUser h2=new ByeUser(b1);
		h1.start();
		h2.start();

	}
}
