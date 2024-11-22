class B 
{
	void test(int i, int j) // any method name (test(int i, intj)) is called signature
	{
		System.out.println("test(int, int)");
	}
	void test(int i, double j)
	{
		System.out.println("test(int, double)");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test(10, 20);
		b1.test(10, 2.0);
		System.out.println("done");
	}
}
