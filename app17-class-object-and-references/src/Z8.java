class A
{
	int i;
}


class Z8 
{
	public static void main(String[] args) 
	{
		A a1 = test();
		System.out.println(a1.i);
		a1.i = 30;
		System.out.println(a1.i);
	}
	static A test()
	{
		return new A();
	}
}
