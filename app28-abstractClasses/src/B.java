class P
{
	void test1()
	{
		System.out.println("P-test1");
	}
	void test2()
	{
	}
}
class B  // class P & class B are concrete classes 
{
	void test3()
	{
	}
	public static void main(String[] args) 
	{
		P p1 = new P();
		B b1 = new B();
		p1.test1();
		p1.test2();
		b1.test3();
		System.out.println("Hello World!");
	}
}
