package java12;
	
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileTxt {
	private File file;
	private FileReader fr;
	private BufferedReader br;
	public ReadFileTxt(String path) {
		file = new File(path);
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String txtLine = "";
			while((txtLine = br.readLine())!=null) {
				System.out.println(txtLine);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ReadFileTxt rft = new ReadFileTxt("c:/test.txt");
	}
}
