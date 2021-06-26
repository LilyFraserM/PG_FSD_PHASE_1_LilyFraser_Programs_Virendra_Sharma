package Phase1.coreJava.fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIPStreamProg {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 FileInputStream fin= new FileInputStream("C:\\Users\\lilyf\\OneDrive\\Documents\\Phase1\\output.txt");
		 System.out.println(fin.getChannel()); 
		 
		 System.out.println(fin.getFD()); 
		 System.out.println("Number of  bytes read:"+fin.available()); 
		 // fin.skip(7); 
	      System.out.println("FileContents :"); 
	      //read characters from FileInputStream and write them 
	      int ch; 
	      while((ch=fin.read())!=-1) 
	          System.out.print((char)ch); 
	        
	      //close the file 
	      fin.close(); 
	  } 
	}


