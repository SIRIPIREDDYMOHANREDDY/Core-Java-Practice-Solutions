class I
{
	static int i = test();
	static
	{
		System.out.println("SIB1:" + i);
		main(null);
		System.out.println("SIB2:" + i);
		i += 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		i += 20;
	}
	public static int test() 
	{
		System.out.println("test1:" + i);
		i += 10;
		main(null);
		System.out.println("test2:" + i);
		return i + 20;
	}
}
