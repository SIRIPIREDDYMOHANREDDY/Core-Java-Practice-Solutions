package pack1;
class  A
{
	private void test()
	{
		
	}
}
class H extends A
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		A a1 = new A();
		h1.test();
		a1.test();
		System.out.println("done");
	}
}
