
public class LinkedList
{
	private Node head;

	public LinkedList()
	{
		this.head = null;
	}
	/**
	 * @param head
	 */
	public LinkedList(Node head)
	{
		this.head = head;
	}
	
	public void addToHead(Node newNode)
	{
		newNode.setLink ( head );
		head = newNode;
	}
	public void printLinkList ()
	{
		Node current;
		current = head;
		
		while (current != null)
		{
			System.out.println ( current.toString ( ) );
			current = current.getLink ( );
			
		}
		
	} // End printLinkList
	/**
	 * @return the head
	 */
	public Node getHead( )
	{
		return head;
	}
	/**
	 * @param head the head to set
	 */
	public void setHead( Node head )
	{
		this.head = head;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString( )
	{
		return "LinkList [head=" + head + "]";
	}
	
	
}