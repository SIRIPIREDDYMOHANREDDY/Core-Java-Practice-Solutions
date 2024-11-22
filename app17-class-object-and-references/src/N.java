class N 
{
	void test()
	{
		System.out.println("from test");
	}
	static
	{
		System.out.println("sib begin");
		N n1 = new N();
		n1.test();
		System.out.println("sib end");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//with a refference  we call non static methods