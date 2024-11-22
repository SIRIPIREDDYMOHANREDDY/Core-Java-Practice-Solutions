class C 
{
	{
		System.out.println("C-IIB1");
	}

	C()
	{
		System.out.println("C()");
	}

	C(int i)
	{
		System.out.println("C(int i)");
	}

	{
		System.out.println("C-IIB2");
	}

	C(double i)
	{
		System.out.println("C(double)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("----------");
		C c2 = new C(20);
		System.out.println("----------");
		C c3 = new C(2.0);
		System.out.println("----------");
		System.out.println("main end");
	}
}
