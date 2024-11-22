class M3 
{
	static void test1(C c1)
	{
		System.out.println("test1");
	}
	public static void main(String[] args) 
	{
        C c1 = new C();
		C c2 = null;
		test1(c1);
		test1(c2);
		test1(new C());
		System.out.println("done");
	}
}
