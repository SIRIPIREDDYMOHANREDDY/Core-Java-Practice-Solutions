class E 
{
	E()
	{
		this(90);
		System.out.println("E()");
	}
	E(int i)
	{
		this(90, 80);
		System.out.println("E(int)");
	}
	E(int i, int j)
	{
		System.out.println("E(int, int)");
	}
	{
		System.out.println("E-IIB");
	}
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		E e1 = new E();
		System.out.println("-----------");
		E e2 = new E(10);
		System.out.println("-----------");
		E e3 = new E(120, 30);
		System.out.println("-----------");
		System.out.println("main end");
	}
}
