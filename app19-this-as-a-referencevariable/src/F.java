class F 
{
	int i;

	void test()
	{

		System.out.println("test:" + this.i);
		this.i = 10;
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.i = 5;
		System.out.println("main1:" + f1.i);
		f1.test();
		System.out.println("main2:" + f1.i);
	}
}
