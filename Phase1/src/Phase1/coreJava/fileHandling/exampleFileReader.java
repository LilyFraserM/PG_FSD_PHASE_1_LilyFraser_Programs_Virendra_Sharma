package Phase1.coreJava.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class exampleFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = new char[100];
	    
	    try {
	      // Step 1: Creates a reader using the FileReader
	   
	      FileReader input = new FileReader("C:\\Users\\lilyf\\OneDrive\\Documents\\Phase1\\output.txt");
	      // Step 2: Reads characters
	      input.read(array);
	      
	      System.out.println("Data in the file:");
	      System.out.println(array);

	      // Step 3: Closes the reader
	      input.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
		
		}
	

}
