// Joshua Luttmer, Marcos Del Toro, Omar Arias

public class Item 
{
	private String name;
	private int itemNum;
	private double price;
	private int weight;
	private int stock;
	
	/**************************************************************
	 * @author Josh, Marcos, Omar
	 * sets default values for Item
	 **************************************************************/
	public Item()
	{
		name = null; // item name default
		itemNum = 0000; // item number or barcode default
		price = 0.00; // sales price of item default
		weight = 0; // item weight in oz default
		stock = -100; // amount of item in inventory default
	} // end Item Defaults

	/**************************************************************
	 * @author Josh
	 * @param name // item name
	 * @param itemNum // item number or barcode
	 * @param price // sales price of item
	 * @param weight // item weight in oz
	 * @param stock // amount of item in inventory
	 **************************************************************/
	public Item(String name, int itemNum, double price, int weight, int stock) 
	{
		super();
		this.name = name;
		this.itemNum = itemNum;
		this.price = price;
		this.weight = weight;
		this.stock = stock;
	} // end Item

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "Item [name=" + name + ", itemNum=" + itemNum + ", price=" + price + ", weight=" + weight + ", stock="
				+ stock + "]";
	} // end toString

	/***********************************************************
	 * @author Josh, Marcos, Omar
	 * @return the name
	 ***********************************************************/
	public String getName() 
	{
		return name;
	} // end getName

	/***********************************************************
	 * @author Josh, Marcos, Omar
	 * @param name / the name to set
	 ***********************************************************/
	public void setName(String name) 
	{
		this.name = name;
	} // end setName

	/************************************************************
	 * @author Josh, Marcos, Omar
	 * @return the itemNum
	 ************************************************************/
	public int getItemNum() 
	{
		return itemNum;
	} // end getItemNum

	/************************************************************
	 * @author Josh, Marcos, Omar
	 * @param itemNum / the itemNum to set
	 ************************************************************/
	public void setItemNum(int itemNum) 
	{
		this.itemNum = itemNum;
	} // end setItemNum

	/*************************************************************
	 * @author Josh, Marcos, Omar
	 * @return the price
	 *************************************************************/
	public double getPrice() 
	{
		return price;
	} // end getPrice

	/*************************************************************
	 * @author Josh, Marcos, Omar
	 * @param price / the price to set
	 *************************************************************/
	public void setPrice(double price) 
	{
		if (price <= 0)
		{
			System.out.println("Invalid price, must be greater than 0.");
		} // end if
		else
		{
			this.price = price;
		} // end else
	} // end setPrice

	/**************************************************************
	 * @author Josh, Marcos, Omar
	 * @return the weight
	 **************************************************************/
	public int getWeight() 
	{
		return weight;
	} // end getWeight

	/**************************************************************
	 * @author Josh, Marcos, Omar
	 * @param weight / the weight to set
	 **************************************************************/
	public void setWeight(int weight) 
	{
		this.weight = weight;
	} // end setWeight

	/**************************************************************
	 * @author Josh, Marcos, Omar
	 * @return the stock
	 **************************************************************/
	public int getStock() 
	{
		return stock;
	} // end getStock

	/***************************************************************
	 * @author Josh, Marcos, Omar*
	 * @param stock / the stock to set
	 ***************************************************************/
	public void setStock(int stock) 
	{
		this.stock = stock;
	} // end setStock
	
} // end of Item class
