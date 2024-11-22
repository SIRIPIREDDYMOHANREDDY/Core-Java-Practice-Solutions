class  A
{
	int i;
}

class  Z5
{
	public static void main(String[] args) 
	{
		A a1 = test1();
		System.out.println("main1:" + a1.i);
		A a2 = test2();
		System.out.println("main2:" + a2.i);
	}
	static A test1()
	{
		A obj = new A();
		obj.i = 10;
		System.out.println("test1:" + obj.i);
		return obj;
	}
	static A test2()
	{
		A obj = new A();
		obj.i = 20;
		System.out.println("test2:" + obj.i);
		return obj;
	}
}
