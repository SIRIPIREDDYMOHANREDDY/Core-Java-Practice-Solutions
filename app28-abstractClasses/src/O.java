abstract class A
{
	void test1()
	{
		System.out.println("A-test2");
	}
	abstract void test2();
}

abstract class O extends A 
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
