class D 
{
	D()
	{
		System.out.println("D-begin");
		int i = 10;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println("D-end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		D d1 = new D();
		System.out.println("----------");
		D d2 = new D();
		System.out.println("main-end");
	}
}
