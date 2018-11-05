// Joshua Luttmer, Marcos Del Toro, Omar Arias

public class Item {
	private String name;
	private int itemNum;
	private double price;
	private int weight;
	private int stock;
	
	
	public Item()
	{
		name = null; // item name
		itemNum = 0000; // item number or barcode
		price = 0.00; // sales price of item
		weight = 0; // item weight in oz
		stock = -100; // amount of item in inventory
	}

	/**************************************************************
	 * @author Josh
	 * @param name // item name
	 * @param itemNum // item number or barcode
	 * @param price // sales price of item
	 * @param weight // item weight in oz
	 * @param stock // amount of item in inventory
	 **************************************************************/
	public Item(String name, int itemNum, double price, int weight, int stock) {
		super();
		this.name = name;
		this.itemNum = itemNum;
		this.price = price;
		this.weight = weight;
		this.stock = stock;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [name=" + name + ", itemNum=" + itemNum + ", price=" + price + ", weight=" + weight + ", stock="
				+ stock + "]";
	}

	/***********************************************************
	 * @author Josh, Marcos, Omar
	 * @return the name
	 ***********************************************************/
	public String getName() 
	{
		return name;
	}

	/***********************************************************
	 * @author Josh, Marcos, Omar
	 * @param name the name to set
	 ***********************************************************/
	public void setName(String name) 
	{
		this.name = name;
	}

	/************************************************************
	 * @author Josh, Marcos, Omar
	 * @return the itemNum
	 ************************************************************/
	public int getItemNum() 
	{
		return itemNum;
	}

	/************************************************************
	 * @author Josh, Marcos, Omar
	 * @param itemNum the itemNum to set
	 ************************************************************/
	public void setItemNum(int itemNum) 
	{
		this.itemNum = itemNum;
	}

	/*************************************************************
	 * @author Josh, Marcos, Omar
	 * @return the price
	 *************************************************************/
	public double getPrice() 
	{
		return price;
	}

	/*************************************************************
	 * @author Josh, Marcos, Omar
	 * @param price the price to set
	 *************************************************************/
	public void setPrice(double price) 
	{
		if (price <= 0)
		{
			System.out.println("Invalid price, must be greater than 0.");
		}
		else
		{
			this.price = price;
		}
	}

	/**************************************************************
	 * @author Josh, Marcos, Omar
	 * @return the weight
	 **************************************************************/
	public int getWeight() 
	{
		return weight;
	}

	/**************************************************************
	 * @author Josh, Marcos, Omar
	 * @param weight the weight to set
	 **************************************************************/
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}

	/**************************************************************
	 * @author Josh, Marcos, Omar
	 * @return the stock
	 **************************************************************/
	public int getStock() 
	{
		return stock;
	}

	/***************************************************************
	 * @author Josh, Marcos, Omar*
	 * @param stock the stock to set
	 ***************************************************************/
	public void setStock(int stock) 
	{
		this.stock = stock;
	}
	
} // end of Item class
