class A
{
	A()
	{
		System.out.println("A()");
	}

	{
		System.out.println("A-IIB");
	}
}
class  B extends A
{   
	B()
	{
		System.out.println("B()");
	}

	{
		System.out.println("B-IIB");
	}
}
class C
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("-----------");
		B b1 = new B();
	}
}
