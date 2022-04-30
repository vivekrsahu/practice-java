package practice.corejava.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] inputArray = {1, 3, 7, 2, 9, 4, 5};
        sort(inputArray);
    }

    private static void sort(int[] inputArray) {
        int swap;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    swap = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = swap;
                }
            }
            System.out.print(inputArray[i] + " ");
        }
    }

}
