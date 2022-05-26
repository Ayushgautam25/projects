package fileHandelingDemo;

import java.io.FileWriter;
import java.io.Writer;

public class WriterClassDemo {
	public static void main(String[] args) {
		String data = "This is the data to be added.";
		try {
			Writer output = new FileWriter("ss.txt");
			output.write(data);
			System.out.println("Data added");
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
