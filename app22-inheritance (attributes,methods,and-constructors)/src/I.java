class A
{
	int p;	
	void test1()
	{
		System.out.println("A-test1");
	}
	void test2()
	{
		System.out.println("A-test2");
	}
}
class  I extends A
{
	void test3()
	{
		System.out.println("I-test3");
	}
	public static void main(String[] args) 
	{
		I obj1 = new I();
		System.out.println(obj1.p);
		obj1.test1();
		obj1.test2();
		obj1.test3();
	}
}
