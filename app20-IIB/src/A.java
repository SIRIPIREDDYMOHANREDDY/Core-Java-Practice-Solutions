class A 
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int i)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("-------------");
		A a2 = new A(10);
		System.out.println("-------------");
		A a3 = new A();
		System.out.println("-------------");
		A a4 = new A(40);
		System.out.println("-------------");
	}
}
