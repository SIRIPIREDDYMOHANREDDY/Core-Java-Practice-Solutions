class A
{
	void test1()
	{
		System.out.println("A-test1");
	}
}
class  F extends A
{
	void test2()
	{
		System.out.println("A-test2");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test1();
		f1.test2();
		System.out.println("done");
	}
}
