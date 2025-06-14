package practice.corejava.multithreading;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WaitAndNotifyDemo {

    private final List<String> synchedList;

    public WaitAndNotifyDemo() {
       // create a new synchronized list to be used
       synchedList = Collections.synchronizedList(new LinkedList<>());
    }

    // method used to remove an element from the list
    public String removeElement() throws InterruptedException {
       synchronized (synchedList) {

          // while the list is empty, wait
          while (synchedList.isEmpty()) {
             System.out.println("List is empty..." + Thread.currentThread().getName());
             synchedList.wait();
             System.out.println("Waiting..." + Thread.currentThread().getName());
          }
           return synchedList.removeFirst();
       }
    }

    // method to add an element in the list
    public void addElement(String element) {
       System.out.println("Opening...");
       synchronized (synchedList) {

          // add an element and notify all that an element exists
          synchedList.add(element);
          System.out.println("New Element:'" + element + "'");

          synchedList.notifyAll();
          System.out.println("notifyAll called!");
       }
       System.out.println("Closing...");
    }

    public static void main(String[] args) {
       final WaitAndNotifyDemo demo = new WaitAndNotifyDemo();

       Runnable runA = () -> {
          try {
             String item = demo.removeElement();
             System.out.println(item);
             System.out.println("Task done for: " + Thread.currentThread().getName());
          } catch (InterruptedException ix) {
             System.out.println("Interrupted Exception!" + Thread.currentThread().getName());
          } catch (Exception x) {
             System.out.println("Exception thrown.");
          }
       };

       Runnable runB = new Runnable() {

          // run adds an element in the list and starts the loop
          public void run() {
             demo.addElement("Hello!");
          }
       };

       try {
          Thread threadA1 = new Thread(runA, "A1");
          threadA1.start();

          Thread.sleep(500);

          Thread threadA2 = new Thread(runA, "A2");
          threadA2.start();

          Thread.sleep(500);

          Thread threadB = new Thread(runB, "B");
          threadB.start();

          Thread.sleep(1000);

          threadA1.interrupt();
          threadA2.interrupt();
       } catch (InterruptedException x) {
       }
    }
 }