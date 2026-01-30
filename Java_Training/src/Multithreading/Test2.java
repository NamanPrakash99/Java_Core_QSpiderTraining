package Multithreading;

public class Test2 extends Thread{
	// override the run
	
		public void run() {
			// print number from 6 to 10
			for(int i=6;i<=10;i++) {
				System.out.print(i);
			}
		}
}
