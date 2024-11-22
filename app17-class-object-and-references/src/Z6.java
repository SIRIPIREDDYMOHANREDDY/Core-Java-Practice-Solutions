class A
{
	int i;
}

class Z6
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 20;
		System.out.println("main1:" + a1.i);
        A a2 = test1(a1);
		System.out.println("main2:" + a1.i);
		System.out.println("main3:" + a2.i);
	}
	static A test1(A obj)
	{
		System.out.println("test1:" + obj.i);
		A ref = new A();
        ref.i = obj.i + 30;  // 50
		obj.i += ref.i;      //70
		System.out.println("test2:" + ref.i);
		System.out.println("test3:" + obj.i);
		return ref;
	}
}
