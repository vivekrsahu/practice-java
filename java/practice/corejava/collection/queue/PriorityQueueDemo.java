package practice.corejava.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Elements are stored according to their priority i.e., irrespective of its insertion order.<br>
 * Some operating systems don’t provide proper support for priority queues but the expected 
 * output should be always in the prioritized order only.
 * @see {@link PriorityQueue}
 * @author Vivek Ranjan Sahu
 */
public class PriorityQueueDemo {
	private static PriorityQueue<String> naturalOrdering() {
		PriorityQueue<String> pQueue = new PriorityQueue<>();
		return prepareQueue(pQueue);
	}
	private static PriorityQueue<String> customizedOrdering() {
		PriorityQueue<String> pQueue = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.split("\\s+")[1].compareTo(o2.split("\\s+")[1]);
			}
		});
		return prepareQueue(pQueue);
	}
	private static PriorityQueue<String> prepareQueue(PriorityQueue<String> pQueue) {
		pQueue.offer("Gyan Mishra");
		pQueue.offer("Guru Padhy");
		pQueue.offer("Vivek Sahu");
		pQueue.offer("Praveen Panda");
		pQueue.offer("Rochit Jaiswal");
		pQueue.offer("Prabhakar Borah");
		return pQueue;
	}
	public static void main(String[] args) {
		System.out.println(naturalOrdering());
		System.out.println(customizedOrdering());
	}
}
