interface A
{
	void test1();
	void test2();
	void test3();
}
class  K implements A
{
	public void test1()
	{
		System.out.println("K-test1");
	}
	public void test2()
	{
		System.out.println("K-test2");
	}
	public void test3()
	{
		System.out.println("K-test3");
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.test1();
		k1.test2();
		k1.test3();
		System.out.println("done");
	}
}
