
class A
{
	static void test()
	{
		System.out.println("from test");
	}
}
class I
{
	public static void main(String[] args) 
	{
		System.out.println("main");
	    A.test();
	}
}
 // this run successfully