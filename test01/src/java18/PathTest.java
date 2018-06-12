package java18;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PathTest {

	public static void main(String[] args) {
		ClassLoader cl = PathTest.class.getClassLoader();
		InputStream is = cl.getResourceAsStream("dbcon.properties");
		Properties prop = new Properties();
		
		try {
			prop.load(is);
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String pwd = prop.getProperty("pwd");
			System.out.println("dirver : " + driver);
			System.out.println("url : " + url);
			System.out.println("id : " + id);
			System.out.println("pwd : " + pwd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
