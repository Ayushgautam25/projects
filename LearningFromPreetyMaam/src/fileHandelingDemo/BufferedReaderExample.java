package fileHandelingDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String args[])throws Exception{  
		BufferedReader in = new BufferedReader(new FileReader("File1.txt"));           
	     String name="";    
	     while(!name.equals("stop")){    
	      System.out.println("Enter data: ");    
	      name=br.readLine();    
	      System.out.println("data is: "+name);    
	     }              
	    br.close();    
	    r.close();    
	}
}
