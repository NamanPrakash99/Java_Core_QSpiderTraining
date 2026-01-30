package Multithreading;

public class TestMain {
	public static void main(String[] args) {
		Test t1=new Test();
		Test2 t2=new Test2();
		Test2 t3=new Test2();
		t3.start();
		t1.start();
		t2.start();
		
	}
}
