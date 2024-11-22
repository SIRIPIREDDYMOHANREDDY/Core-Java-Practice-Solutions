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
	public ListNode deleteMiddle(ListNode head) {
        ListNode oneStep = head;
        ListNode twoSteps = head;
		ListNode prev = null;
		while(twoSteps != null && twoSteps.next != null)
		{
			prev = oneStep;
			oneStep = oneStep.next;
			twoSteps = twoSteps.next.next;
		}
		if(prev == null)
		{
			return null;
		}
		prev.next = oneStep.next;
		return head;
    }
}
class  M15
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
		//list.add(70);
		list.read();
		list.first = list.deleteMiddle(list.first);
		list.read();
	}
}