

public class Node
{
	private String itemOrdered;
	private int quantity;
	private Node link;
	
	public Node()
	{
		super ( );
		itemOrdered = "none";
		quantity = 0;
		link = null;
		
	}

	public Node(String itemOrdered, int quantity, Node link)
	{
		super ( );
		this.itemOrdered = itemOrdered;
		this.quantity = quantity;
		this.link = link;
	}

	/**
	 * @return the itemOrdered
	 */
	public String getItemOrdered( )
	{
		return itemOrdered;
	}

	/**
	 * @param itemOrdered the itemOrdered to set
	 */
	public void setItemOrdered( String itemOrdered )
	{
		this.itemOrdered = itemOrdered;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity( )
	{
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity( int quantity )
	{
		this.quantity = quantity;
	}

	/**
	 * @return the link
	 */
	public Node getLink( )
	{
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink( Node link )
	{
		this.link = link;
	}
	
	
	
	
	
	
	
}

