package Multithreading;

public class ExampleMain {
	public static void main(String[] args) throws InterruptedException {
		Example e1=new Example();
		Example e2=new Example();
		Thread t=new Thread(e1);
		Thread tt=new Thread(e1);
//		t.run();
		t.start();
		tt.start();
		
		t.sleep(1500);
		t.join();
		System.out.print(" Hello from main");

	}
}
