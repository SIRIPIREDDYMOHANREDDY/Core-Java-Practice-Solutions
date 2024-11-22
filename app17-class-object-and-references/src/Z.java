class A
{
	int i;
}
class Z
{
	static void test(A ref) 
	{
		System.out.println("test:" + ref.i);
		ref.i += 5;
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("main1:" + a1.i);
		a1.i = 10;
		test(a1);
		System.out.println("main2:" + a1.i);
		a1.i += 10;
		test(a1);
		System.out.println("main3:" + a1.i);
		a1.i += 20;
		test(a1);
		System.out.println("main3:" + a1.i);
	}
}
