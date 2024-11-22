class M42 
{
	static void test(A a1)
	{
		if (a1 instanceof C)
		{
			C c1 = (C) a1;
			System.out.println(c1.i);
			System.out.println(c1.j);
			System.out.println(c1.k);
			c1.test1();
			c1.test2();
			c1.test3();
		}
	}
	public static void main(String[] args) 
	{
		test(new D());
		System.out.println("------------");
		test(new C());
		System.out.println("------------");
		test(new B());
		System.out.println("------------");
		test(new A());
		System.out.println("------------");

	}
}
