class L 
{
	void test1()
	{
		System.out.println("from test1");
	}

	static void test2()
	{
		System.out.println("test2 begin");
		//test1();
		L obj = new L();
		obj.test1();
		System.out.println("test2 end");
	}
	public static void main(String[] args) 
	{
		test2();
		System.out.println("done");
	}
}
