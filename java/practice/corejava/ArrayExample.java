package practice.corejava;

/**
 * This class aims at providing a basic knowledge on multi-dimensional arrays.
 * @author Vivek Ranjan Sahu
 */
public final class ArrayExample {
	public static void main(String[] args) {
		int [][] x1 = new int[2][3];
		System.out.println(x1); // 2-d array reference which contain references of two 1-d arrays
		System.out.println(x1[0]); // internal 1-d array reference
		System.out.println(x1[0][0]); // default value of the element of the internal array

		int [][] x2 = new int[2][];
		System.out.println(x2); // 2-d array reference which contain references of two undefined objects, so null is the default value
		System.out.println(x2[0]); // null
//		System.out.println(x2[0][0]); // NullPointerException

		int [][][] x3 = {{{10, 20, 30}, {40, 50, 60}}, {{70, 80}, {90, 100, 110}}};
		System.out.println(x3); // 3-d array reference i.e., [[[I@45ee12a7
		System.out.println(x3[0]); // 2-d array reference i.e., [[I@330bedb4
		System.out.println(x3[0][0]); // 1-d array reference i.e., [I@2503dbd3
		System.out.println(x3[0][1][2]); // 60
		System.out.println(x3[1][0][1]); // 80
//		System.out.println(x3[2][0][0]); // ArrayIndexOutOfBoundsException
	}
}
