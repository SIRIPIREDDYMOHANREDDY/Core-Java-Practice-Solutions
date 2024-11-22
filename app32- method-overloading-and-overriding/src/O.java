class P
{
}

class Q extends P
{
}

class A
{
	P test()
	{
		System.out.println("A-test");
		return null;
	}
}
class B extends A
{
	P test()
	{
		System.out.println("B-test");
		return null;
	}
}
class  O
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
