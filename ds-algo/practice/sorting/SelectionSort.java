package practice.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] inputArray = {1, 3, 7, 2, 9, 4, 5};
        sort(inputArray);
    }

    private static void sort(int[] inputArray) {
        int min, swap;
        for (int i = 0; i < inputArray.length; i++) {
            min = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[min]) {
                    min = j;
                }
            }
            swap = inputArray[i];
            inputArray[i] = inputArray[min];
            inputArray[min] = swap;
            System.out.print(inputArray[i] + " ");
        }
    }

}
