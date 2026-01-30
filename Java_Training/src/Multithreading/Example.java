package Multithreading;

public class Example implements Runnable {
	// Override the run method
	@Override
	public void run() {
//		System.out.println("Thread is running...!");
//		System.out.println(Thread.currentThread().getName());

		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}

	}
}
