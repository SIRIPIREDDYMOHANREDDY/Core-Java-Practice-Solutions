abstract class A
{
	abstract void test();     // abstract method should be overrided.
}
class B extends A
{
	void test()
	{
		System.out.println("B-test()");
	}
}
class T
{
	public static void main(String[] args) 
	{
        B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
