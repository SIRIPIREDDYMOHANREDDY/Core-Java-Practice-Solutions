class Z26 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String d1 = test();
		System.out.println("main end:" + d1);
	}
	public static String test()
	{
		System.out.println("from test");
		return "abc";
	}
}