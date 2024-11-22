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
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode normalPointer = head;
		int i = 1;
        while(i <= n)
		{
			normalPointer = normalPointer.next;
			i++;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;
		ListNode lastNthNode = head;
		while(normalPointer != null)
		{
			prev = lastNthNode;
			lastNthNode = lastNthNode.next;
			normalPointer = normalPointer.next;
		}
		prev.next = lastNthNode.next;
		return dummy.next;
    }
}
class  M16
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
		list.add(70);
		list.read();
		list.first = list.removeNthFromEnd(list.first, 1);
//		list.first = list.removeNthFromEnd(list.first, 2);
//		list.first = list.removeNthFromEnd(list.first, 3);
//		list.first = list.removeNthFromEnd(list.first, 7);
		list.read();
	}
}