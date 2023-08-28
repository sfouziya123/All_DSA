//Node insert

/*class Node
{
	int data;
	Node next;
}
	public static Node insert(Node start,int data)
	{
		Node temp = new Node();
		temp data = data;
		temp.next = null;
		
		if(start == null)
		{
			return temp;
		}
		Node traverse = start;
		while(traverse.next != null)
		{
			traverse = traverse.next;
			
		}
	}*/
	
class Node{
    int data;
    Node next;
}

public class nodeInsert{
    static Node previous = null;
    static Node current = null;
    static Node first = null;
    
    public static void insert ( int data ){
   	 Node temp = new Node();
   	 temp.data = data;
   	 temp.next = null;
   	 
   	 if( first == null ){
   		 first = temp;
   		 return;
   	 }
   	 else{
   		 current = first;
   		 while ( current != null && current.data < temp.data ){
   		      previous = current;
   		      current = current.next;
   		  }
   	 }
   	 
   	 //insert first
   	 
   	 if( current == null && previous == null && first != null ){
   		 temp.next = first;
   		 first = temp;
   		 return;
   	 }
   	 
   	 if( current != null && previous == null ){
   		 temp.next = current;
   		 first =temp;
   	 }
   	 
   	 //insert middle
   	 
   	 if( previous != null && current != null ){
   	      previous.next = temp;
   	      temp.next = current;
   	      return;
   	 }
   	 
   	 //insert end
   	 
   	 if( current == null && previous != null ){
   		 previous.next = temp;
   		 temp = current;
   		 return;
	 }
    
    }
    
    public static Node reverse (Node first){
    	if(first == null || first.next == null){
    		return first;
    	}
    	Node previous = first;
    	Node current = previous.next;
    	previous.next = null;
    	while(current != null){
    		Node temp = current;
    		current = current.next;
    		temp.next = previous;
    		previous = temp;
    	}
    	return previous;
    	
    }
    public static void middleElement(Node start){
    	if(start == null){
    		System.out.println("Empty List");
    		return;
    	}
    	Node traverse = start;
    	int length = 0;
    	while(traverse != null){
    		length++;
    		traverse = traverse.next;
    	}
    	int middle = length/2;
    	int position = 0;
    	traverse = start;
    	while(position != middle){
    		position++;
    		traverse = traverse.next;
    	}
    	System.out.println(traverse.data);
    }
    /*public static Node deleteNode(int delete, Node start){
    	Node previous = null;
    	Node current = start;
    	if(start == null){
    		return null;
    	}
    	while(current != null && current.data != delete){
    		previous = current;
    		current = current.next;
    	}
    	if(current == null){
    		System.out.println("No Data");
    		return start;
    	}
    	if(previous == null){
    		start = start.next;
    		return start;
    	}
    	previous.next = current.next;
    	return start;
    }*/
    
    
    public static void remove(int data){
    	System.out.println(data);
    	current = first;
    	previous = null;
    	// traverse until you find data in the list
    	while(current != null && current.data != data){
        	previous = current;
        	current = current.next;
    	}
    	// condition #1
   	if(previous == null && current == null){
        	System.out.println("No nodes in the list");
        	return;
    	}
    	// condition #2
    	// we went until the end and couldn't find data
    	if(previous != null && current == null){
        	System.out.println("Data not found in the list");
        	return;
    	}
    	// Node to be deleted is the first node
    	// condition #3
    	if(previous == null && current != null){
		first = current.next;
		current.next = null;
		current = null;
		return;
	}
    	// Node to be deleted is in the middle or last
    	// condition #4
    	if(previous != null && current != null){
       		previous.next = current.next;
       		current.next = null;
       		current = null;
    	}
    }  
    
    public static void display(){
   	 Node traverse = first;
   	 while ( traverse != null ){
   		 System.out.println( traverse.data );
   		 traverse = traverse.next;
   	 }
    }
    
    public static void main ( String[] args){
    	 System.out.println("Linked List : ");
   	 nodeInsert.insert(1);
   	 nodeInsert.insert(2);
   	 nodeInsert.insert(4);
   	 nodeInsert.insert(6);
   	 nodeInsert.insert(7);
   	 nodeInsert.insert(8);
   	 nodeInsert.insert(9);
   	 nodeInsert.insert(10);
   	 nodeInsert.display();
   	 //System.out.print("nandu");
   	 first = nodeInsert.reverse(first);
   	 System.out.println("Reverse Linked List : ");
   	 nodeInsert.display();
   	 System.out.println("Middle Element : ");
   	 nodeInsert.middleElement(first);
   	 //LinkedList.display();
   	 System.out.println("Delete Node :");;
   	 nodeInsert.remove(10);
   	 System.out.println("Final Linked List :");
   	 nodeInsert.display();
    
    }
}	
	
