class A
{
	int i;
	A next;
	A(int i)
	{
		this.i = i;
	}
}
class M6 
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		a1.next = new A(20);
		a1.next.next = new A(30);
		A current = a1;
	//	System.out.println(current);
		while(current != null)
		{
			System.out.println(current.i);
			current = current.next;
		}
	}
}
// one refernce variable refer only one object at a time.