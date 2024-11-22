abstract class A
{
	abstract void test1();
	abstract void test2();
}
class  B extends A
{
	void test1()
	{
		System.out.println("B-test1");
	}
	void test2()
	{
		System.out.println("B-test2");
	}
}
class R
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		b1.test2();
		System.out.println("done");
	}
}
