class A
{
	static int i;
	static
	{
		System.out.println("A-SIB");
		//i = 10;
	}
	static void test()
	{
		System.out.println("A-test");
	}
}
class B
{
	static int i;
	static
	{
		System.out.println("B-SIB");
	}
	static void test()
	{
		System.out.println("B-test");
	}
}
class L 
{
	static
	{
		System.out.println("L-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("---------");
		A.i = 20;
		System.out.println(A.i);
		A.test();
		B.test();
		System.out.println("----------");
		B.test();
		A.test();
		System.out.println(B.i);
		System.out.println(A.i);
		System.out.println("main end");
	}
}
