class I 
{
	int a;
	void test1()
	{
		System.out.println("test1:" + a);
		a += 10;
		test2();
		System.out.println("test2:" + a);
	}
	void test2()
	{
		System.out.println("test2:" + a);
		a += 20;
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.a = 5;
		System.out.println("main1:" + obj.a);
		obj.test1();
		System.out.println("main2:" + obj.a);
		obj.a += 5;
		obj.test2();
		System.out.println("main3:" + obj.a);
	}
}
// while using any non static member inside a another non static member compiler only provide we dont require use this 