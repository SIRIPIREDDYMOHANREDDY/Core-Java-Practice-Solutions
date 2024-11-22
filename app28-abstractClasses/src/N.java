abstract class A
{
	void test1()
	{
		System.out.println("A-test1");
	}
	abstract void test2();
}

class  N extends A
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
