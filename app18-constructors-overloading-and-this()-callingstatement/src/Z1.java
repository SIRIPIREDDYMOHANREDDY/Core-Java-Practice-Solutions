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
class  Z1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("---------------");
		A a2 = new A(20);
		System.out.println("---------------");
	}
}
