class Linklist
{
	static Node previous = null;
	static Node current = null;
	static Node first = null;

	public static void insert(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;

		if (first == null) 
		{
			first = temp;
			return;
		} 
		else
		{
			current = first;
			while (current != null && current.data < temp.data)
			{
				previous = current;
				current = current.next;
			}
		}
		
		//first inserting
	 	if (current == null && previous == null && first != null)
		{
			temp.next = first;
			first = temp;
			return;
		}

		//last inserting
		if(previous != null && current == null)
		{
			previous.next = temp;
			temp = current;
			return ;
		}
		
		//first inserting
		if(previous == null && current != null)
		{
			temp.next = current;
			current = temp;
			return;
		}
		
		// middle inserting
		if(previous != null && current != null)
		{
			previous.next = temp;
			temp.next = current;
			return;
		}
	}
	static void delete( int data)
	{
		//traverse the Node
		previous = null;
		current = first;
		
		
		while(current != null && current.data != data)
		{
			previous = current;
			current = current.next;
		}
		if(previous == null && current == null)
		{
			System.out.println("Their is no nodes to print the output");
			return;		
		}
		if(previous != null && current == null)
		{
			System.out.println("Not found");
			return;
		}
		
		//first node will be deleted  
		if(previous == null && current != null)
		{
			first = current.next;
			current.next = null; 
			current = null;
		}
		//Middle node will be deleted
	        if(previous != null && current != null)
	        {
			previous.next = current.next;
			current.next = null;
			current = null;	
		}
			
	}
	
	//Reverse Linklist
	public static Node reverse(Node first)
	{
		if( first == null || first.next == null)
		{
			return first;
		}
		Node previous = null;
		Node current = first;
		 
		while(current != null )
		{
			Node temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;  
		}
		return previous;
	}
	
	//Middle Element
	public static void middle(Node start)
	{
		if(start == null)
		{
			return;
		}
		Node traverse = start;
		int length = 0;
		while(traverse != null)
		{
			length++;
			traverse = traverse.next;
		}
		int middle = length/2;
		int position = 0;
		traverse = start;
		while(position != middle)
		{
			position++;
			traverse = traverse.next;
		}
		System.out.println(traverse.data);
	}
	
	
	public static void display()
	{
		Node tempe = first;
		while (tempe != null)
		{
			System.out.print(tempe.data + " ");
			tempe = tempe.next;
		}
	}

	public static void main(String[] args)
	{
		Linklist.insert(1);
		Linklist.insert(2);
		Linklist.insert(8);
		Linklist.insert(5);
		Linklist.insert(4);
		Linklist.insert(3);
		Linklist.insert(9);
		Linklist.insert(6);
		Linklist.insert(10);
		Linklist.insert(7);
		Linklist.delete(7);
		
		
		System.out.println("Middle Element : ");
		Linklist.middle(first);
		//System.out.println("Reverse Linklist :");
		//first = Linklist.reverse(first);
		Linklist.display();
	}

}
class Node
{
	int data;
	Node next;
}



