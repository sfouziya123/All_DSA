public class Pop
{
	static Node top;

	static void pop(int data)
	{
		Node temp = new Node();
		temp.data = data;

		if(top == null)
		{
			top = temp;
			return;
		}

		temp.next = top;
		top = temp;
	}
	static void pop()
	{
		if(top == null)
		{
			return;	
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		temp = null;
		
	}
	static void display()
	{
		Node temp = top;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String [] args)
	{
		Pop.pop(2);
		Pop.pop(4);
		


		Pop.display();
	}
}
class Node
{
	int data;
	Node next;
}
