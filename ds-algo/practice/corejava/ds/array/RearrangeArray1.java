package practice.corejava.ds.array;

public class RearrangeArray1 {

    private static void rearrange(int inputArray[]) {
        int temp = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == i || inputArray[i] == -1) {
                continue;
            }
            temp = inputArray[i];
            swap(temp, i, inputArray);
        }
    }

    private static void swap(int first, int index, int[] inputArray) {
        int second = inputArray[first];
        inputArray[first] = first;
        if (second == index || second == -1) {
            inputArray[index] = second;
            return;
        }
        swap(second, index, inputArray);
    }

    public static void main(String[] args) {
        int inputArray[] = {0, 3, 7, 2, 6, -1, 4, -1};
        rearrange(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

}
