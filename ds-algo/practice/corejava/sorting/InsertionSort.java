package practice.corejava.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] inputArray = {1, 3, 7, 2, 9, 4, 5};
        sort(inputArray);
    }

    private static void sort(int[] inputArray) {
        int temp, j;
        for (int i = 1; i < inputArray.length; i++) {
            temp = inputArray[i];
            j = i;
            while (j > 0 && temp < inputArray[j - 1]) {
                inputArray[j] = inputArray[j - 1];
                j--;
            }
            inputArray[j] = temp;
        }
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

}
