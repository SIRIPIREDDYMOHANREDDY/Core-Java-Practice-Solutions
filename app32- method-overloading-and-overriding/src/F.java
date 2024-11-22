class F     
{
	private void test(int i, int j) 
	{
		System.out.println("test(int, int)");
	}
	final static protected int test(int i, double j)
	{
		System.out.println("test(int, double)");
		return 10;
	}
	public static void main(String[] args) 
	{
		F obj = new F();
		obj.test(10, 20);
		obj.test(1, 2.0);
		System.out.println("done");
	}
}
