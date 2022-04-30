package practice.corejava.multithreading;

public class DaemonThreadDemo {
	public static void main(String[] args) {
		DaemonThread thread = new DaemonThread();
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(30);
		} catch (InterruptedException ie) {}
		System.out.println("End of main thread");
	}
}

// child daemon thread will continue till the main thread comes to an end.
class DaemonThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// uncommenting the below block will restrict the printing of "Child Thread".
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException ie) {}
			System.out.println("Child Thread");
			try {
				Thread.sleep(11);
			} catch (InterruptedException ie) {}
		}
	}
}