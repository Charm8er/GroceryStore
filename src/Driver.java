// Joshua Luttmer, Marcos Del Toro, Omar Arias
// Store Program Part 4 
// 11/9/2018
// Reads in text file with name, item number, price, weight and inventory level.  Added Grocery Menu.

import java.io.*;
import java.util.Scanner;

public class Driver {

	static Scanner input;
	public static Scanner inputFile;
	public static java.io.File inFile;
	public static final int MAX = 20;
	public static void main(String[] args) throws IOException
	{
		input = new Scanner (System.in);
		inFile = new java.io.File("items");
		inputFile = new Scanner(inFile);
		
		Item [] groceryArray = new Item [MAX]; // Declaring and  initializing  array of grocery items
		importList(groceryArray);
		groceryMenu (groceryArray);
	
//		printArray (groceryArray);
//		createObject (object1);
//		printData(newItem);			
//		Item beef = new Item(); // create item "beef"
//		System.out.println(beef.toString()); // output item "beef"
//		Item chicken = new Item("Chicken", 2011, 7.99, 16, 20 ); // create item Chicken
//		System.out.println(chicken.toString()); // output item "Chicken"
//		System.out.println(chicken.getPrice()); // get item price
//		chicken.setPrice(-5); // set item price
//		System.out.println(chicken.toString()); // output item "Chicken"
//		printInventory (chicken); // call printInventory

	} // end of main
	/********************************************************
	 * @author Josh, Marcos, Omar
	 * @param item / the item
	 ********************************************************/
	
	public static void printInventory(Item item)
	{
		System.out.println("Name: " + item.getName ( ) + " " + " Stock: " + item.getStock( ));
	} // end printInventory
	
	/******************************************************************************
	 * @author Omar, Josh, Marcos
	 * This method receives an Item object and allows user to input data members
	 * @param newItem, Item class object (user will input data)
	 * @return newItem
	 ******************************************************************************/
	public static Item createObject(Item newItem)
	{
		String name; // Name of item
		int itemNum; // Item number/bar code
		double price; // Item price
		int weight; // Item weight in oz
		int stock; // Quantity in stock
		
		System.out.println ( "\nEnter item name: " );
		name = input.next ( );
		newItem.setName ( name );
		
		System.out.println ( "Enter item #: " );
		itemNum = input.nextInt ( );
		newItem.setItemNum ( itemNum );
		
		System.out.println ( "Enter item price: " );
		price = input.nextDouble ( );
		newItem.setPrice ( price );
		
		System.out.println ( "Enter item weight: " );
		weight = input.nextInt ( );
		newItem.setWeight ( weight );
		
		System.out.println ( "Enter quantity in stock: " );
		stock = input.nextInt ( );
		newItem.setStock ( stock );
		
		return newItem;
		
	} // end objectInput
	
	/*********************************************************************
	 * @author Omar, Marcos, Josh
	 * This method prints the data members from the object
	 * @param object1, Item whose data will be printed
	 *********************************************************************/
	public static void printData(Item object1)
	{

		System.out.println ( "Name: " + object1.getName ( ));
		System.out.println ( "Item#: " + object1.getItemNum ( ));

		System.out.println ( "Name: " + object1.getName ( ) );
		System.out.println ( "Item #: " + object1.getItemNum ( ) );

		System.out.println ( "Price: " + object1.getPrice ( ));
		System.out.println ( "Weight: " + object1.getWeight ( ));
		System.out.println ( "Stock: " + object1.getStock ( ));
	} // end printData
	
	/******************************************************************************************************
	 * @author Josh , Omar, Marcos
	 * This method prints the full array unless null
	 * @param groceryArray, array of grocery items (name, item number, price, weight(oz), amount in stock)
	 ******************************************************************************************************/
	public static void printArray (Item [] groceryArray)
	{
//		int arrayLength = groceryArray.length; // LCV for array length
		for (int index = 0; index < MAX; index ++)
		{	
			if (groceryArray [index] != null)
			{
				System.out.println ( groceryArray [index] );
			} // end IF null
		} // end FOR index loc
	} // end printArray
	
	/******************************************************************************************************
	 * @author Josh , Omar, Marcos
	 * This method imports "item" list and allows for user to manually input item.
	 * @param groceryArray, array of grocery items (name, item number, price, weight(oz), amount in stock)
	 ******************************************************************************************************/
	public static void importList(Item [] groceryArray) 
	{
		Item arrayObject = new Item (); // Declaring object of item type, used to fill array
		int index = 0; // array location
		char addItem = 'y'; // LCV
		if(!inFile.exists())
		{
			System.out.println ( "file not found" );
			System.exit(-1);
		}
		
		System.out.printf ( "%15s%10s%10s%10s%10s\n","Name", "Item #", "Price", "Weight", "Stock\n" );
		
		while(addItem == 'y') // Author Josh
		{			
			while (inputFile.hasNext()) // Author Omar
			{
				String name = inputFile.next ( ); // name of item
				int itemNum = inputFile.nextInt ( ); // item number/barcode
				double price = inputFile.nextDouble ( ); // price of item
				int weight = inputFile.nextInt ( ); // weight of item in oz
				int stock = inputFile.nextInt ( ); // number of items in stock
				System.out.printf ( "%15s%10s%10s%10s%10s\n",name, itemNum, price, weight, stock );
				arrayObject = new Item (name, itemNum, price, weight, stock);
				groceryArray [index] = arrayObject;
				index ++;
			} // end WHILE hasNext
			
			while (addItem == 'y') // Author Josh
			{	
				Item newItem = new Item(); // Declaring Item object
				System.out.println("\nAdd item manually? (y or n): ");
				addItem = input.next().charAt(0);
				if (addItem == 'y')
				{
					groceryArray [index] = createObject (newItem);
					index++;					
				} // end IF addItem y
			} //end 2nd WHILE addItem y
		} // end WHILE addItem y

		inputFile.close ();
	}

	
	/******************************************************************************************************
	 * @author Josh , Omar, Marcos
	 * This method reads the groceryArray and displays a list for selection by customer.
	 * @param groceryArray, array of grocery items (name, item number, price, weight(oz), amount in stock)
	 ******************************************************************************************************/
	public static void groceryMenu ( Item [] groceryArray ) // Author Marcos, Contributor Josh
	{
		System.out.println("\n--------   GROCERY MENU   --------\n");
		System.out.printf ( "%10s%10s%10s\n","Name", "Item #", "Price\n" );
		for (int i = 0; i < MAX; i++)
		{
			if (groceryArray [i] != null)
			{
				System.out.printf("%10s%10s%10s\n",
				groceryArray[i].getName(),
				groceryArray[i].getItemNum(),
				groceryArray[i].getPrice());
			} // end IF != null
		} // end FOR array loop
	} // end groceryMenu

} // end of Driver class


// Problem getting text file to read in.  Had to remove .txt from file name and move it 1 level above src.
