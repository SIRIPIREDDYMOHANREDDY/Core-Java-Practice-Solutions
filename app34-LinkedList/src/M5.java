class A
{
	int i;
	A next;
	A(int i)
	{
		this.i = i;
	}
}
class M5 
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		a1.next = new A(20);
		a1.next.next = new A(30);
		System.out.println(a1.i);
		System.out.println(a1.next.i);
		System.out.println(a1.next.next.i);
		System.out.println(a1.next.next.next.i);
	}
}
// In the Linkedlist last object reference is null.