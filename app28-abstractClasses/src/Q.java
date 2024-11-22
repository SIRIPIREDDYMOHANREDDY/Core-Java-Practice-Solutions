abstract class A
{
	abstract void test1();
	
	void test2()
	{
		System.out.println("A-test2");
	}
}
class  Q extends A
{
	void test1()
	{
		System.out.println("Q-test1");
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.test1();
		q1.test2();
		System.out.println("done");
	}
}
