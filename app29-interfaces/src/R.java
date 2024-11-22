interface A
{
	void test1();
}
class B
{
	void test2()
	{
		System.out.println("B-test2");
	}
}
class  R extends B implements A
{
	public void test1()
	{
		System.out.println("A-test1");
	}
	public static void main(String[] args) 
	{
		R r1 = new R();
		r1.test1();
		r1.test2();
		System.out.println("Hello World!");
	}
}
