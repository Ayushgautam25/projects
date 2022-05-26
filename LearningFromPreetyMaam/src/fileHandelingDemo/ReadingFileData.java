package fileHandelingDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingFileData {
	public static void main(String[] args) {
		File fileObj = new File("Text.txt");
		try {
			Scanner readingObj = new Scanner(fileObj);
		      while (readingObj.hasNextLine()) {
		        String data = readingObj.nextLine();
		        System.out.println(data + "\n");
		      }
		      readingObj.close();
		    }
		    
		 catch(FileNotFoundException e) {
		      System.out.println("The Given File does not Exist");
		      e.printStackTrace();
		    }
		
	}
}