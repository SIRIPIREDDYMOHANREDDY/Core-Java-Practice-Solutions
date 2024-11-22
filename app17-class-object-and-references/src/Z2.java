class A
{
	int i;
}
class B
{
	static void test(A arg)
	{
		System.out.println("test:" + arg.i);
		arg.i += 5;
	}
}
class  Z2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		System.out.println("main1:" + a1.i);
		B.test(a1);
		System.out.println("main2:" + a1.i);
	}
}
