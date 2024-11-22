class ListNode
{
	int val;
	ListNode ref;
	ListNode(int val) {
		this.val = val;
	}
}
class LinkedList
{
	ListNode first;
	ListNode last;
	void add(int val) {
		ListNode n1 = new ListNode(val);
		if(first == null) {
			first = n1;
		}
		else {
			last.ref = n1;
		}
		last = n1;
	}
	void read() {
		ListNode current = first;
		while(current != null) {
			System.out.print(current.val + ", ");
			current = current.ref;
		}
		System.out.println();
	}
	int size() {
		int size = 0;
		ListNode current = first;
		while(current != null) {
			size++;
			current = current.ref;
		}
		return size;
	}
}
class M1 
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
		System.out.println(list.size());
	}
}
