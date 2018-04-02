public class MyList {
    
    private static Node head;
    
    public void add(int number)
	{
	    Node added = new Node(number);
	    if (head == null)
	    {
	        head = added;
	    }
	    else
	    {
	        Node temp = head;
		    while(temp.next != null)
		    {
			    temp = temp.next;
		    }
		    
		    temp.next = added;
	    }
	}
	
	public int get(int index)
	{
		Node temp = head;
		for(int i=0; i<index; i++)
		{
			temp = temp.next;
		}
		
		return temp.getNumber();
	}
    
    class Node
	{
		private Node next;
		private int number;
		
		public Node(int number)
		{
			this.number = number;
		}
		
		public int getNumber()
		{
			return number;
		}
	}
}