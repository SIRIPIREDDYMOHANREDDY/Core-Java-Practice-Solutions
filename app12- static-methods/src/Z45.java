class Z45
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		test(i);         // pass by value
		System.out.println("main end:" + i);
	}
	public static void test(int i)
	{
		System.out.println("test:" + i);
		i = 20;
	}
}
