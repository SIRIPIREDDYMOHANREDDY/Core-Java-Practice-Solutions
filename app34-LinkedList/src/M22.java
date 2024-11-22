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
	public ListNode oddEvenList(ListNode head) {
        int i = 1;
		ListNode current = head;
		ListNode oddStart = new ListNode(-1);
		ListNode evenStart = new ListNode(-1);
		ListNode oddPointer = oddStart;
		ListNode evenPointer = evenStart;
		while(current != null)
		{
			if(i % 2 == 1)
			{                                      
				oddPointer.next = current;
				oddPointer = oddPointer.next;
				if(current.next == null) {
					evenPointer.next = null;
				}                             
			}
			else
			{
				evenPointer.next = current;
				evenPointer = evenPointer.next;
				if(current.next == null) {
					oddPointer.next = null;
				}
			}
			i++;
			current = current.next;
		}
		oddPointer.next = evenStart.next;
		return oddStart.next;
    }
}
class  M22
{
	public static void main(String[] args) 
	{
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(6);
		list1.add(5);
		list1.add(1);
		list1.add(11);
		list1.add(12);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		list1.read();
		list1.first = list1.oddEvenList(list1.first);
		list1.read();
	}
}