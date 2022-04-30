package practice.corejava.java8.lambda;

public class TypeInferenceDemo {

	public static void main(String[] args) {
		// normal way
		StringLengthLambda lambdaVariable = (String input) -> input.length(); // also can be written as "StringLengthLambda lambdaVariable = input -> input.length();"
		System.out.println(lambdaVariable.getLength("I am Lambda"));
		// can also be done as
		printLength(input -> input.length()); // type inference
	}

	public static void printLength(StringLengthLambda lambdaVariable) {
		System.out.println(lambdaVariable.getLength("I am Lambda"));
	}

	interface StringLengthLambda {
		int getLength(String string);
	}

}
