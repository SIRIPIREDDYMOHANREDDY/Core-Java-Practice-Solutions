class A
{
	int i;
}
class Y
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("main1:" + a1.i);
		a1.i = 20;
		test(a1);  // pass by reference
		System.out.println("main2:" + a1.i);
	}
	static void test(A obj)
	{
		System.out.println("test:" + obj.i);
		obj.i = 40;
	}
}
//