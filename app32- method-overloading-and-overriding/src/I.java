class I 
{
	void test()
	{
		System.out.println("I-test()");
	}
	void test(int i)
	{
		System.out.println("I-test(int)");
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test();       // binding with 1st method
		obj.test(10);     // binding with 2nd method
		System.out.println("done");
	}
}
