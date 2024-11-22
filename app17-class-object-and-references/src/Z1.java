class A
{
	int i;
}
class Z1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("main1:" + a1.i);
		a1.i = 5;
		test1(a1);
		System.out.println("main2:" + a1.i);
		a1.i += 5;
		test2(a1);
		System.out.println("main3:" + a1.i);
	}
	static void test1(A ref)
	{
		System.out.println("test1:" + ref.i);
		ref.i += 10; 
	}
	static void test2(A ref)
	{
		System.out.println("test2:" + ref.i);
		ref.i += 20; 
	}
}
