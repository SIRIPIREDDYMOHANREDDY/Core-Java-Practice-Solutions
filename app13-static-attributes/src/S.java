class S 
{
    static void test() 
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("-----------");
		S.test();
		System.out.println("main end");
	}
}
//static members  trateded as a class members