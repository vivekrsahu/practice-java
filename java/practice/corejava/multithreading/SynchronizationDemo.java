package practice.corejava.multithreading;

public class SynchronizationDemo {
	public static void main(String[] args) {
		CustomThread1 thread1 = new CustomThread1("Thread1");
		CustomThread2 thread2 = new CustomThread2("Thread2");
		CustomThread3 thread3 = new CustomThread3("Thread3");
		Synchronization synchronizationObject = new Synchronization();
		Synchronization anotherSynchronizationObject = new Synchronization();
		CustomThread4 thread4A = new CustomThread4(synchronizationObject, "Thread4A");
		CustomThread4 thread4B = new CustomThread4(anotherSynchronizationObject, "Thread4B");
		CustomThread5 thread5 = new CustomThread5(synchronizationObject, "Thread5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4A.start();
		thread4B.start();
		thread5.start();
	}
}

class Synchronization {
	static synchronized void classLevelSynchronized(String threadName) {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Class level synchronized method executed by: " + threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {}
		}
	}
	static synchronized void anotherClassLevelSynchronized(String threadName) {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Another class level synchronized method executed by: " + threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {}
		}
	}
	static void unsynchronizedStatic(String threadName) {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Unsynchronized static method executed by: " + threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {}
		}
	}
	synchronized void objectLevelSynchronized(String threadName) {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Object level synchronized method executed by: " + threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {}
		}
	}
	void unsynchronized(String threadName) {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Unsynchronized method executed by: " + threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {}
		}
	}
}

class CustomThread1 extends Thread {
	private String threadName;
	public CustomThread1(String threadName) {
		this.threadName = threadName;
	}
	public String getThreadName() {
		return threadName;
	}
	@Override
	public void run() {
		Synchronization.classLevelSynchronized(threadName);
	}
}

class CustomThread2 extends Thread {
	private String threadName;
	public CustomThread2(String threadName) {
		this.threadName = threadName;
	}
	public String getThreadName() {
		return threadName;
	}
	@Override
	public void run() {
		Synchronization.anotherClassLevelSynchronized(threadName);
	}
}

class CustomThread3 extends Thread {
	private String threadName;
	public CustomThread3(String threadName) {
		this.threadName = threadName;
	}
	public String getThreadName() {
		return threadName;
	}
	@Override
	public void run() {
		Synchronization.unsynchronizedStatic(threadName);
	}
}

class CustomThread4 extends Thread {
	private Synchronization synchronizationReference;
	private String threadName;
	public CustomThread4(Synchronization synchronizationReference, String threadName) {
		this.synchronizationReference = synchronizationReference;
		this.threadName = threadName;
	}
	public Synchronization getSynchronizationReference() {
		return synchronizationReference;
	}
	public String getThreadName() {
		return threadName;
	}
	@Override
	public void run() {
		synchronizationReference.objectLevelSynchronized(threadName);
	}
}

class CustomThread5 extends Thread {
	private Synchronization synchronizationReference;
	private String threadName;
	public CustomThread5(Synchronization synchronizationReference, String threadName) {
		this.synchronizationReference = synchronizationReference;
		this.threadName = threadName;
	}
	public Synchronization getSynchronizationReference() {
		return synchronizationReference;
	}
	public String getThreadName() {
		return threadName;
	}
	@Override
	public void run() {
		synchronizationReference.unsynchronized(threadName);
	}
}
