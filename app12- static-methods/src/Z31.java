class Z31 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test() + test() + test());
		System.out.println("main end");
	}
	public static int test() 
	{
		System.out.println("from test");
		return 10;
	}
}
