package fileHandelingDemo;

import java.io.FileWriter;
import java.io.IOException; 
  
public class WritingOverFile {
    public static void main(String[] args)
    {
        try {
            FileWriter Write = new FileWriter("Text.txt");
            Write.write("This is the first line.");
            Write.write("This is the second line.");
            Write.write("This is the third line.");
            Write.close();
            System.out.println("Writing over file done successfully");
        }
        catch (IOException e) {
            System.out.println("An exception is detected.");
            e.printStackTrace();
        }
    }
}