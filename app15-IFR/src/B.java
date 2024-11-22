class B 
{
	static int i;

	static 
	{
		test();
	}
	static void test()
	{
		System.out.println(B.i); // indirect read
		B.i = 10; // indirect write
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
