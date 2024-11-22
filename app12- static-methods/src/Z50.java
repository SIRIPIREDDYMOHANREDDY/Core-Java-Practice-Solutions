class Z50
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main begin:" + i);
		test(i++ + i + i++ + i++ + i + ++i + i++);
		//test(10 + 11 + 11 + 12 + 13 + 14 + 14) i = 15
		//test(85)
		System.out.println("main end:" + i);
	}
	public static void test(int i) 
	{
		System.out.println("from test:" + i);
		i += 30;
	}
}
