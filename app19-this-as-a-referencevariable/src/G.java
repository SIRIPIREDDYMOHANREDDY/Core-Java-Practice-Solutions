class G 
{
	int i;

	void test1()
	{
		System.out.println("test1:" + this.i);
		this.i += 5;
		this.test2();
		System.out.println("test1:" + this.i);
	}
	void test2()
	{
		System.out.println("test2:" + this.i);
		this.i += 15;
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.i += 20;
		System.out.println("main1:" + g1.i);
		g1.test1();
		System.out.println("main2:" + g1.i);
	}
}
