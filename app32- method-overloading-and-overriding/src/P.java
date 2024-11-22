class K
{
}
class L extends K
{
}
class A
{
	K test()
	{
		System.out.println("A-test()");
		return null;
	}
}
class B extends A
{
	L test()
	{
		System.out.println("B-test()");
		return null;
	}
}
class  P
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
