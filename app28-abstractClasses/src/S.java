abstract class A
{
	void test1()
	{
		System.out.println("A-test1");
	}
	abstract void test2();
	abstract void test3();

}
abstract class B extends A 
{
    void test2()
	{
		System.out.println("B-test2");
	}
}
class S extends B
{
	void test3()
	{
		System.out.println("S-test3");
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.test1();
		s1.test2();
		s1.test3();
		System.out.println("done");
	}
}
