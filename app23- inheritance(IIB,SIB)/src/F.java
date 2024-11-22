class A
{
	int p;
}
class  F extends A
{
	int q;
	void test()
	{
		System.out.println(p);
		System.out.println(q);
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test();
		System.out.println("done");
	}
}
