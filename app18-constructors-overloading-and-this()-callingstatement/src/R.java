class R 
{
	R()
	{
		this(10, 20);
        System.out.println("R()");
	}
	R(int i, int j)
	{
		System.out.println("R(int, int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		R r1 = new R();
		System.out.println("----------");
		R r2 = new R(100, 30);
		System.out.println("----------");
		System.out.println("main begin");
	}
}
