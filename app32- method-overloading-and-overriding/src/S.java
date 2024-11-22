class A
{
	final void test()     // final methods can't be overrided. 
	{              
		System.out.println("A-test()");
	}
}
class B extends A
{
	void test()
	{
		System.out.println("B-test()");
	}
}
class S
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
