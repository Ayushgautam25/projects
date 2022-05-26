package fileHandelingDemo;
import java.io.File;
import java.io.IOException;
public class FH1 {
	public static void main(String[] args) {
		try {
	         File obj = new File("myfile.txt");
	         if (obj.createNewFile()) {
	             System.out.println("File created by the name : "
	                                + obj.getName());
	         }
	         else {
	             System.out.println("File already existing with same name on this path.");
	         }
	     }
	     catch (IOException e) {
	         System.out.println("An error is detected.");
	         e.printStackTrace();
	     }
	}
}
