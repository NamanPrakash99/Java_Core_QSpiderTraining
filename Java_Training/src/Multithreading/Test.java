package Multithreading;

public class Test  extends Thread{
// override the run
	
	public void run() {
		// print number from 1 to 5
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
	}
}
