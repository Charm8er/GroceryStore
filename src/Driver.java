// Joshua Luttmer, Marcos Del Toro, Omar Arias
// Store Program Part 1 
// 11/5/2018
// Reads in text file with name, item number, price, weight and inventory level.

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
		System.out.printf ( "%15s%10s%10s%10s%10s\n","Name", "Item #", "Price", "Weight", "Stock\n" );
		
		while(inputFile.hasNext())
		{
			String name = inputFile.next ( ); // name of item
			int itemNum = inputFile.nextInt ( ); // item number/barcode
			double price = inputFile.nextDouble ( ); // price of item
			int weight = inputFile.nextInt ( ); // weight of item in oz
			int stock = inputFile.nextInt ( ); // number of items in stock
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


// Problem getting text file to read in.  Had to remove .txt from file name and move it 1 level above src.