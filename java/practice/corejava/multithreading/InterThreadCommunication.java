package practice.corejava.multithreading;

public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		// main thread is the first thread
		SecondThread thread2 = new SecondThread();	
		thread2.start();
		// not recommended or invalid cases
//		System.out.println(thread2.total); // 0 or 5050 or some number in between
//		Thread.sleep(10, 1);
//		System.out.println(thread2.total); // if the child thread completes the run method execution then it will print 5050 or it may print other outputs
//		//Hence, it is not recommended to use sleep for unknown scenarios
//		thread2.join();
//		System.out.println(thread2.total); // it will always print 5050 because the main thread waits for the child method to complete and hence it seems good 
//		// but still it is not recommended because if after the for loop the run method has 1000 of line of codes then the main thread unnecessarily waits for that many time.
//		thread2.wait(); // it is recommended but not called inside synchronized block and hence will throw IllegalMonitorStateException during runtime
//		System.out.println(thread2.total);
		// it is recommended if the main thread executes first that happens most of the time but not always. So, it is also not completely recommended.
		Thread.sleep(1000);
		synchronized(thread2) {
			System.out.println("Main thread waiting for the child thread to complete"); //1
			thread2.wait();
//			thread2.wait(2000); // useful if the child thread executes before the main thread, then the main thread will not get blocked forever.
			System.out.println("Main thread got notification"); //3
			System.out.println(thread2.total); //4
		}
	}

}

class SecondThread extends Thread {
	int total = 0;
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
		synchronized (this) { // for multiple threads, call synchronized block on that particular object only
			System.out.println("Child thread notifying main thread"); //2
			this.notify(); // is called if wait method is used in the main method
		}
	}
}