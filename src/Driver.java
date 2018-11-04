
public class Driver {

	public static void main(String[] args)
	{

		Item beef = new Item(); // create item "beef"
		System.out.println(beef.toString()); // output item "beef"
		Item chicken = new Item("Chicken", 2011, 7.99, 16, 20 ); // create item Chicken
		System.out.println(chicken.toString()); // output item "Chicken"
		System.out.println(chicken.getPrice()); // get item price
		chicken.setPrice(-5); // set item price
		System.out.println(chicken.toString()); // output item "Chicken"
		
		printInventory (chicken); // call printInventory

	} // end of main
	
	public static void printInventory(Item item)
	{
		System.out.println("Name: " + item.getName ( ) + " " + " Stock: " + item.getStock( ));
	}
 
} // end of Driver class
