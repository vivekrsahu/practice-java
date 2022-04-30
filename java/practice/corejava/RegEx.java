package practice.corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class gives a demo on usage of regex.
 * @author Vivek Ranjan Sahu
 */
public final class RegEx {
	public static void main(String args[]) {
		// String to be scanned to find the pattern.
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(\\d+)(.*)";
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Now create matcher object.
		Matcher m = r.matcher(line);
		System.out.println(m.groupCount());
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
			System.out.println("Found value: " + m.group(3));
		} else {
			System.out.println("NO MATCH");
		}
	}
}
