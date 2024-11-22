class A
{
	void test()     // non-static can be override with non-static only.
	{               // static can be override with static only.
		System.out.println("A-test()");
	}
}
class B extends A
{
	static void test()
	{
		System.out.println("B-test()");
	}
}
class R
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test();
        B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
