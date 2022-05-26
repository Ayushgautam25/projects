package fileHandelingDemo;

import java.io.FileReader;
import java.io.Reader;

public class ReaderClassDemo {
	public static void main(String[] args) {
		char[] array = new char[50];
		try {
			Reader input = new FileReader("ss.txt");
			System.out.println("Data present in the stream or not? : "+ input.ready());
			input.read(array);
			System.out.println("Data in the stream : ");
			System.out.println(array);
			
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
