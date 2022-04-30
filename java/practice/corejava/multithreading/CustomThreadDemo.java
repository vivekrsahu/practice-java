package practice.corejava.multithreading;

public class CustomThreadDemo {
	public static void main(String[] args) {
//		CustomThread ct = new CustomThread();
//		ct.start();
		Thread t1 = new Thread(() -> new CustomThreadDemo().someMethod());
		t1.start();
		Thread t2 = new Thread(() -> new CustomThreadDemo().someMethod());
		t2.start();
	}

	private void someMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi");
		}
	}

}
//
//class CustomThread extends Thread {
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Tok Chudbo");
//		}
//	}
//}
