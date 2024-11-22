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
	public boolean isPalindrome(ListNode head) {
		// 1. divide list into to parts
		ListNode oneStep = head;
		ListNode twoSteps = head;
		ListNode prev = head;
		while(twoSteps != null && twoSteps.next != null)
		{
			prev = oneStep;
			oneStep = oneStep.next;
			twoSteps = twoSteps.next.next;
		}
		prev.next = null;                             
		ListNode first = head;
		ListNode second = oneStep;
		// 2. reverse 2nd half
		second = makeReverse(second);         
		// 3. compare 1st half with reversed 2nd half
		while(first != null && second != null)
		{
			if(first.val != second.val)
			{
				return false;
			}
			first = first.next;
			second = second.next;
		}
		return true;
	}
	private ListNode makeReverse(ListNode head)
	{
		ListNode current = head;
		ListNode ans = null;
		ListNode temp;
		while(current != null)
		{
			temp = current.next;
			current.next = ans;
			ans = current;
			current = temp;
		}
		return ans;
	}
}
class  M21
{
	public static void main(String[] args) 
	{
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.read();
		System.out.println(list1.isPalindrome(list1.first));

		LinkedList list2 = new LinkedList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(2);
		list2.add(2);
		list2.add(1);
		list2.read();
		System.out.println(list2.isPalindrome(list2.first));
	}
}