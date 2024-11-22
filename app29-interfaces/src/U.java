interface A
{
	void test1();
}
interface B
{
	void test2();
}
interface C extends A, B
{
	void test3();
}
interface D
{
	void test4();
}
class E 
{
	void test5()
	{
		System.out.println("E-test5");
	}
}
class  U extends E implements C, D
{
	public void test1()
	{
		System.out.println("U-test1");
	}
	public void test2()
	{
		System.out.println("U-test2");
	}
	public void test3()
	{
		System.out.println("U-test3");
	}
	public void test4()
	{
		System.out.println("U-test4");
	}
	public static void main(String[] args) 
	{
		U u1 = new U();
		u1.test1();
		u1.test2();
		u1.test3();
		u1.test4();
		u1.test5();
		System.out.println("Hello World!");
	}
}
