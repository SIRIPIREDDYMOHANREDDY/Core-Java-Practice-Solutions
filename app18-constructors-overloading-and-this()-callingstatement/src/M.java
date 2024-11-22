class M 
{
	M(int i, int j)
	{
		System.out.println("M(int, int)");
	}
	M(int i, double j)
	{
		System.out.println("M(int, double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		M m1 = new M(90, 1.5);
		System.out.println("----------");
		M m2 = new M(90, 22);
		System.out.println("----------");
		System.out.println("main end");
	}
}
