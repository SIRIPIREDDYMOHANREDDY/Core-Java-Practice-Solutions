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
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		while(current != null && current.next != null)
		{
			if(current.val == current.next.val)
			{
				current.next = current.next.next;
			}
			else
			{
				current = current.next;
			}
		}
		return head;
    }
}
class  M18
{
	public static void main(String[] args) 
	{
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(1);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		list1.add(4);
		list1.add(4);
		list1.add(4);
		list1.add(5);
		list1.add(5);
		list1.add(6);
		list1.add(6);
		list1.add(8);
		list1.add(20);
		list1.read();
		list1.deleteDuplicates(list1.first);
		list1.read();
	}
}