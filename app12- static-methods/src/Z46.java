class Z46 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main begin:" + i);
		test(i++);
		System.out.println("main end:" + i);
	}
	public static void test(int i) 
	{
		System.out.println("from test:" + i);
		i++;
	}
}
