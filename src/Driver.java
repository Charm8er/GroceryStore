// Joshua Luttmer, Marcos Del Toro, Omar Arias
// Store Program Part 2 
// 11/6/2018
// Reads in text file with name, item number, price, weight and inventory level.  Creates item with object1.

import java.io.*;
import java.util.Scanner;

public class Driver {

	static Scanner input;
	public static Scanner inputFile;
	public static java.io.File inFile;
	public static void main(String[] args) throws IOException
	{
		input = new Scanner (System.in);
		inFile = new java.io.File("items");
		inputFile = new Scanner(inFile);
		Item object1 = new Item(); // Declaring Item object
		
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
		
		inputFile.close ();
		
		createObject (object1);
		printData(object1);
		
		
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
	/********************************************************
	 * @author Josh, Marcos, Omar
	 * @param item / the item
	 ********************************************************/
	
	public static void printInventory(Item item)
	{
		System.out.println("Name: " + item.getName ( ) + " " + " Stock: " + item.getStock( ));
	}
	/*********************************************************
	 * @author Omar, Josh, Marcos
	 * This method receives an Item object and allows user to input data members
	 * @param object1, Item class object (user will input data)
	 */
	public static void createObject(Item object1)
	{
		String name; // Name of item
		int itemNum; // Item number/bar code
		double price; // Item price
		int weight; // Item weight in oz
		int stock; // Quantity in stock
		
		System.out.println ( "\nEnter item name: " );
		name = input.next ( );
		object1.setName ( name );
		
		System.out.println ( "Enter item #: " );
		itemNum = input.nextInt ( );
		object1.setItemNum ( itemNum );
		
		System.out.println ( "Enter item price: " );
		price = input.nextDouble ( );
		object1.setPrice ( price );
		
		System.out.println ( "Enter item weight: " );
		weight = input.nextInt ( );
		object1.setWeight ( weight );
		
		System.out.println ( "Enter quantity in stock: " );
		stock = input.nextInt ( );
		object1.setStock ( stock );
		
	} // End objectInput
	/*********************************************************************
	 * @author Omar, Marcos, Josh
	 * This method prints the data members from the object
	 * @param object1, Item whose data will be printed
	 */
	public static void printData(Item object1)
	{
		System.out.println ( "Name: " + object1.getName ( ) );
		System.out.println ( "Item #: " + object1.getItemNum ( ) );
		System.out.println ( "Price: " + object1.getPrice ( ));
		System.out.println ( "Weight: " + object1.getWeight ( ) );
		System.out.println ( "Stock: " + object1.getStock ( ) );
	} // End printData
	
} // end of Driver class


// Problem getting text file to read in.  Had to remove .txt from file name and move it 1 level above src.