package practice.ds.array;

public class ReverseArray {

    private static int[] reverse1(int[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        int index = 0;
        for (int i = inputArray.length -1; i > -1; i--) {
            outputArray[index++] = inputArray[i];
        }
        return outputArray;
    }

    private static void reverse2(int[] inputArray) {
        int length = inputArray.length;
        int start = 0;
        int end = length - 1;
        int temp;
        while (start < end) {
            temp = inputArray[end];
            inputArray[end] = inputArray[start];
            inputArray[start] = temp;
            ++start;
            --end;
        }
    }

    private static void reverse2UsingRecursion(int[] inputArray) {
        recursion(inputArray, 0, inputArray.length - 1);
    }

    private static void recursion(int[] inputArray, int start, int end) {
        int temp;
        if (start >= end) {
            return;
        }
        temp = inputArray[end];
        inputArray[end] = inputArray[start];
        inputArray[start] = temp;
        recursion(inputArray, ++start, --end);
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 6, 2, 7, 4, 1};
        inputArray = reverse1(inputArray);
        reverse2(inputArray);
        reverse2UsingRecursion(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

}
