class A
{
	int p;
}
class  H
{
	A a1;  
	int q;

	void test()
	{
		System.out.println(a1.p);
		System.out.println(q);
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test();
		System.out.println("done");
	}
}
