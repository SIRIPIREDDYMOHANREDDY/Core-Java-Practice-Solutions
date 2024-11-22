class P 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main1:" + i);
		i = 20;
		System.out.println("main2:" + i);
		test();
		System.out.println("main3:" + i);
	}
	public static void test()
	{
		// int i;
		System.out.println("test:" + i);
		i = 30;
	}
}
