class Z24 
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
		return 3.4;// integer value can be used in place of double value
	}
}

