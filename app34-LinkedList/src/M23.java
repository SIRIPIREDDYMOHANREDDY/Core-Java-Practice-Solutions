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
	public ListNode swapNodes(ListNode head, int k) {
		// 1. identify left side node
        int i = 1;
		ListNode p1 = head;
		while(i < k)
		{
			p1 = p1.next;
			i++;
		}
		ListNode first = p1;
												   
		// 2. identify right side node
		ListNode p2 = head;
		while(p1.next != null)
		{
			p1 = p1.next;				      
			p2 = p2.next;
		}
		ListNode second = p2;
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
		return head;
    }
}
class  M23
{
	public static void main(String[] args) 
	{
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list1.read();
		list1.first = list1.swapNodes(list1.first, 1);
		list1.read();
		list1.first = list1.swapNodes(list1.first, 2);
		list1.read();
		list1.first = list1.swapNodes(list1.first, 3);
		list1.read();
		list1.first = list1.swapNodes(list1.first, 4);
		list1.read();
	}
}