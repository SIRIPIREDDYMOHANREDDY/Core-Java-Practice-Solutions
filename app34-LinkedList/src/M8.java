class Node
{
	int data;
	Node ref;
	Node(int data)
	{
		this.data = data;
	}
}

class LinkedList
{
	Node first;
	Node last;
	void add(int data)
	{
		Node n1 = new Node(data);
		if(first == null)
		{
			first = n1;
		}
		else
		{
			last.ref = n1;
		}
		last = n1;
	}
	void read()
	{
		Node current = first;
		while(current != null)
		{
			System.out.print(current.data + ", ");
			current = current.ref;
		}
	}
}
class  M8
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.read();
	}
}
