
import java.io.*;
import java.util.Scanner;

public class fileio
{	public static Scanner inputFile;
	public static java.io.File inFile;
	public static void main( String[ ] args ) throws IOException
	{
		
		inFile=new java.io.File("items.txt");
		inputFile = new Scanner(inFile);
		if(!inFile.exists())
		{
			System.out.println ( "file not found" );
			System.exit(-1);
		}
		
		while(inputFile.hasNext())
		{
		String name = inputFile.next ( );
		int itemNum = inputFile.nextInt ( );
		double price = inputFile.nextDouble ( );
		int weight = inputFile.nextInt ( );
		int stock = inputFile.nextInt ( );
		System.out.printf ( "%15s%10s%10s%10s%10s\n",name, itemNum, price, weight, stock );
		}
		inputFile.close ( );
	}
}

/* outFile= new java.io.File("nameOFFile.txt");
 * java.io.PrintWriter fout = new java.io.PrintWriter(outFile);
 * fout.printf("here");
 * fout.close();
 */