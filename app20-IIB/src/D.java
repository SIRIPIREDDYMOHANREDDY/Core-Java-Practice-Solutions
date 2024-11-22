class D 
{
	D()
	{
		System.out.println("D()");
	}
	{
		System.out.println("D-IIB");
	}

	D(int i)
	{
		this();
		System.out.println("D(int)");
	}

	public static void main(String[] args) 
	{

		System.out.println("main begin");
		D d1 = new D();
		System.out.println("----------");
		D d2 = new D(20);
		System.out.println("main end");
	}
}
