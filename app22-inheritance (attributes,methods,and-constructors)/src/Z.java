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
		super(10);
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
}
class Z
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("-----------");
		B b2 = new B(90);
		System.out.println("-----------");
	}
}
