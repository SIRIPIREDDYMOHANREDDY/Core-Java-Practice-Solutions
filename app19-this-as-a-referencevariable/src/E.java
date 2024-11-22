class E 
{
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("main1:" + e1);
		e1.test();
		System.out.println("-----------");
		E e2 = new E();
		System.out.println("main2:" + e2);
		e2.test();
		System.out.println("-----------");
	}
	void test()
	{
		System.out.println("test:" + this);
	}
}
// inside a test method this is nothing but e1