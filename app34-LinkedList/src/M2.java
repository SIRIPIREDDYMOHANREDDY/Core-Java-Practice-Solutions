class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		A a2 = new A(20);
		A a3 = new A(30);

		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
	}
}
