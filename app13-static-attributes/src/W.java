class W 
{
	static int i = test1();
	static int j = test2();
	static int k = test3();
	static int test1()
	{
		System.out.println("from test1:" + i + "," + j + "," + k);
		return i + j + k + 10;
	}

	static int test2()
	{
		System.out.println("from test2:" + i + "," + j + "," + k);
		return i + j + k + 20;
	}

	static int test3()
	{
		System.out.println("from test3:" + i + "," + j + "," + k);
		return i + j + k + 30;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:" + i + "," + j + "," + k);
	}
}
