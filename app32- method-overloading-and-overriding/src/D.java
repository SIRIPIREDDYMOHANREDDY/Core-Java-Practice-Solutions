class D    // overloaded methods can have same access level or different 
{
	private void test(int i, int j) 
	{
		System.out.println("test(int, int)");
	}
	protected int test(int i, double j)
	{
		System.out.println("test(int, double)");
		return 10;
	}
	public static void main(String[] args) 
	{
		D obj = new D();
		obj.test(10, 20);
		obj.test(1, 2.0);
		System.out.println("done");
	}
}
