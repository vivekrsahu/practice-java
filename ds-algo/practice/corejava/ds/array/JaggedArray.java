package practice.corejava.ds.array;

public class JaggedArray {

    private static void printElements(int rows) {
        int arr[][] = new int[rows][];
        // create array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }
        // initialize array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        // fetch elements and print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printElements(4);
    }
}
