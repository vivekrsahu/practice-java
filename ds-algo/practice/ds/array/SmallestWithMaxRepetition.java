package practice.ds.array;

public class SmallestWithMaxRepetition {

    private static int getSmallestWithMaxRepetition(int[] inputArray) {
        int repetition = 0;
        int tempRepetition = 0;
        int item = 0;
        for (int i = 0; i < inputArray.length; i++) {
            // initialize with first item
            if (i == 0) {
                item = inputArray[i];
            }
            // if counting already done then skip the number
            if (inputArray[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    tempRepetition++;
                    // replace the jth item with -1 so as to avoid further iteration for same number
                    inputArray[j] = -1;
                }
            }
            if (tempRepetition > repetition || (tempRepetition == repetition && inputArray[i] < item)) {
                repetition = tempRepetition;
                item = inputArray[i];
            }
            tempRepetition = 0;
        }
        return item;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 6, 3, 6, 2, 1, 3, 1, 3, 2, 5, 1, 3, 3, 3, 3};
        System.out.println(getSmallestWithMaxRepetition(inputArray));
    }
}
