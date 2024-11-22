
class A
{
	static void test()
	{
		System.out.println("from test");
	}
}
class H
{
	public static void main(String[] args) 
	{
		System.out.println("main");
	    test();
	}
}
  // we cant call directly one class method in another class directly