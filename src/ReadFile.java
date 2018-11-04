
import java.io.*;
public class ReadFile {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		java.io.File inFile;//above main 
		
		inFile = new java.io.File("items.txt");//in main
		if(inFile.exists())
		{
			System.out.println("file not found");
			System.exit(-1);
		}
	} // end main

}
