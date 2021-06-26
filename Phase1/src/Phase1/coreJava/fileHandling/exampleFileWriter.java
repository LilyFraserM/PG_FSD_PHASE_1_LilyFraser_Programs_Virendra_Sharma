package Phase1.coreJava.fileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class exampleFileWriter {
	
	//String data = "This is the data in the output file";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("add some details about you:");
		String data = sc.nextLine();
		
		try {
			  FileWriter output = new FileWriter("C:\\Users\\lilyf\\OneDrive\\Documents\\Phase1\\output.txt");
			  output.write(data);
			  
			   output.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }

	}

}
