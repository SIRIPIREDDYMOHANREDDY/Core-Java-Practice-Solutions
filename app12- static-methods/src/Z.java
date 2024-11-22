class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test1 begin");
		if (true)
		{
			return;
		}
		System.out.println("test2 end");
	}
}
