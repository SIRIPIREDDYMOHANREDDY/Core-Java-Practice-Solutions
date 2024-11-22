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
	boolean delete(int val)
	{
		boolean flag = false;
		if(first == null)
		{
			return flag;
		}
		if(first.val == val)
		{
			first = first.next;
			return true;
		}
		ListNode prev = first;
		ListNode current = first.next;
		while(current != null)
		{
			if(current.val == val)
			{
				flag = true;
				prev.next = current.next;
				break;
			}
			prev = current;
			current = current.next;
		}
		// prev.next = current.next; 
		return flag;
	}
}
class  M12
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.read();
		System.out.println(list.delete(30));
		list.read();
		System.out.println(list.delete(140));
		list.read();
	}
}
