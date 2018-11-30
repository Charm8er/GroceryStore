package fileio;
import java.io.*;
import java.util.Scanner;

public class fileio
{	public static Scanner inputFile;
	public static java.io.File inFile;
	public static void main( String[ ] args ) throws IOException
	{
		
		inFile=new java.io.File("StoreItems.txt");
		inputFile = new Scanner(inFile);
		if(!inFile.exists())
		{
			System.out.println ( "file not found" );
			System.exit(-1);
		}
		
		while(inputFile.hasNext())
		{
		String name = inputFile.next ( );
		double price = inputFile.nextDouble ( );
		double amount =inputFile.nextDouble();
		System.out.printf ( "%15s%10s%10s\n",name, price, amount );
		}
		inputFile.close ( );
	}
}

/* outFile= new java.io.File("nameOFFile.txt");
 * java.io.PrintWriter fout = new java.io.PrintWriter(outFile);
 * fout.printf("here");
 * fout.close();
 */