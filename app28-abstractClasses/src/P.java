abstract class A
{
	void test1()
	{
		System.out.println("A-test1");
	}
	abstract void test2();
}
class  P extends A
{
	void test2()
	{
		System.out.println("P-test2");
	}
	public static void main(String[] args) 
	{
		P p1 = new P();
        p1.test1();
        p1.test2();
		System.out.println("done");
	}
}
