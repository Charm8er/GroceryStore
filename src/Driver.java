import java.io.*;
import java.util.Scanner;
public class Driver {

	public static Scanner inputFile;
	public static java.io.File inFile;
	public static void main(String[] args) throws IOException
	{
		
		inFile = new java.io.File("items");
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
		
//		Item beef = new Item(); // create item "beef"
//		System.out.println(beef.toString()); // output item "beef"
//		Item chicken = new Item("Chicken", 2011, 7.99, 16, 20 ); // create item Chicken
//		System.out.println(chicken.toString()); // output item "Chicken"
//		System.out.println(chicken.getPrice()); // get item price
//		chicken.setPrice(-5); // set item price
//		System.out.println(chicken.toString()); // output item "Chicken"
//		
//		printInventory (chicken); // call printInventory

	} // end of main
	
	public static void printInventory(Item item)
	{
		System.out.println("Name: " + item.getName ( ) + " " + " Stock: " + item.getStock( ));
	}
 
} // end of Driver class
