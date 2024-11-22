class Z48
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main begin:" + i);
		test(i++ + i);
		//test(10 + 11) i = 11
		//test(21)
		System.out.println("main end:" + i);
	}
	public static void test(int i) 
	{
		System.out.println("from test:" + i);
		i += 30;
	}
}
