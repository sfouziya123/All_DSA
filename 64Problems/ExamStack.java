//Using this array implements a stack with push and pop and display.
class ExamStack
{
	static Node top;
	static void push(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if(top == null)
		{
			top = temp;
			return;
		}
		temp.next = top;
		top = temp;
		return;	
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
	public static void main(String[] args)
	{ 
		ExamStack.push(20);
		ExamStack.push(40);
		ExamStack.push(60);
		ExamStack.push(80);
		ExamStack.push(100);
		ExamStack.push(120);
		ExamStack.pop();
		ExamStack.pop();
		
		
		ExamStack.display();
	}
}
class Node
{
	int data;
	Node next;
}


