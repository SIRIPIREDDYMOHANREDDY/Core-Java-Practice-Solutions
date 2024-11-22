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
	A(double i)
	{
		System.out.println("A(double)");
	}
}
class Z2 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("------------");
		A a2 = new A();
		System.out.println("------------");
		A a3 = new A(10);
		System.out.println("------------");
		A a4 = new A(40);
		System.out.println("------------");
		A a5 = new A(1);
		System.out.println("------------");
		A a6 = new A(1.0);
		System.out.println("------------");
		A a7 = new A(30);
		System.out.println("------------");
		A a8 = new A();
		System.out.println("------------");
		A a9 = new A(8.9);
		System.out.println("------------");
	}
}
