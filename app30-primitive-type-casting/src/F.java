class F 
{
	static void test(double i)
	{
		System.out.println("test:" + i);
	}
	public static void main(String[] args) 
	{
		int i = 10;
		test(i);       // test((double) i);
		System.out.println("main:" + i);
	}
}
