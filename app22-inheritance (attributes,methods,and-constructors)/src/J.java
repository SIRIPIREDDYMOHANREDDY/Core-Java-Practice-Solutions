class A
{
	static void test1()
	{
		System.out.println("A-test1");
	}
}
class  J extends A
{
	static int p;
	public static void main(String[] args) 
	{
		System.out.println(J.p);
		J.test1();
		System.out.println("main end");
	}
}
