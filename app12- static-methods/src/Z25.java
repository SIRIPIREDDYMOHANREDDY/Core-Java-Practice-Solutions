class Z25 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double d1 = test();
		System.out.println("main end:" + d1);
	}
	public static double test()
	{
		System.out.println("from test");
		return 23;
	}
}