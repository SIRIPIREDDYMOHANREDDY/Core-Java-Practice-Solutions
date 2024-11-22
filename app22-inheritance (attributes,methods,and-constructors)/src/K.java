class A
{
	static void test1()
	{
		System.out.println("A-test1");
	}
	void test2()
	{
		System.out.println("A-test2");
	}
}
class  K extends A
{	
	void test3()
	{
		System.out.println("K-test3");
	}
	static void test4()
	{
		System.out.println("K-test4");
	}
	public static void main(String[] args) 
	{
		K.test1();
		K.test4();
		K obj = new K();
		obj.test2();
		obj.test3();

		System.out.println("done");
	}
}
