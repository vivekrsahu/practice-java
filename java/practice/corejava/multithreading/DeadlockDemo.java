package practice.corejava.multithreading;

public class DeadlockDemo extends Thread {
	FirstObject obj1 = new FirstObject();
	SecondObject obj2 = new SecondObject();
	public void method() {
		this.start();
		obj1.method1A(obj2); // executed by main thread
	}
	@Override
	public void run() {
		// if the below block is commented, then there arise a situation of deadlock because both the threads are waiting for each other 
		// to get lock on the object that is locked by the other thread.
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {}
		obj2.method1B(obj1); // executed by child thread i.e., Deadlock thread
	}
	public static void main(String[] args) {
		DeadlockDemo thread = new DeadlockDemo();
		thread.method();
	}
}

class FirstObject {
	public synchronized void method1A(SecondObject obj) {
		System.out.println("Thread1 starts execution of method1A");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {}
		System.out.println("Thread1 calling method2B");
		obj.method2B();
	}
	public synchronized void method2A() {
		System.out.println("Method2A called");
	}
}

class SecondObject {
	public synchronized void method1B(FirstObject obj) {
		System.out.println("Thread2 starts execution of method1B");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {}
		System.out.println("Thread2 calling method2A");
		obj.method2A();
	}
	public synchronized void method2B() {
		System.out.println("Method2B called");
	}
}
