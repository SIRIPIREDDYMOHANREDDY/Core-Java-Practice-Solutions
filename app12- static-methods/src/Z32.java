class Z32 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("sum:" + test() + test());
		System.out.println("------1111-----------");
		System.out.println(test() + test() + " is sum");
		System.out.println("------2222-----------");
		System.out.println("sum:" + (test() + test()));
		System.out.println("------3333-----------");
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("from test");
		return 10;
	}
}
