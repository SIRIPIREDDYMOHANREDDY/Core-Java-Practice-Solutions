class A
{
	void test1()
	{
		System.out.println("A-test1");
	}
}
class  H extends A
{
	int i;
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println(h1.i);
		h1.test1();
		h1.i = 40;
		System.out.println(h1.i);
	}
}
