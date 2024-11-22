class A
{
	int i;
}

class  Z4
{
	public static void main(String[] args) 
	{
		A a1 = test();
		System.out.println("main:" + a1.i);
	}
	static A test()
	{
		A obj = new A();
		obj.i = 30;
		System.out.println("test:" + obj.i);
		return obj;
	}
}
