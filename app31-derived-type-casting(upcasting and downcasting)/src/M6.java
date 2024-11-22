class M6 
{
	static void test(B b1)
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		test(new C());   //  test((B) new C());
		test(new D());
		C c1 = null;
		D d1 = null;
		test(c1);
		test(d1);      // test((B) d1)
		System.out.println("Hello World!");
	}
}
