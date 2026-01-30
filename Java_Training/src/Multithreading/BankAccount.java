package Multithreading;

public class BankAccount {
	int balance=1900;
	synchronized void withdraw(int amount) {
		if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
	}
}
