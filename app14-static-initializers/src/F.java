class F 
{
	static int i = test();
	static
	{
		System.out.println("SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	public static int test() 
	{
		System.out.println("test");
		return 10;
	}
}
