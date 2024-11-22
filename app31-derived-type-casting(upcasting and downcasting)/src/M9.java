class M9 
{
	static void test(Object obj)
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		test(new A());
		test(new C());
		D d1 = null;
		test(d1);
		test("abc");
		test(90);
		test(9.0);
		test(false);
		test('r');
		System.out.println("done");
	}
}
