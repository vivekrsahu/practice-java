package practice.corejava.exceptionhandling;

public class TryCatchFinallyPossibleCombinations {
	public void sampleMethod() {
		try {} catch (Exception exception) {}
		try {} catch (ArithmeticException exception) {} catch (Exception exception) {}
		try {} catch (ArithmeticException | IllegalThreadStateException exception) {}
		try {} catch (Exception exception) {} finally {}
		try {} finally {}
		try {try {} catch (Exception exception) {}} catch (Exception exception) {}
		try {try {} finally {}} catch (Exception exception) {}
		try {} catch (Exception exception) {} finally {try {} catch (Exception exception) {}}
		try {} catch (Exception exception) {try {} catch (ArithmeticException arithmeticException) {}} finally {}
	}
}
