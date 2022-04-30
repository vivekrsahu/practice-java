package practice.corejava.ds.recursion;

public class TowerOfHanoi {

    private static void tOH(int discs, char towerA, char towerB, char towerC) {
        if (discs > 0) {
            tOH(discs - 1, towerA, towerC, towerB);
            System.out.println("Move disk from: " + towerA + " to " + towerC);
            tOH(discs - 1, towerB, towerA, towerC);
        }
    }

    public static void main(String[] args) {
        int discs = 5;
        char towerA = 'A';
        char towerB = 'B';
        char towerC = 'C';
        tOH(discs, towerA, towerB, towerC);
    }

}
