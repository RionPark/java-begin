package java18;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		ClassLoader cl = PropertiesTest.class.getClassLoader();
		InputStream is = cl.getResourceAsStream("test.properties");
		try {
			prop.load(is);
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("address"));
			System.out.println(prop.getProperty("age"));
			System.out.println(prop.getProperty("email"));
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
