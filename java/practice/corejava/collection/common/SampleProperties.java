package practice.corejava.collection.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class demonstrates the connection between java code and properties file.
 * 
 * @author Vivek Ranjan Sahu
 */
public final class SampleProperties {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/vivek_sahu01/Developer/Practice/Practice/src/com/practice/corejava/collection/common/someFile.txt");
		prop.load(fis);
		System.out.println(prop);
		System.out.println(prop.getProperty("name"));
		prop.setProperty("name", "VRS");
		FileOutputStream fos = new FileOutputStream("/Users/vivek_sahu01/Developer/Practice/Practice/src/com/practice/corejava/collection/common/someFile.txt");
		prop.store(fos, "Updated data");
	}
}
