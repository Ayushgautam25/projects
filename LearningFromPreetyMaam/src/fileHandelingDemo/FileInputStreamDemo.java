package fileHandelingDemo;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Exception;
public class FileInputStreamDemo {
	public static void main(String[] args) {
		try {
			FileWriter file2 = new FileWriter("Text.txt");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
