interface A
{
	void test();
}
class  J implements A
{
	public void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		J obj = new J();
		obj.test();
		System.out.println("Hello World!");
	}
}
