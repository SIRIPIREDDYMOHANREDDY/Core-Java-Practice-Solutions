class M43 
{
	static void test(A a1)
	{
		if (a1 instanceof D)
		{
			System.out.println("we can convert to D type");
			D d1 = (D) a1;
			System.out.println(d1.i);
			System.out.println(d1.j);
			System.out.println(d1.k);
			System.out.println(d1.l);
			d1.test1();
			d1.test2();
			d1.test3();
			d1.test4();
		}

		if (a1 instanceof C)
		{
			System.out.println("we can convert to C type");
			C c1 = (C) a1;
			System.out.println(c1.i);
			System.out.println(c1.j);
			System.out.println(c1.k);
			c1.test1();
			c1.test2();
			c1.test3();
		}

		if (a1 instanceof B)
		{
			System.out.println("we can convert to B type");
			B b1 = (B) a1;
			System.out.println(b1.i);
			System.out.println(b1.j);
			b1.test1();
			b1.test2();
		}

		if (a1 instanceof A)
		{
			System.out.println("we can convert to A type");
			A a2 = (A) a1;
			System.out.println(a2.i);
			a2.test1();
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
