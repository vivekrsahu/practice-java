package practice.corejava.interview;

public class FirstLastIndex {
    public static void main(String[] args) {
        char[] inputArr = {'a', 'b', 'c', 'b', 'd', 'a', 'b'};
        char inputChar = 'b';
        printFirstLastIndex(inputArr, inputChar);
    }

    private static void printFirstLastIndex(char[] inputArr, char inputChar) {
        if (inputArr == null || inputArr.length == 0) {
            System.out.println("Input Array is null or empty");
            return;
        }

        int firstIndex = -1;
        int lastIndex = -1;

        for (int index = 0; index < inputArr.length; index++) {
            if (inputArr[index] == inputChar && firstIndex == -1) {
                firstIndex = index;
            }

            if (inputArr[index] == inputChar) {
                lastIndex = index;
            }
        }

        if (firstIndex == -1 && lastIndex == -1) {
            System.out.println("Character is not present in the Input Array");
            return;
        }

        System.out.println("First Index = " + firstIndex);
        System.out.println("Last Index = " + lastIndex);
    }

}
