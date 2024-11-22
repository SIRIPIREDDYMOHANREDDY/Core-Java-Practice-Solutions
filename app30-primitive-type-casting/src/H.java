class H 
{
	static int test()
	{
		int i = 10;
		return i;
	}
	public static void main(String[] args) 
	{
		double d1 = test();  // double d1 = (double) test();
		System.out.println(d1);
	}
}
