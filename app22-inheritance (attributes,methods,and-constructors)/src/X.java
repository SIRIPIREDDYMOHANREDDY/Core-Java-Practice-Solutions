class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class  B extends A
{
	B()
	{
		super(9);
		System.out.println("B()");
	}
	B(int i)
	{
		super(9);
		System.out.println("B(int)");
	}
}
class X
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("------------");
		B b2 = new B(90);
	}
}
