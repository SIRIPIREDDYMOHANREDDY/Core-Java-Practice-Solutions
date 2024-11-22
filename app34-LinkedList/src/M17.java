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
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
		ListNode ans = dummy;
		while(list1 != null && list2 != null)
		{
			if(list1.val < list2.val)
			{
				ans.next = list1;
				list1 = list1.next;
			}
			else
			{
				ans.next = list2;
				list2 = list2.next;
			}
			ans = ans.next;
		}
		if(list1 == null)
		{
			ans.next = list2;
		}
		if(list2 == null)
		{
			ans.next = list1;
		}
		return dummy.next;
    }
}
class  M17
{
	public static void main(String[] args) 
	{
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(9);
		list1.read();

		LinkedList list2 = new LinkedList();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		list2.read();

		LinkedList list3 = new LinkedList();
		list3.first = list1.mergeTwoLists(list1.first, list2.first);
		list3.read();
	}
}