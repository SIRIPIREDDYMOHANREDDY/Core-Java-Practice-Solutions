class Z21
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println("main end");
	}
	static boolean test() 
	{
		System.out.println("from test");
		return false;
	}
}