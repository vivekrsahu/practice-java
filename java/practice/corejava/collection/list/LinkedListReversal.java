package practice.corejava.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class LinkedListReversal {

    /**
     * Using enhanced "for loop" for iterating the input list and 
     * {@link List#add(int, Object)} method to add elements in reverse direction.
     * 
     * @param inputList
     * @return reversed list
     */
    private static LinkedList<String> reverseListApproach1(final LinkedList<String> inputList) {
        final LinkedList<String> reversedList = new LinkedList<>();
        for (String item : inputList) {
            reversedList.add(0, item);
        }
        return reversedList;
    }

    /**
     * Using simple "for loop" for iterating the input list in reverse direction
     * and {@link List#add(int)} method for adding elements normally.
     * 
     * @param inputList
     * @return reversed list
     */
    private static LinkedList<String> reverseListApproach2(final LinkedList<String> inputList) {
        final LinkedList<String> reversedList = new LinkedList<>();
        for (int index = inputList.size() - 1; index >= 0; index--) {
            reversedList.add(inputList.get(index));
        }
        return reversedList;
    }

    /**
     * Using {@link ListIterator} i.e., {@link List#listIterator(int)} method for 
     * iterating the input list and {@link List#add(int, Object)} method to add 
     * elements in reverse direction.
     * 
     * @param inputList
     * @return reversed list
     */
    private static LinkedList<String> reverseListApproach3(final LinkedList<String> inputList) {
        final LinkedList<String> outputList = new LinkedList<>();
        final ListIterator<String> iter = inputList.listIterator(0);
        while (iter.hasNext()) {
            outputList.add(0, iter.next());
        }
        return outputList;
    }

    /**
     * Using {@link ListIterator} i.e., {@link List#listIterator(int)} method for 
     * iterating the input list and {@link List#add(int, Object)} method to add 
     * elements in reverse direction.
     * 
     * @param inputList
     * @return reversed list
     */
    private static LinkedList<String> reverseListApproach4(final LinkedList<String> inputList) {
        final LinkedList<String> outputList = new LinkedList<>();
        final ListIterator<String> iter = inputList.listIterator(inputList.size());
        while (iter.hasPrevious()) {
            outputList.add(iter.previous());
        }
        return outputList;
    }

    public static void main(String[] args) {
        final LinkedList<String> list = new LinkedList<>();
        list.add("My");
        list.add("Name");
        list.add("Is");
        list.add("Vivek");
        list.add("Ranjan");
        list.add("Sahu");
        System.out.println("List1 = " + reverseListApproach1(list));
        System.out.println("List2 = " + reverseListApproach2(list));
        System.out.println("List3 = " + reverseListApproach3(list));
        System.out.println("List4 = " + reverseListApproach4(list));
    }

}
