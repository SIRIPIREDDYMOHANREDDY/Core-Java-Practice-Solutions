interface A
{
	void test1();
}
class  M implements A
{
	void test1()
	{
		System.out.println("A-test1");
	}
	public static void main(String[] args) 
	{
		M m1 = new M();
		m1.test1();
		System.out.println("Hello World!");
	}
}
