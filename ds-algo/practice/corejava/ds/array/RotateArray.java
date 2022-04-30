package practice.corejava.ds.array;

public class RotateArray {

    private static void rotateArray1(int inputArray[], int rotateBy) {
        for (int i = 0; i < rotateBy; i++) {
            rotator(inputArray, inputArray.length);
        }
    }

    private static void rotator(int inputArray[], int length) {
        int temp = inputArray[0];
        for (int i = 0; i < length - 1; i++) {
            inputArray[i] = inputArray[i + 1];
        }
        inputArray[length - 1] = temp;
    }

    private static void approach1(int inputArray[], int rotateBy) {
        rotateArray1(inputArray, rotateBy); // output = {40, 50, 60, 70, 80, 10, 20, 30}
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        printDuration1(inputArray, rotateBy);
    }

    private static void printDuration1(int inputArray[], int rotateBy) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            rotateArray1(inputArray, rotateBy);
        }
        long end = System.currentTimeMillis();
        System.out.println("\nApproach1 Duration: " + (end - start) + " ms");
    }

    public static void main(String[] args) {
        int inputArray[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int rotateBy = 3;
        approach1(inputArray, rotateBy);
        //approach2(inputArray, rotateBy); // more complex and time taking
    }

//    private static void rotateArray2(int inputArray[], int rotateBy) {
//        int i, j, k, temp;
//        int n = inputArray.length;
//        for (i = 0; i < gcd(rotateBy, n); i++) {
//            temp = inputArray[i];
//            j = i;
//            while (true) {
//                k = j + rotateBy;
//                if (k >= n) {
//                    k = k - n;
//                }
//                if (k == i) {
//                    break;
//                }
//                inputArray[j] = inputArray[k];
//                j = k;
//            }
//            inputArray[j] = temp;
//        }
//    }
//
//    private static void approach2(int inputArray[], int rotateBy) {
//        rotateArray2(inputArray, rotateBy);
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " ");
//        }
//        printDuration2(inputArray, rotateBy);
//    }
//
//    private static int gcd(int a, int b) {
//        return b == 0 ? a : gcd(b, a % b);
//    }
//
//    private static void printDuration2(int inputArray[], int rotateBy) {
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            rotateArray2(inputArray, rotateBy);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("\nApproach2 Duration: " + (end - start) + " ms");
//    }

}
