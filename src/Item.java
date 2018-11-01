
public class Item {
	private String name;
	private int itemNum;
	private double price;
	private int weight;
	private int stock;
	
	public Item()
	{
		name = null;
		itemNum = 0000;
		price = 0.00;
		weight = 0;
		stock = -100;
	}

	/**
	 * @param name // item name
	 * @param itemNum // item number or barcode
	 * @param price // sales price of item
	 * @param weight // item weight in oz
	 * @param stock // amount of item in inventory
	 */
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

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * @return the itemNum
	 */
	public int getItemNum() 
	{
		return itemNum;
	}

	/**
	 * @param itemNum the itemNum to set
	 */
	public void setItemNum(int itemNum) 
	{
		this.itemNum = itemNum;
	}

	/**
	 * @return the price
	 */
	public double getPrice() 
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
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

	/**
	 * @return the weight
	 */
	public int getWeight() 
	{
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}

	/**
	 * @return the stock
	 */
	public int getStock() 
	{
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) 
	{
		this.stock = stock;
	}
	
} // end of Item class
