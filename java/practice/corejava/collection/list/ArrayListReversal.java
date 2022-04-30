package practice.corejava.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public final class ArrayListReversal {

    /**
     * Using enhanced "for loop" for iterating the input list and 
     * {@link List#add(int, Object)} method to add elements in reverse direction.
     * 
     * @param listToBeReversed
     * @return reversed list
     */
    private static ArrayList<String> reverseListApproach1(final ArrayList<String> listToBeReversed) {
        final ArrayList<String> reversedList = new ArrayList<>();
        for (String item : listToBeReversed) {
            reversedList.add(0, item);
        }
        return reversedList;
    }

    /**
     * Using simple "for loop" for iterating the input list in reverse direction
     * and {@link List#add(int)} method for adding elements normally.
     * 
     * @param listToBeReversed
     * @return reversed list
     */
    private static ArrayList<String> reverseListApproach2(final ArrayList<String> listToBeReversed) {
        final ArrayList<String> reversedList = new ArrayList<>();
        for (int index = listToBeReversed.size() - 1; index >= 0; index--) {
            reversedList.add(listToBeReversed.get(index));
        }
        return reversedList;
    }

    /**
     * Using {@link ListIterator} i.e., {@link List#listIterator(int)} method for 
     * iterating the input list and {@link List#add(int, Object)} method to add 
     * elements in reverse direction.
     * 
     * @param listToBeReversed
     * @return reversed list
     */
    private static ArrayList<String> reverseListApproach3(final ArrayList<String> listToBeReversed) {
        final ArrayList<String> outputList = new ArrayList<>();
        final ListIterator<String> iter = listToBeReversed.listIterator(0);
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
     * @param listToBeReversed
     * @return reversed list
     */
    private static ArrayList<String> reverseListApproach4(final ArrayList<String> listToBeReversed) {
        final ArrayList<String> outputList = new ArrayList<>();
        final ListIterator<String> iter = listToBeReversed.listIterator(listToBeReversed.size());
        while (iter.hasPrevious()) {
            outputList.add(iter.previous());
        }
        return outputList;
    }

    public static void main(String[] args) {
        final ArrayList<String> list = new ArrayList<>();
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
