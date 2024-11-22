class A
{
	int p;
}
class  I
{
	A a1 = new A();  //a1 not only declared also initialized
	int q;

	void test()
	{
		System.out.println(a1.p);
		System.out.println(q);
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test();
		System.out.println("done");
	}
}
