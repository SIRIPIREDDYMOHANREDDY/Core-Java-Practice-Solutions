class ListNode
{
	int val;
	ListNode next;

	ListNode(int val)
	{
		this.val = val;
	}
}
class LinkedList
{
	ListNode first;
	ListNode last;

	void add(int val)
	{
		ListNode n1 = new ListNode(val);
		if(first == null)
		{
			first = n1;
		}
		else
		{
			last.next = n1;
		}
		last = n1;
	}
	void read()
	{
		ListNode current = first;
		while(current != null)
		{
			System.out.print(current.val + ", ");
			current = current.next;
		}
		System.out.println();
	}
	void update(int oldVal, int newVal)
	{
		ListNode current = first;
		while(current != null)
		{
			if(current.val == oldVal)
			{
				current.val = newVal;
				break;
			}
			current = current.next;
		}
	}
}
class  M10
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.read();
		list.update(40, 4000);
		list.read();
	}
}
