class M18 
{
	static A test()
	{
		A a1 = new D();
		return a1;
	}
	public static void main(String[] args) 
	{
		D d1 = (D) test();
		System.out.println("Hello World!");
	}
}
