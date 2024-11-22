class A   // method overloading - using same name for all methods but change in the no.of arguments or change in argument data type
{
	void test()
	{
		System.out.println("test");
	}
	void test(int i)
	{
		System.out.println("test(int)");
	}
	void test(double i)
	{
		System.out.println("test(double)");
	}
	void test(boolean i)
	{
		System.out.println("test(boolean)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test();
		a1.test(10);
		a1.test(1.0);
		a1.test(true);
		System.out.println("Hello World!");
	}
}
