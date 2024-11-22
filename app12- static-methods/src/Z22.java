class Z22
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean i = test();
		System.out.println("main end:" + i);
	}
	static boolean test() 
	{
		System.out.println("from test");
		return false;
	}
}