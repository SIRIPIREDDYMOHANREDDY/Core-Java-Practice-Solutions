class Z15
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		int s1 = test();
		System.out.println("main end:"+s1);
	}
	public static int test() 
	{
		System.out.println("test");
		return 34;
	}
}