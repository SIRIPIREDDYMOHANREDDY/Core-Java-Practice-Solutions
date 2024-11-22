class A
{
	int i;
	A next;
	A(int i)
	{
		this.i = i;
	}
}
class M3 
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		A a2 = new A(20);
		A a3 = new A(30);
		a1.next = a2;
		a2.next = a3;
		System.out.println(a1.i);
		System.out.println(a1.next.i);
		System.out.println(a1.next.next.i);
	}
}
