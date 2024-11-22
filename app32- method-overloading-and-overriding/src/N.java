class A
{
	int test()
	{
		System.out.println("A-test");
		return 10;
	}
}
class B extends A
{
	double test()
	{
		System.out.println("B-test");
		return 1.0;
	}
}
class  N
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
