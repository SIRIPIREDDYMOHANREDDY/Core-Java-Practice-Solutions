class M16 
{
	static void test(C c1)
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		A a1 = new D();
		test((C) a1);
		System.out.println("Hello World!");
	}
}
