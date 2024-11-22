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
	boolean search(int val)
	{
		boolean flag = false;
		ListNode current = first;
		while(current != null)
		{
			if(current.val == val)
			{
				flag = true;
				break;
			}
			current = current.next;
		}
		return flag;
	}
}
class  M11
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
		System.out.println(list.search(40));
		System.out.println(list.search(140));
	}
}
