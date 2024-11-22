class M32 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		c1.test1();
		c1.test2();
		c1.test3();

		B b1 = new C();
		System.out.println(b1.i);
		System.out.println(b1.j);
		// System.out.println(b1.k);
		b1.test1();
		b1.test2();
		// b1.test3();
	}
}
