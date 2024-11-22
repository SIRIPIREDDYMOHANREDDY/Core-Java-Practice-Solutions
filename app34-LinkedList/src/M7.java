class A
{
	int i;
	A next;
	A(int i)
	{
		this.i = i;
	}
	void add(int i)
	{
		A last = this;
		while(last.next != null)
		{
			last = last.next;
		}
		last.next = new A(i);
	}
}
class M7 
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		//A a2 = new A(10);

		A current = a1;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.next;
		}
	}
}
