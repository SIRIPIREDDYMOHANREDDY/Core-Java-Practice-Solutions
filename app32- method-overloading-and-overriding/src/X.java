class A
{
	static void test()
	{
		System.out.println("A-test");
	}
	static
	{
		System.out.println("A-SIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("SIB");
	}
}
class  X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B.test();
        System.out.println("main end");
	}
}
